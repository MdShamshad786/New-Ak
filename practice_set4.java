import java.net.SocketTimeoutException;
import java.util.Scanner;
public class practice_set4 {
    public static void main(String agrs[]){
/* WRITE A PROGRAM TO FIND OUT WHETHER A STUDENT IS PASS OR FAIL
 * IF IT REQUIRED TOTAL 40% AND ATLEAST 33% IN EACH SUBJECT TO PASS
 * ASSUME 3 SUBJECT AND TAKE MARKS AS INPUT FROM USERS.
 */
// int phy,che,maths;
// Scanner ss=new Scanner(System.in);
// System.out.println("ENTER YOUR MARKS IN PHYSICS!");
// phy=ss.nextInt();
// System.out.println("ENTER YOUR MARKS IN CHEMISTRY!");
// che=ss.nextInt();
// System.out.println("ENTER YOUR MARKS IN MATHS!");
// maths=ss.nextInt();
// float avg=(phy+che+maths)/3.0f;
// System.out.println(" THE TOTAL MARKS OF YOUR:");
// System.out.println(avg);
// if(avg>=40&&phy>=33 &&che>=33&& maths>=33){
// System.out.println("CONGRATULATION YOU HAVE BEEN PROMOTED");
// } else{
//     System.out.println(" YOU HAVE TO DO MORE HARD WORK");
// }    

// WRITE A JAVA PROGRAM TO FIND WHETHER A YEAR ENTERED BY THE USER IS A LEAP YEAR OR NOT


// int year;
// System.out.println("ENTER THE YEAR!");
// Scanner ss=new Scanner(System.in);
// year=ss.nextInt();
// if(year%4==0){
//     System.out.println("THIS YEAR IS LEAP YEAR");
// }
// else{
//     System.out.println("THIS is NOT YEAR LEAP YEAR");
// }


// WRITE A PROGRAM TO FIND OUT THE TYPE OF WBSITE FROM THE URL
// .com --> COMMERATIAL WEBSITE
// .org --> ORGANIZATION WEBSTIE
//.in--> INDIAN WEBSITE
System.out.println("ENTER ANY WEBSITE NAME!");
Scanner sc=new Scanner(System.in);
String website =sc.next();
if(website.endsWith(".org")){
    System.out.println("THIS IS AN ORGANIZATIONAL WEBSITE");
}
else if(website.endsWith(".com")){
    System.out.println("THIS IS A COMMERATIAL WEBSITE");
}
else if(website.endsWith(".in")){
    System.out.println("THIS IS A INDIAN WEBSITE");
}
else{
    System.out.println("YOU ENTER INVALED INPUT");
}
    }
    
}
