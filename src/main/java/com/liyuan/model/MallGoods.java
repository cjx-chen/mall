package com.liyuan.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MallGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.primary_image
     *
     * @mbg.generated
     */
    private String primaryImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.brand_id
     *
     * @mbg.generated
     */
    private Integer brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.keywords
     *
     * @mbg.generated
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.brief
     *
     * @mbg.generated
     */
    private String brief;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.price
     *
     * @mbg.generated
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mall_goods.detail
     *
     * @mbg.generated
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.id
     *
     * @return the value of mall_goods.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.id
     *
     * @param id the value for mall_goods.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.name
     *
     * @return the value of mall_goods.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.name
     *
     * @param name the value for mall_goods.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.primary_image
     *
     * @return the value of mall_goods.primary_image
     *
     * @mbg.generated
     */
    public String getPrimaryImage() {
        return primaryImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.primary_image
     *
     * @param primaryImage the value for mall_goods.primary_image
     *
     * @mbg.generated
     */
    public void setPrimaryImage(String primaryImage) {
        this.primaryImage = primaryImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.brand_id
     *
     * @return the value of mall_goods.brand_id
     *
     * @mbg.generated
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.brand_id
     *
     * @param brandId the value for mall_goods.brand_id
     *
     * @mbg.generated
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.keywords
     *
     * @return the value of mall_goods.keywords
     *
     * @mbg.generated
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.keywords
     *
     * @param keywords the value for mall_goods.keywords
     *
     * @mbg.generated
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.brief
     *
     * @return the value of mall_goods.brief
     *
     * @mbg.generated
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.brief
     *
     * @param brief the value for mall_goods.brief
     *
     * @mbg.generated
     */
    public void setBrief(String brief) {
        this.brief = brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.price
     *
     * @return the value of mall_goods.price
     *
     * @mbg.generated
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.price
     *
     * @param price the value for mall_goods.price
     *
     * @mbg.generated
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.update_time
     *
     * @return the value of mall_goods.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.update_time
     *
     * @param updateTime the value for mall_goods.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.category_id
     *
     * @return the value of mall_goods.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.category_id
     *
     * @param categoryId the value for mall_goods.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mall_goods.detail
     *
     * @return the value of mall_goods.detail
     *
     * @mbg.generated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mall_goods.detail
     *
     * @param detail the value for mall_goods.detail
     *
     * @mbg.generated
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", primaryImage=").append(primaryImage);
        sb.append(", brandId=").append(brandId);
        sb.append(", keywords=").append(keywords);
        sb.append(", brief=").append(brief);
        sb.append(", price=").append(price);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", detail=").append(detail);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MallGoods other = (MallGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrimaryImage() == null ? other.getPrimaryImage() == null : this.getPrimaryImage().equals(other.getPrimaryImage()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrimaryImage() == null) ? 0 : getPrimaryImage().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table mall_goods
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        primaryImage("primary_image", "primaryImage", "VARCHAR", false),
        brandId("brand_id", "brandId", "INTEGER", false),
        keywords("keywords", "keywords", "VARCHAR", false),
        brief("brief", "brief", "VARCHAR", false),
        price("price", "price", "REAL", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        categoryId("category_id", "categoryId", "INTEGER", false),
        detail("detail", "detail", "LONGVARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table mall_goods
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}