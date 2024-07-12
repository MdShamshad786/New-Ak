import java.util.Scanner;

public class ifelseif {
    public static void main(String args[]) {
        /*
         * int a, b, c;
         * 
         * System.out.println("ENTER ANY VALUE");
         * Scanner s = new Scanner(System.in);
         * a = s.nextInt();
         * b = s.nextInt();
         * c = s.nextInt();
         * if (a>b&&a>c) {
         * System.out.println("A IS GREATER");
         * } else if (b>a&&b>c) {
         * 
         * System.out.println("b IS GREATER");
         * }
         * else {
         * System.out.println("C IS GREATER ");
         * }
         */

        // int age;
        // System.out.println("ENTER YOUR AGE PLEASE!");
        // Scanner sm=new Scanner(System.in);
        // age=sm.nextInt();
        // if(age>50){
        // System.out.println("YOU ARE EXPERIENCED!");

        // }
        // else if (age >40){
        // System.out.println("YOU ARE SEMI EXPERIENCED!");
        // }

        // else if (age>30){
        // System.out.println("YOU ARE SEMI SEMI EXPERIENCED!");
        // }
        // else {
        // System.out.println("YOU HAVE NOT EXPERIENCED!");
        // }
        
        System.out.println("ENTER YOUR PASSWORD");
        Scanner s = new Scanner(System.in);
        String sk = s.nextLine();
        if (sk.equals("saim")) {
            System.out.println("WELCOME");
        } else {
            System.out.println("TRY AGAIN");
        }


        // System.out.println("ENTER YOUR PASSWORD");
        // Scanner s = new Scanner(System.in);
        // char sk = s.next().charAt(0);
        // if (sk == 's') {
        //     System.out.println("WELCOME");
        // } else {
        //     System.out.println("TRY AGAIN");
        // }
    }

}
