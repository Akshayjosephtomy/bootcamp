package com.nest.Hotel;

import java.util.ArrayList;
import java.util.Scanner;


public class hotelBill {

    public static void main(String[] args) {
        int choice;
        ArrayList<String>  item = new ArrayList<>();
        ArrayList<Integer>  quantity = new ArrayList<>();
        ArrayList<Integer> price=new ArrayList<>();

        while (true){
            System.out.println("Enter your choice:");
            System.out.println("1. Tea : Rs.10");
            System.out.println("2. Coffee : Rs.20");
            System.out.println("3. Lime Juice : Rs.30");
            System.out.println("4. BBQ Full : Rs.450");
            System.out.println("5. Alfaham Full : Rs.550");
            System.out.println("6. Print Bill");
            System.out.println("7. Exit");

            Scanner s=new Scanner(System.in);
            choice=s.nextInt();
            int n;

            switch (choice){
                case 1:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Tea");
                    quantity.add(n);
                    price.add(n*10);
                    break;
                case 2:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Coffee");
                    quantity.add(n);
                    price.add(n*20);
                    break;
                case 3:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Lime Juice");
                    quantity.add(n);
                    price.add(n*30);
                    break;
                case 4:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("BBQ Full");
                    quantity.add(n);
                    price.add(n*450);
                    break;
                case 5:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Alfaham");
                    quantity.add(n);
                    price.add(n*550);
                    break;
                case 6:
                    System.out.println("******Bill******");
                    int sum = 0;
                    for (int i = 0; i <= item.size()-1; i++) {
                        System.out.println(item.get(i)+"  "+quantity.get(i)+"  :Rs."+price.get(i));
                        sum += price.get(i);
                    }
                    System.out.println("Total Amount is Rs: "+sum);
                    System.exit(0);
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
