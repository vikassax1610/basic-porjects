package com.company;
import java.util.*;
public class marks_calculator {
    public static void main(String[] args) {
        int []m=new int[5];
       int sum=0, per=0;

       Scanner sc =new Scanner(System.in);
       
       System.out.print("enter Appitude  mark- ");
        m[0] = sc.nextInt();
        System.out.print("enter Maths mark- ");
        m[1] = sc.nextInt();
        System.out.print("enter Reasoning mark- ");
        m[2] = sc.nextInt();
        System.out.print("enter English mark- ");
        m[3] = sc.nextInt();
        System.out.print("enter Codding mark- ");
        m[4] = sc.nextInt();
        System.out.println("================================================");
        System.out.print("your total marks= ");

        for (int i =0;i<m.length;i++) {
            sum = sum + m[i];   
            per=sum/5;    
        }
        System.out.println(sum);
        System.out.println("your percentage= "+per+"%");
        if (per>=60) {
            System.out.println("congro! first division");
        }
       else if(per>=45){
        System.out.println("congro! second division");
       } 
       else if(per>=33){
        System.out.println("congro! Third division");
       }
       else{
        System.out.println("sorry you are fail ");
       }
        
    }
}

