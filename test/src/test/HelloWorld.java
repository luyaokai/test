package test;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}