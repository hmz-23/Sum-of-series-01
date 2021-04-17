package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int i, n, sum=0;
        System.out.println("Enter the number of terms:");
        n = sc.nextInt();

        for(i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
