package com.documendation.designpatterns.commonUtils;

import java.util.Scanner;

/**
 * 判断是否是闰年
 */
public class LeapYear {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        int leapYear=getLeapYear(year);

    }

    /**
     * 判断是否是闰年
     * @param year 年份
     * @return
     */
    public static int getLeapYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是润年！");
        }else {
            System.out.println(year+"不是闰年！");
        }
        return year;
    }
}
