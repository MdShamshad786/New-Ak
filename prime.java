import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner n = new Scanner(System.in);
        int k = n.nextInt();
        int d = 2;
        boolean divided = false;
        for (int a = 1; a <= k; a++)
            if (k % 2 == 0) {
                System.out.println("this is not prime numbr");
                divided = true;
                break;
            }
        if (!divided)
        {
            System.out.println("this is prime numbr");
        }
    }
}