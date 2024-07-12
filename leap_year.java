import java.util.Scanner;

public class leap_year {
    public static void main (String[] args){

    
    int a;
System.out.println("ENTER THE YEAR:-");

Scanner s=new Scanner(System.in);

a = s.nextInt();
if(a%4==0)

{

    System.out.println("THIS IS LEAP YEAR:-");
}

else{
    System.out.println("THIS IS NOT LEAP YEAR:-");
}

}





}
