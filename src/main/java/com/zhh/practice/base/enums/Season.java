package com.zhh.practice.base.enums;

/**
 * @description:
 * @see:com.zhh.practice.base.enums
 * @author:zhh
 * @createTime:2022-06-08 14:19
 * @version:1.0
 */
public enum Season {

    SPRING(0,"spring"),SUMMER(1,"summer"),AUTUMN(2,"autumn"),WINTER(3,"winter");

    private int value;

    private String lab;

    private Season(int value,String lab){
        this.value = value;
        this.lab = lab;
    }

    public static Season getNextSeason(Season nowSeason){
        int nextDayValue = nowSeason.value;
        if(++nextDayValue == 3){
            nextDayValue = 0;
        }
        return getSeasonByValue(nextDayValue);
    }

    public static Season getSeasonByValue(int value){
        for(Season s : Season.values()){
            if(s.value == value){
                return s;
            }
        }
        return null;
    }

}

class Test{
    public static void main(String[] args){
        System.out.println("nowSeason->"+Season.SPRING+", value->"+Season.SPRING.ordinal());
        System.out.println("nextSeason->"+Season.getNextSeason(Season.SPRING));

        System.out.println(Season.valueOf("spring".toUpperCase()));
    }
}
