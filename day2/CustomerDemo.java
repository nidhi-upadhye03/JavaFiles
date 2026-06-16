package com.amc.day2;

import java.util.Scanner;

public class CustomerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Id : ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        String city = sc.nextLine();

        Customer c2 = new Customer(name, id, city);

        System.out.println("\nCustomer Details:");
        System.out.println(c2);

        sc.close();
    }
}
