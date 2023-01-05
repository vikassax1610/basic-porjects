package com.company;
import java.util.*;
public class addpatt_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");  
        int n = sc.nextInt();
        System.out.println("here is your result");
        for (int i =1; i<=n; i++) {
            for (int k =1; k <=n-i; k++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
                
            }
           
            System.out.println();
            
        }
       


    }
}
