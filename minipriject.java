import java.util.Scanner;

public class minipriject {

    public static void main(String agrs[]) {

        int myNumber = (int) (Math.random() * 100);

        int userNumber;

        Scanner saim = new Scanner(System.in);
        do {
            System.out.println("GUESS MY NUMBER(1-TO-100)!");

            userNumber = saim.nextInt();

            if (userNumber == myNumber) {

                System.out.println("CORRECT NUMBER !");

                break;

            } else if (userNumber > myNumber) {

                System.out.println("YOUR NUMER IS TOO LARGE!");

            } else {

                System.out.println("YOUR NUMBER IS TOO SHORT!");
            }
        } while (userNumber >= 0);// JAB TAK USER 0 OR 0 SE GREATER VALUE INPUT DETA RAEHGA  
                //TAB TAK WHILE LOOP EXECUTE HOTA RAHEGA
        System.out.println("MY NUMBER WAS:!");

        System.out.println(myNumber);

    }
}

