import java.util.Scanner;
public class cgpa {
                                    //THIS IS CODE OF FIND THE CGPA 
    public static void main(String[] args){
// float subject1=88;
// float subject2=87;
// float subject3=48;
// float subject4=60;
// float subject5=65;
// float cgpa= (subject1+ subject2+ subject3+ subject4+ subject5)/50;
// System.out.println("THE TOTAL CGPA IS :"+cgpa);
//System.out.println(cgpa);

                                //THIS IS CODE OF FIND THE PERCENTAGE 
System.out.println("ENTER YOU PHYSICS MARKS");
Scanner a =new Scanner(System.in);
float subject1 =a.nextFloat();
System.out.println("ENTER YOU MATHS MARKS");
float subject2 =a.nextFloat();
System.out.println("ENTER YOU CHMESITRY MARKS");
float subject3 =a.nextFloat();
System.out.println("ENTER YOU ENGLISH MARKS");
float subject4 =a.nextFloat();
System.out.println("ENTER YOU PPS MARKS");
float subject5 =a.nextFloat();
// float subject1=88;
// float subject2=87;
// float subject3=48;
// float subject4=60;
// float subject5=65;
float cgpa= (subject1+ subject2+ subject3+ subject4+ subject5)/50;
System.out.println("THE TOTAL CGPA IS :"+cgpa);
//float cgpa= (subject1+ subject2+ subject3+ subject4+ subject5);
// System.out.print("THE PERCENTAGE IS "+cgpa/5);
// System.out.println("%");


    }
}
