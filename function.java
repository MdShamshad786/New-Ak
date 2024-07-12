import java.util.Scanner;
public class function {
    public static int sumoftwonumber(int a,int b){

        int c =a+b;
    return c;
    }
    public static void main(String[] args) {
        System.out.println("ENTER YOUR 1st NUMBER");
        Scanner sk=new Scanner(System.in);
        int a=sk.nextInt();
        System.out.println("ENTER YOUR 2nd NUMBER");
        int b=sk.nextInt();
        int c=sumoftwonumber(a,b);
        System.out.println("THE ADDITION OF " +a+ " + " +b+ " = "+c);
        System.out.println("THE ADDITION OF TWO NUMER IS "+c);
       
    }
    
}
