package Lecture1;
import java.util.*;
public class BasicsOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int prod = a*b;
        System.out.println(sum);
        System.out.println(prod);
        
        // area of circle
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
