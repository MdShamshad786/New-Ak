import java.util.Scanner;
public class puzzle {
    public static void main(String args[]){
// int a,b,c,d,E;
// Scanner sc=new Scanner(System.in);
// System.out.println("ENTER YOUR 1ST DIGIT!");
// a=sc.nextInt();
// System.out.println("ENTER YOUR 2ND DIGIT!");
// b=sc.nextInt();
// System.out.println("ENTER YOUR 3RD DIGIT!");
// c=sc.nextInt();
// System.out.println("ENTER YOUR 4TH DIGIT!");
// d=sc.nextInt();
// E=(a+b)*(c+d);
// System.out.println("THE VALUE OF PUZZLE IS:"+a+b+"*"+c+d+"="+E);


Scanner sc=new Scanner(System.in);
System.out.println("if  12 * 13 = 12");
System.out.println("if 17 * 36 = 72");
System.out.println("ENTER YOUR 1ST NUMBER!");
int fristnum=sc.nextInt();
System.out.println("ENTER YOUR 2ND NUMBER!");
int secondnum=sc.nextInt();

int num=fristnum/10;
int modulus=fristnum%10;
int mul=num+modulus;

int numb=secondnum/10;
int modulu=secondnum%10;
int muls=num+modulu;
System.out.println("YOUR ANSWER IS: "+mul*muls);

    }
}
