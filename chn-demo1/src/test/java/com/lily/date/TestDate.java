package com.lily.date;

import cn.hutool.core.date.DateUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author hncao
 * @since 2022/4/25
 */
public class TestDate {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(2022,Calendar.APRIL,25);
        Date applyDate = instance.getTime();
        Date now = new Date();
        System.out.println(DateUtil.betweenDay(now, applyDate, false));
    }


}
