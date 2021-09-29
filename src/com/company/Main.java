package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("even, odd or standard?");
        String type = input.next();
        System.out.println("Enter the number!!");
        int number = input.nextInt();
        String list = "";
        if (type.equals("standard")) {
            for (int i = 1; i < (number + 1); i++) {
                list = list + i;
                System.out.println(list);
            }for (int i = 1; i < (number + 1); i++) {
                list = list.substring(0, list.length() - 1);
                System.out.println(list);
            }
        } else if (type.equals("odd")) {
            for (int i = 1; i < (number + 1); i++) {
                if ((i % 2) == 1) {
                    list = list + i;
                    System.out.println(list);
                }
            }for (int i = 1; i < (number + 1); i++) {
                while (list.length() > 0){
                    list = list.substring(0, list.length() - 1);
                    System.out.println(list);
            }
            }
        }else if (type.equals("even")) {
            for (int i = 1; i < (number + 1); i++) {
                if ((i % 2) == 0) {
                    list = list + i;
                    System.out.println(list);
                }
            }for (int i = 1; i < (number + 1); i++) {
                while (list.length() > 0){
                    list = list.substring(0, list.length() - 1);
                    System.out.println(list);
                }
            }
        }else{
            System.out.println("Sorry that statement was invalid. PLease use the words 'even', 'odd', or 'standard'");
        }

    }
}
