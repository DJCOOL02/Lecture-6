package com.divyanshu6;
import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which plandrome number lasts ");
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++){
            for(int j= 1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i; j++){
                System.out.print(i-j+1);
            }
            for(int j=1 ; j<=i ; j++){
                if(j>1){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
