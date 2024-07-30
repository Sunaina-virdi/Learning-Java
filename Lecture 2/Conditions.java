package Lecture2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        
// else if
        int a = 5,b=1,c=2;
        if(a>b && a>c){
            System.out.println("A is largest");
        }
        else if(b>a && b>c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
// ternary
        int number = 3;
        String result = number >= 33? "Pass":"Fail";
        System.out.println(result);

// switch case
        int no = 7;
        switch(no){
            case 1: 
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("Pizza");
                break;
            default:
                System.out.println("We wake up");
        }

// calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = sc.nextInt();
        System.out.println("Enter Second: ");
        int second = sc.nextInt();
        System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(first+second);
                break;
            case '-':
                System.out.println(first-second);
                break;
            case '*':
                System.out.println(first*second);
                break;
            case '/':
                System.out.println(first/second);
                break;
            case '%':
                System.out.println(first%second);
                break;
            default:
                System.out.println("Wrong opreator");
       }   
    }
}
