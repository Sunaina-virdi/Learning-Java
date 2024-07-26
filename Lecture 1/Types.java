package Lecture1;

public class Types {
/*TYPE CONVERSION (WIDENING)/(IMPLICIT) happens when:
      a) type compatible
      b) destination type > source type

      byte->short->int->float->long->double
     */
    public static void main(String[] args){
        //int can be converted to long but not vice-versa
        int a = 25; //4byte
        long b = a; //8byte
        System.out.println(b);


// TYPE CASTING (NARROWING)/(EXPLICIT)
        float c = 28.12f;
        int d = (int) c;
        System.out.println(d);

        char ch = 'd';
        int number = ch;
        System.out.println(number);

//TYPE PROMOTION
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println((int) ch1);
        System.out.println((int) ch2);
        System.out.println(ch2 - ch1);

        // byte new = 5;
        // byte last = (byte) (new*2);
        // System.out.println(last);
    }
}
