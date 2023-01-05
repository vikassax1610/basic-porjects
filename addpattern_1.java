package com.company;
import java.util.*;
public class addpattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        System.out.println("here is your result");
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            for (int k = 1; k<=2*(n-i); k++) {
                System.out.print(" ");
                
            }
            for (int l = 1; l <=i; l++) {
                System.out.print("*");
                
            }

            System.out.println();
            
        }
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            for (int k = 1; k<=2*(n-i); k++) {
                System.out.print(" ");
                
            }
            for (int l = 1; l <=i; l++) {
                System.out.print("*");
                
            }

            System.out.println();
            
        }

    }
}
