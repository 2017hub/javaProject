package com.documendation.designpatterns.common;

/**
 * 打印*号图案
 */
public class PrintParrent {
            public static void main(String[] args){
               // getParrent(6);
               //getTriangle(6);
              // getRightTriangle(6);
                //getLeftTriangle();
               //getRhombus(4);
               // getHowllowRhombus();
            }

    /**
     * 打印倒等腰三角图案
     */
    public static  void getParrent(int n){

        for (int i = 1; i<=n ; i++) {

            for (int k=0 ; k<i;k++){
                System.out.print(" ");
            }
            for (int j =2*n-1; j >=2*i-1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     *打印正等腰三角
     */
    public static void getTriangle(int n){
        for (int i = 1; i <=n ; i++) {

            for (int j =n; j>i ; j--) {
                System.out.print(" ");
            }
            for (int k= 1; k<=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    /**
     * 打印直角靠右边
     * @param n
     */
    public static void getRightTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * 打印直角靠左边三角形
     */
    public static void getLeftTriangle(){
        for (int i = 1; i <6 ; i++) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    /**
     * 打印实心菱形
     */
    public static  void getRhombus(int n){
        for (int i = 1; i <=n+1 ; i++) {

            for (int j =n+1; j>i ; j--) {
                System.out.print(" ");
            }
            for (int k= 1; k<=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=n ; i++) {

            for (int k=0 ; k<i;k++){
                System.out.print(" ");
            }
            for (int j =2*n-1; j >=2*i-1;j--) {
                    System.out.print("*");
                }

            System.out.println();
            }
    }

    /**
     * 打印空心菱形
     * 上半部是偶数打印
     * 下半部是奇数打印
     */
    public static void getHowllowRhombus() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <5-i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                if (k == 0 || k ==2*i-2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * 4 - 1; k >= 2 * i - 1; k--) {

                if (k == 7 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
