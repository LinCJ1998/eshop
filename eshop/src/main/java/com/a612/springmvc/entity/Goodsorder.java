package com.a612.springmvc.entity;

import java.util.Date;

public class Goodsorder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.user_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_date
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Date orderDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_price
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private Float orderPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_message
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String orderMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_addressee
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String orderAddressee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_address
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String orderAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_phone
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String orderPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorder.order_status
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    private String orderStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsorder
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Goodsorder(Integer orderId, Integer userId, Date orderDate, Float orderPrice, String orderMessage, String orderAddressee, String orderAddress, String orderPhone, String orderStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderMessage = orderMessage;
        this.orderAddressee = orderAddressee;
        this.orderAddress = orderAddress;
        this.orderPhone = orderPhone;
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodsorder
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Goodsorder() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_id
     *
     * @return the value of goodsorder.order_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_id
     *
     * @param orderId the value for goodsorder.order_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.user_id
     *
     * @return the value of goodsorder.user_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.user_id
     *
     * @param userId the value for goodsorder.user_id
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_date
     *
     * @return the value of goodsorder.order_date
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_date
     *
     * @param orderDate the value for goodsorder.order_date
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_price
     *
     * @return the value of goodsorder.order_price
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public Float getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_price
     *
     * @param orderPrice the value for goodsorder.order_price
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_message
     *
     * @return the value of goodsorder.order_message
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getOrderMessage() {
        return orderMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_message
     *
     * @param orderMessage the value for goodsorder.order_message
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_addressee
     *
     * @return the value of goodsorder.order_addressee
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getOrderAddressee() {
        return orderAddressee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_addressee
     *
     * @param orderAddressee the value for goodsorder.order_addressee
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderAddressee(String orderAddressee) {
        this.orderAddressee = orderAddressee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_address
     *
     * @return the value of goodsorder.order_address
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getOrderAddress() {
        return orderAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_address
     *
     * @param orderAddress the value for goodsorder.order_address
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_phone
     *
     * @return the value of goodsorder.order_phone
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getOrderPhone() {
        return orderPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_phone
     *
     * @param orderPhone the value for goodsorder.order_phone
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorder.order_status
     *
     * @return the value of goodsorder.order_status
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorder.order_status
     *
     * @param orderStatus the value for goodsorder.order_status
     *
     * @mbggenerated Mon May 06 00:20:56 CST 2019
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}