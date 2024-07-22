package Lecture1;
import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String input = sc.next();  //next sirf space tak work krta h(word)
        String input = sc.nextLine(); //nextline for full line
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();  //integer k ly nextInt()
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
    }
}
