package com.documendation.designpatterns.commonUtils;

public class ArrayRowColumnSwap {
    public static void main(String[] args) {

        int[][] arr = {{1, 23, 35}, {12, 56, 76}, {21, 67, 89}};
        pringArr(arr);
        System.out.println("------->交换前");

        int[][] arr2 = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = arr[j][i];
            }
        }

        pringArr(arr2);
    }

    public static void pringArr(int arr[][]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
