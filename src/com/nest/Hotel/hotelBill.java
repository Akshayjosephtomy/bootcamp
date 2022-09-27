package com.nest.Hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class hotelBill {

    public static void main(String[] args) {
        int choice;
        int n;
        String Name;

        ArrayList<String>  item = new ArrayList<>();
        ArrayList<Integer>  quantity = new ArrayList<>();
        ArrayList<Integer> price=new ArrayList<>();
        FoodItems foodItems=new FoodItems(10,20,30,450,550);
        FoodItems takeAway=new FoodItems(15,25,35,460,560);


        HashMap<String,String> map=new HashMap<String,String>();
        ArrayList<String> transactionList= new ArrayList<>();

        outer:while (true){
            System.out.println("1. Dine in");
            System.out.println("2. Takeaway");
            System.out.println("3. view Transactions");
            System.out.println("4. Exit");

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
                                int random=((int)(Math.random()*9000)+1000);
                                System.out.println("Enter your name ");
                                Name=s.next();
                                System.out.println("**********Bill**********");
                                System.out.println("   Invoice No "+random);
                                int sum = 0;
                                for (int i = 0; i <= item.size() - 1; i++) {
                                    System.out.println(item.get(i) + "  " + quantity.get(i) + "    :Rs." + price.get(i));
                                    sum += price.get(i);
                                }
                                System.out.println("Total Amount is Rs: " + sum);
                                map.put("Invoice No",String.valueOf(random));
                                map.put("Name",Name);
                                map.put("Amount",String.valueOf(sum));
                                map.put("Mode","Dine in");
                                transactionList.add(String.valueOf(map));
                                item.clear();
                                quantity.clear();
                                price.clear();
                                break;
                            case 7:
                                continue outer;
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
                    int random=((int)(Math.random()*9000)+1000);
                    System.out.println("Enter your name");
                    Name=s.next();
                    System.out.println("**********Bill**********");
                    System.out.println("   Invoice No "+random);
                    int sum = 0;
                    for (int i = 0; i <= item.size()-1; i++) {
                        System.out.println(item.get(i)+"  "+quantity.get(i)+"    :Rs."+price.get(i));
                        sum += price.get(i);
                    }
                    System.out.println("Total Amount is Rs: "+sum);
                    map.put("Invoice No",String.valueOf(random));
                    map.put("Name",Name);
                    map.put("Amount",String.valueOf(sum));
                    map.put("Mode","Takeaway");
                    transactionList.add(String.valueOf(map));
                    item.clear();
                    quantity.clear();
                    price.clear();
                    break;
                case 7:
                    continue outer;
                default:
                    System.out.println("Please enter valid input");
            }}
            case 3:
                System.out.println("Transaction List");
                for (int i=0;i<transactionList.size(); i++){
                System.out.println(transactionList.get(i));
            }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid input");

        }
        }

    }
}
