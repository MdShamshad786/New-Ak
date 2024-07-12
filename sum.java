// //write a program to add the three number 
// public class sum {
//     public static void main(String args[]){
//         int num1=5,num2=50,num3=10;
//         int sum=num1+num2+num3;
//         System.out.print("the sum of 3 digit is:");
//         System.out.println(sum);

//     }
// }
import java.util.Scanner;
class sum{

    public static void main(String args[]){
        int n1,n2,n3;
        int sum;
System.out.println("ENTER THE FRIST NUMBER");
Scanner saim=new Scanner(System.in);
n1=saim.nextInt();
System.out.println("ENTER THE SECOND NUMBER");
Scanner sa=new Scanner(System.in);
n2=sa.nextInt();
System.out.println("ENTER THE THIRD NUMBER");
Scanner sk=new Scanner(System.in);
n3=sk.nextInt();
sum=n1+n2+n3;
System.out.print("THE SUM OF ALL 3 DIGIT IS:");
System.out.println (sum);
    }

}
