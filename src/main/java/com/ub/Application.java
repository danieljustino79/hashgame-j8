package com.ub;

import java.util.Scanner;

public class Application {

    static void staircase(int n){
        for(int line = 1; line < (n+1); line++){
            for(int column = 0; column < n; column++){
                if(column >= (n - line)){
                    System.out.print("#");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter value:");
        int n = scanner.nextInt();
        staircase(6);
        scanner.close();
    }
}
