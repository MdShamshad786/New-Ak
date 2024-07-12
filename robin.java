import java.util.Scanner;
public class robin {
    public static void main(String[] args) {
System.out.println("ENTER YOUR NUMBER");
Scanner saim=new Scanner(System.in);
int a=saim.nextInt();
boolean divided =false;
int d=2;
for(int i=1;i<a;i++)
if(a%d==0){
    System.out.println("THIS IS NOT PRIME  NUMBER");
    divided =true;
break;
}       
     if(!divided)
     {
           System.out.println("THIS IS PRIME NUMBER");
     }
}}
