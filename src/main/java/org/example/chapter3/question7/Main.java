package org.example.chapter3.question7;


import java.util.Scanner;

public class Main {


    public static void insertionSort(int[] data){
        for (int i = 1; i < data.length; i++) {
            int p = i;
            int item = data[i];
            while (p > 0 && item < data[p-1]){
                data[p] = data[p-1];
                p = p-1;
            }
            data[p] = item;
        }
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
