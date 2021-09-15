package com.zhh.practice.base;

/**
 * @description:
 * @see:com.zhh.practice.base
 * @author:zhh
 * @createTime:2021-09-06 15:55
 * @version:1.0
 */
public class BoxIngOrUnBoxing {

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Long g = 3L;
        Long h = 2L;


        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
        System.out.println((a+h));

    }

}
