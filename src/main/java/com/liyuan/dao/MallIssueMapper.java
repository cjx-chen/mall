package com.liyuan.dao;

import com.liyuan.model.MallIssue;
import com.liyuan.model.MallIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallIssueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    long countByExample(MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int deleteByExample(MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int insert(MallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int insertSelective(MallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    MallIssue selectOneByExample(MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    MallIssue selectOneByExampleSelective(@Param("example") MallIssueExample example, @Param("selective") MallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    MallIssue selectOneByExampleWithBLOBs(MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    List<MallIssue> selectByExampleSelective(@Param("example") MallIssueExample example, @Param("selective") MallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    List<MallIssue> selectByExampleWithBLOBs(MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    List<MallIssue> selectByExample(MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    MallIssue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    MallIssue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallIssue record, @Param("example") MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") MallIssue record, @Param("example") MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallIssue record, @Param("example") MallIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(MallIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_issue
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallIssue record);
}