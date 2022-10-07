package com.divyanshu6;
import java.util.*;
public class pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int m = sc.nextInt();
        // UPPER PART
        //1st Part(Upper part)
        for(int i = 1 ; i<=m ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            int spaces = 2*(m-i);
            for(int j = 1 ; j<=spaces ; j++){
                System.out.print(" ");
            }
            //2nd Part(Upper part)
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // LOWER PART
        // 1st Part(Lower Part)
        for(int i = m ; i>=1 ; i-- ){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            int spaces = 2*(m-i);
            for(int j = 1; j<=spaces ;j++){
                System.out.print(" ");
            }
            // 2nd Part(Lower Part)
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
