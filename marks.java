import java.util.Scanner;
//THIS IS CODE OF FIND THE PERCENTAGE OF ANY STUDENT 
public class marks {
    public static void main(String args[]) {
        float sum;
        // float eng, evs, java, maths, dsa, sum;
        // System.out.println("enter the marks of eng");
        // Scanner saim = new Scanner(System.in);
        // float eng = saim.nextFloat();
        // System.out.println("enter the marks of evs");
        // Scanner sai = new Scanner(System.in);
        // float evs = sai.nextFloat();
        // System.out.println("enter the marks of java");
        // Scanner sa = new Scanner(System.in);
        // float java = sa.nextFloat();
        // System.out.println("enter the marks of maths");
        // Scanner s = new Scanner(System.in);
        // float maths = s.nextFloat();
        // System.out.println("enter the marks of dsa");
        // Scanner ss = new Scanner(System.in);
        // float dsa = ss.nextFloat();
        // sum = eng + evs + java + maths + dsa;
        // System.out.println("THE TOTAL MARKS OF YOUR IS:-"+ sum);
        // System.out.println("THE TOTAL PERCENTAGE IS:");
        // System.out.println(sum / 5);


        //THIS IS CODE OF FIND THE CGPA OF ANY STUDENT
        System.out.println("enter the marks of eng");
        Scanner saim = new Scanner(System.in);
        float eng = saim.nextFloat();
        System.out.println("enter the marks of evs");
        Scanner sai = new Scanner(System.in);
        float evs = sai.nextFloat();
        System.out.println("enter the marks of java");
        Scanner sa = new Scanner(System.in);
        float java = sa.nextFloat();
        System.out.println("enter the marks of maths");
        Scanner s = new Scanner(System.in);
        float maths = s.nextFloat();
        System.out.println("enter the marks of dsa");
        Scanner ss = new Scanner(System.in);
        float dsa = ss.nextFloat();
        sum = (eng + evs + java + maths + dsa)/50;
        System.out.println("THE TOTAL CGPA IS:-  "+ sum);


    }
}

