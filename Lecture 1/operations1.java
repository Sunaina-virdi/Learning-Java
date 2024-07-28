package Lecture1;

public class operations1 {
    public static void main(String args[]){
// arithmetic
        System.out.println("arithmetic"); 
        int A= 10;
        int B = 5;
        System.out.println("Add: "+ (A+B));
        System.out.println("Subtract: "+ (A-B));
        System.out.println("Multiply: "+ (A*B));
        System.out.println("Divide: "+ (A/B));
        System.out.println("Modulo: "+ (A % B));

// unary
        System.out.println("Unary operations");
        int e = 10;
        int f = ++e;
        System.out.println("pre increment");
        System.out.println(e);
        System.out.println(f);

        int c = 10;
        int d = c++;
        System.out.println("post increment");
        System.out.println(c);
        System.out.println(d);

        int i = 10;
        int j = --i;
        System.out.println("pre decrement");
        System.out.println(i);
        System.out.println(j);

        int g = 10;
        int h = g--;
        System.out.println("post decrement");
        System.out.println(g);
        System.out.println(h);

    }
}
