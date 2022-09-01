package com.lily.base;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author caohu
 * @since 2022/5/7
 * Andy-myBatis-study
 */
public class TestBigDecimal {

    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("5.2394");
        System.out.println(decimal.setScale(0, RoundingMode.HALF_UP));

    }

}
