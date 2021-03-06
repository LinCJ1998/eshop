package com.a612.springmvc.entity;

import java.util.Date;

public class Userinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.user_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.user_name
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.user_pwd
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String userPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.user_email
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.user_sex
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String userSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.user_registetime
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Date userRegistetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.user_lastdate
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Date userLastdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Userinfo(Integer userId, String userName, String userPwd, String userEmail, String userSex, Date userRegistetime, Date userLastdate) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userEmail = userEmail;
        this.userSex = userSex;
        this.userRegistetime = userRegistetime;
        this.userLastdate = userLastdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Userinfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.user_id
     *
     * @return the value of userinfo.user_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.user_id
     *
     * @param userId the value for userinfo.user_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.user_name
     *
     * @return the value of userinfo.user_name
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.user_name
     *
     * @param userName the value for userinfo.user_name
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.user_pwd
     *
     * @return the value of userinfo.user_pwd
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.user_pwd
     *
     * @param userPwd the value for userinfo.user_pwd
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.user_email
     *
     * @return the value of userinfo.user_email
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.user_email
     *
     * @param userEmail the value for userinfo.user_email
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.user_sex
     *
     * @return the value of userinfo.user_sex
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.user_sex
     *
     * @param userSex the value for userinfo.user_sex
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.user_registetime
     *
     * @return the value of userinfo.user_registetime
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Date getUserRegistetime() {
        return userRegistetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.user_registetime
     *
     * @param userRegistetime the value for userinfo.user_registetime
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserRegistetime(Date userRegistetime) {
        this.userRegistetime = userRegistetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.user_lastdate
     *
     * @return the value of userinfo.user_lastdate
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Date getUserLastdate() {
        return userLastdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.user_lastdate
     *
     * @param userLastdate the value for userinfo.user_lastdate
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserLastdate(Date userLastdate) {
        this.userLastdate = userLastdate;
    }
}