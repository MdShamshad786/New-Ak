import java.util.Scanner;
public class chat {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NUMBER");
        Scanner ss=new Scanner(System.in);
int a=ss.nextInt();
boolean isprime=false;
for(int i=2;i<=a/2;i++)
if(a%i==0)
isprime=true;
{
    System.out.println("THIS IS PRIME NUMBER");
   
}
if(isprime)
{
    System.out.println("THIS IS NOT PRIME NUMBER");
}
    } 
}
