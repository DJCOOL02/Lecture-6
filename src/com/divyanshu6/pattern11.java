package com.divyanshu6;
import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rombus dimension ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            int spaces1 = n-i;
            for(int j = 1; j<=spaces1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
