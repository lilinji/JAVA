package com.atguigu.cloud.entities;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/**
 * @Author: Linji Li
 * @Date: 2024/9/10 17:28
 * @Version: v1.0.0
 * @Description: TODO
 **/





public class TestTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(now.format(formatter));

    }
}