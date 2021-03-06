package com.a612.springmvc.entity;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_name
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_pwd
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String adminPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_level
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Integer adminLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Admin(Integer adminId, String adminName, String adminPwd, Integer adminLevel) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPwd = adminPwd;
        this.adminLevel = adminLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Admin() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_id
     *
     * @return the value of admin.admin_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_id
     *
     * @param adminId the value for admin.admin_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_name
     *
     * @return the value of admin.admin_name
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_name
     *
     * @param adminName the value for admin.admin_name
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_pwd
     *
     * @return the value of admin.admin_pwd
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getAdminPwd() {
        return adminPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_pwd
     *
     * @param adminPwd the value for admin.admin_pwd
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_level
     *
     * @return the value of admin.admin_level
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Integer getAdminLevel() {
        return adminLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_level
     *
     * @param adminLevel the value for admin.admin_level
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setAdminLevel(Integer adminLevel) {
        this.adminLevel = adminLevel;
    }
}