import java.util.Scanner;

class calculator {
    public static void main(String args[]) {
        System.out.println("WELCOME TO SASTA CALCULATOR \1\n");
        System.out.println("PLZ ENTER YOUR 1ST NUMBER!");
        Scanner obj = new Scanner(System.in);
        double a = obj.nextDouble();
        System.out.println("PLZ ENTER YOUR 2ND NUMBER!");
        double b = obj.nextDouble();

        System.out.println("IF YOU WANT TO ADDITION ! -> CLICK 1 \3\n");

        System.out.println("IF YOU WANT TO SUBSTRATION ! -> CLICK 2 \3\n");

        System.out.println("IF YOU WANT TO MULTIPLICATION ! -> CLICK 3 \3\n");

        System.out.println("IF YOU WANT TO DIVISSION ! -> CLICK 4 \3\n");

        System.out.println("IF YOU WANT TO FIND REMAINDER ! -> CLICK 5 \3\n");
        int c = obj.nextInt();
        switch (c) {
            case 1:

                System.out.println(a+ " + " +b +" =  "  +(a+b+" \3"));
                //System.out.println("THE ADDITION OF TWO NUMBER IS ->" );
                //System.out.println(a+b) ;
                break;
            case 2:
            System.out.println(a+ " - " +b +" =  "  +(a-b+" \3"));
            //System.out.println("THE SUBSTRATION OF TWO NUMBER IS ->  " + (a - b));
                break;
            case 3:
            System.out.println(a+ " * " +b +" =  "  +(a*b+" \3"));
              //  System.out.println("THE MULTIPLICATION OF TWO NUMBER IS ->  " + (a * b));
                break;
            case 4:
            System.out.println(a+ " / " +b +" =  "  +(a/b+" \3"));
              //  System.out.println("THE DIVISSION OF TWO NUMBER IS ->  " + (a / b));
                break;
                
            case 5:
            System.out.println(a+ " % " +b +" =  "  +(a%b+" \3"));
               // System.out.println("THE REMAINDER OF TWO NUMBER IS ->  " + (a % b));
                break;
        
                default:
                System.out.println("YOU CHOSE THE WRONG OPTION ");
                System.out.println("PLZ CHOOSE CORRECT OPTION 1 TO 5");
        }

    }
}
