package com.nest.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice;
        while (true)
        {
            System.out.println("Select an option");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();

            System.out.println("Enter the Numbers : ");
            int a= scanner.nextInt();
            int b= scanner.nextInt();

            switch (choice)
            {
                case 1 :
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    try {
                        System.out.println(a / b);
                    }
                    catch (ArithmeticException ae) {
                        System.out.println("Division by zero is not possible");

                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
