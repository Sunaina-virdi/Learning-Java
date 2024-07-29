package Lecture1;

public class operations2 {
    public static void main(String[] args){
// Relational
        int a=20;
        int b = 10;
        System.out.println((b>a));
        System.out.println((b<a));
        System.out.println((b==a));
        System.out.println((b!=a));
        System.out.println((b<=a));

// logical 
        System.out.println((b>a) && (b==a));
        System.out.println((20>10) || (5 != 2));

// assignment
        int c = 5;
        c -= 2;
        System.out.println(c);
        int d = 7;
        d *= 2;
        System.out.println(d);
    }
    
}
