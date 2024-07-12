import java.util.Scanner;

public class tablee {
    public static void main(String[] args) {

        int a, b;
        System.out.println("ENTER THE NUMBER WHICH YOU WANT TO TABLE !");
        Scanner  saim= new Scanner (System.in);//WITH THE HELP OF THIS WE CAN STORE INPUT VALUE
a=saim. nextInt();//ITS MEAN THE VALUE OF saim IS STORE IN a
for(b=1;b<=10;b++)
{
   
    System.out.println(a*b);
}
    }
}
