package Lecture2;
import java.util.Scanner;

public class Loops3 {
    public static void main(String args[]){
    
// check if number is prime or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("n is prime");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");
            }
        }
// odd and even sum
        Scanner dig = new Scanner(System.in);
        int num = dig.nextInt();
        int oddSum = 0;
        int EvenSum = 0;
        for(int i=1;i<=num;i+=2){
            oddSum += i;
        }
        for(int i=2;i<num;i+=2){
            EvenSum += i;
        }
        System.out.println(oddSum);
        System.out.println(EvenSum);

// print the multiplication table of num
        Scanner table = new Scanner(System.in);
        int table_i = table.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table_i + "*" + i + "= " + table_i*i);
        }
    }
    
}
