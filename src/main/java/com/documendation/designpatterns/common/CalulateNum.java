package com.documendation.designpatterns.common;

import java.util.Arrays;

/**
 * 计算数
 */
public class CalulateNum {

public static void main(String[] args) {
//    int a=796;
//    int b=a/100;
//    int c=a/10%10;
//    int d=a%100%10;
//    System.out.println("一个三位数："+a);
//    System.out.println("---->百位数："+b);
//    System.out.println("---->十位数："+c);
//    System.out.println("---->个位数："+d);
//        getSXHS();

    // getWanShu();
    getForth();

}





    /**
     * 水仙花数：一个三位数等于它的位数的立方之和打印错所有的水仙花数
     */

    public static void getSXHS(){
        for (int i = 100; i <1000 ; i++) {

            int num=(i/100)*(i/100)*(i/100)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%1000%10)*(i%1000%10)*(i%1000%10);
           // System.out.println("----->"+num);
            if(num==i){
                System.out.println("水仙花数："+i);
            }
        }
    }

    /**
     * 写出1000以内的完数
     */
    public static void getWanShu(){


        for (int i = 1; i <=1000 ; i++) {
            int sum=0;
            for (int j = 1;j<=i/2 ; j++) {
                if(i%j==0){
                    sum=sum+j;
                   // System.out.println("--执行加法之后--->"+sum);
                }
            }

            if(sum==i){
                System.out.println("1000以内的完数："+i);
            }
        }

    }

    /**
     * 一个四位数，它的数字组合最大数减去它的数字组合最小数等于这个四位数的数字组合中的一个四位数。
     */
public static void getForth(){
    int[] arr=new int[4];
    int max=0;
    int min=0;
    for (int i = 1000; i <10000 ; i++) {//找出所有的四位数
        int temp=i;
        for (int j = 0; j <arr.length ; j++) {//把四位数的数字拆分，然后存如数组当中
                arr[j]=temp%10;
                temp=temp/10;
        }
        Arrays.sort(arr);//把数组从小到达排序

        //找出数字组合的最大值,因为数组元素从小到大排序了。
       max =arr[3]*1000+arr[2]*100+arr[1]*10+arr[0];
       // System.out.println("max="+max);

       //找出最小值,如果千位数是0，则要进行交换数组元素。
        int num=0;
        for (int k =1; k <arr.length ; k++) {
            if(arr[0]==0){
                num=arr[0];
                arr[0]=arr[k];
                arr[k]=num;

            }

        }
        //最小值
        min=arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
        //  System.out.println("min="+min);

        //最大值减去最小值看看是否等于本身
       if(max-min==i){
           System.out.println("这是一个四位数："+i);
           System.out.println("最大值："+max);
           System.out.println("最小值："+min);
       }
    }
}


}



















