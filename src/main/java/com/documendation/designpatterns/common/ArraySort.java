package com.documendation.designpatterns.common;

/**
 * 数组排序
 */
public class ArraySort {

    //冒泡：由大到小排序
    public static void arrSort(){
        int[] arr={1,7,3,89,230,0,45,67};
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //排序后的输出数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("--->排序后："+arr[i]);
        }
    }
}
