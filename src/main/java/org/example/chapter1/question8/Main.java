package org.example.chapter1.question8;

import java.util.Scanner;

public class Main {

    public static void selectionSort(int[] data){
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }

            // swap
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int q = sc.nextInt();
        int[] question =new int[q];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            question[i] = sc.nextInt();
        }

        selectionSort(arr);


        for(int ques : question){
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                if (ques > arr[i]){
                    result++;
                }
            }
            System.out.println(result);
        }


    }
}
