import java.util.Scanner;

//add 2 mumber
public class add {

    public static void main(String[] args) {
        int a, b, c,d,e;
        System.out.println("ENETER ANY TWO NUMBERS");
        Scanner s= new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d=s.nextInt();
        e=a+b+c+d;  
    System.out.println("SUM OF TWO NUMBERS: "+e);

    }
}
