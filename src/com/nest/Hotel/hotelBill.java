package com.nest.Hotel;

import java.util.ArrayList;
import java.util.Scanner;


public class hotelBill {

    public static void main(String[] args) {
        int choice;
        int n;
        ArrayList<String>  item = new ArrayList<>();
        ArrayList<Integer>  quantity = new ArrayList<>();
        ArrayList<Integer> price=new ArrayList<>();
        FoodItems foodItems=new FoodItems(10,20,30,450,550);
        FoodItems takeAway=new FoodItems(15,25,35,460,560);


            System.out.println("1. Dining");
            System.out.println("2. Takeaway");
            System.out.println("3. Exit");

            Scanner s=new Scanner(System.in);
            choice=s.nextInt();
        switch (choice){


                case 1:
                    while (true) {
                        System.out.println("Enter your choice:");
                        System.out.println("1. Tea           : Rs." + foodItems.getTea());
                        System.out.println("2. Coffee        : Rs." + foodItems.getCoffee());
                        System.out.println("3. Lime Juice    : Rs." + foodItems.getJuice());
                        System.out.println("4. BBQ Full      : Rs." + foodItems.getBBQ());
                        System.out.println("5. Alfaham Full  : Rs." + foodItems.getAlfaham());
                        System.out.println("6. Print Bill");
                        System.out.println("7. Exit");

                        choice = s.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter Quantity");
                                n = s.nextInt();
                                item.add("Tea");
                                quantity.add(n);
                                price.add(n * foodItems.getTea());
                                break;
                            case 2:
                                System.out.println("Enter Quantity");
                                n = s.nextInt();
                                item.add("Coffee");
                                quantity.add(n);
                                price.add(n * foodItems.getCoffee());
                                break;
                            case 3:
                                System.out.println("Enter Quantity");
                                n = s.nextInt();
                                item.add("Lime Juice");
                                quantity.add(n);
                                price.add(n * foodItems.getJuice());
                                break;
                            case 4:
                                System.out.println("Enter Quantity");
                                n = s.nextInt();
                                item.add("BBQ Full");
                                quantity.add(n);
                                price.add(n * foodItems.getBBQ());
                                break;
                            case 5:
                                System.out.println("Enter Quantity");
                                n = s.nextInt();
                                item.add("Alfaham");
                                quantity.add(n);
                                price.add(n * foodItems.getAlfaham());
                                break;
                            case 6:
                                System.out.println("**********Bill**********");
                                int sum = 0;
                                for (int i = 0; i <= item.size() - 1; i++) {
                                    System.out.println(item.get(i) + "  " + quantity.get(i) + "    :Rs." + price.get(i));
                                    sum += price.get(i);
                                }
                                System.out.println("Total Amount is Rs: " + sum);
                                System.exit(0);
                            case 7:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Please enter valid input");
                        }
                    }


            case 2:
                while (true){
                System.out.println("Enter your choice:");
                System.out.println("1. Tea           : Rs."+takeAway.getTea());
                System.out.println("2. Coffee        : Rs."+takeAway.getCoffee());
                System.out.println("3. Lime Juice    : Rs."+takeAway.getJuice());
                System.out.println("4. BBQ Full      : Rs."+takeAway.getBBQ());
                System.out.println("5. Alfaham Full  : Rs."+takeAway.getAlfaham());
                System.out.println("6. Print Bill");
                System.out.println("7. Exit");


            choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Tea");
                    quantity.add(n);
                    price.add(n*takeAway.getTea());
                    break;
                case 2:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Coffee");
                    quantity.add(n);
                    price.add(n*takeAway.getCoffee());
                    break;
                case 3:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Lime Juice");
                    quantity.add(n);
                    price.add(n*takeAway.getJuice());
                    break;
                case 4:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("BBQ Full");
                    quantity.add(n);
                    price.add(n*takeAway.getBBQ());
                    break;
                case 5:
                    System.out.println("Enter Quantity");
                    n= s.nextInt();
                    item.add("Alfaham");
                    quantity.add(n);
                    price.add(n*takeAway.getAlfaham());
                    break;
                case 6:
                    System.out.println("**********Bill**********");
                    int sum = 0;
                    for (int i = 0; i <= item.size()-1; i++) {
                        System.out.println(item.get(i)+"  "+quantity.get(i)+"    :Rs."+price.get(i));
                        sum += price.get(i);
                    }
                    System.out.println("Total Amount is Rs: "+sum);
                    System.exit(0);
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid input");
            }}
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid input");

        }
    }
}
