package com.andy.nan.entity;

import lombok.Data;

/**
 * @author caohu
 * @since 2022/5/12
 * Andy-myBatis-study
 */
@Data
public class Order {

    private String orderNo;
    private String address;

    public Order(String orderNo, String address) {
        this.orderNo = orderNo;
        this.address = address;
    }
}
