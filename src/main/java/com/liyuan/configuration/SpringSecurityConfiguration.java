package com.liyuan.configuration;

import com.liyuan.component.security.JsonUsernamePasswordAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        jsr250Enabled = true,
        securedEnabled = true
)
public class SpringSecurityConfiguration {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Primary
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


    @Configuration
    @Order(1)
    public static class ClientSpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
        @Autowired
        @Qualifier("userServiceImpl")
        private UserDetailsService userService;
        @Autowired
        private AuthenticationFailureHandler authenticationFailureHandler;
        @Autowired
        private AuthenticationSuccessHandler authenticationSuccessHandler;

        @Bean
        public JsonUsernamePasswordAuthenticationFilter jsonUsernamePasswordAuthenticationFilter() throws Exception {
            JsonUsernamePasswordAuthenticationFilter filter = new JsonUsernamePasswordAuthenticationFilter();
            filter.setAuthenticationManager(authenticationManagerBean());
            filter.setFilterProcessesUrl("/client/login");
            filter.setAuthenticationSuccessHandler(authenticationSuccessHandler);
            filter.setAuthenticationFailureHandler(authenticationFailureHandler);
            return filter;
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.addFilterAt(jsonUsernamePasswordAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
            http.csrf().disable().
                    antMatcher("/client/**").formLogin()
                    .and().authorizeRequests().anyRequest().permitAll();
            http.userDetailsService(userService);
        }

    }

    @Configuration
    public static class AdministratorSpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
        @Autowired
        @Qualifier("administratorServiceImpl")
        private UserDetailsService userService;
        @Autowired
        private AuthenticationFailureHandler authenticationFailureHandler;
        @Autowired
        private AuthenticationSuccessHandler authenticationSuccessHandler;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable().
                    antMatcher("/admin/**").
                    formLogin().loginProcessingUrl("/admin/login")
                    .successHandler(authenticationSuccessHandler)
                    .failureHandler(authenticationFailureHandler)
                    .and().authorizeRequests().anyRequest().permitAll();
            http.userDetailsService(userService);
        }
    }


}
