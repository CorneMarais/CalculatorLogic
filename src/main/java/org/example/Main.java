package org.example;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        double a;
        double b;

        char operation;

        Scanner keyBoard = new Scanner(System.in);

        System.out.println("Enter first number");

        a = keyBoard.nextDouble();

        System.out.println("Enter the operation");

        operation = keyBoard.next().charAt(0);

        System.out.println("Enter second number");

        b = keyBoard.nextDouble();


        //Add
        if (operation == '+'){
            System.out.println(a + b);
        }
        //Subtract
        if (operation == '-'){
            System.out.println(a - b);
        }
        //Multiply
        if (operation == '*'){
            System.out.println(a * b);
        }
        //Divide
        if (operation == '/'){
            System.out.println(a / b);
        }

















    }
}