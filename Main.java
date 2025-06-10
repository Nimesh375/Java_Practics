package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int balance = 1000;
        Scanner X = new Scanner(System.in);
        int choice = 0;


            System.out.println("----- ATM MENU -----");
            System.out.println("Enter Pin ");
            int pin = X.nextInt();
            if (pin== 1234){
                while (choice !=4) {
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = X.nextInt();



                switch (choice) {
                    case 1:
                        System.out.println("Your Balance is " + balance);
                        break;

                    case 2:
                        System.out.println("Enter deposit amount: ");
                        int deposit = X.nextInt();
                        balance = balance + deposit;
                        System.out.println("New balance is " + balance);
                        break;
                    case 3:
                        System.out.println("Enter withdraw amount: ");
                        int withdraw = X.nextInt();
                        balance = balance - withdraw;
                        System.out.println("New balance is " + balance);
                        break;
                    case 4:
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                }
            }else {
                    System.out.println("Wrong pin");
                }
            }
        }

