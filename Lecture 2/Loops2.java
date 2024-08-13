package Lecture2;

import java.util.Scanner;

public class Loops2 {
    public static void main(String args[]){

    // do while loop
        int counter = 1;
        do{
            System.out.println("Hello World!!");
            counter++;
        }while(counter <= 10);

    // break statement -> to exit the loop
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");

    // keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Enter you number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                System.out.println("Oops! you entered multiple of 10");
                break;
            }
            System.out.println(num);
        } while (true);

    // continue keyword -> to skip an iteration
    System.out.println("\ncontinue keyword");
        for(int i=0;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    // display all numbers entered by user except multiples of 10
        // this code will never end    
        Scanner dig = new Scanner(System.in);
        do { 
            System.out.println("Enter you digit: ");
            int digit = dig.nextInt();
            if(digit % 10 == 0)
            {
                continue;
            }
            System.out.println(digit);
        } while (true);
    
    }      
}

