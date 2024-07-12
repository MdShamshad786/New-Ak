import java.util.Scanner;
class l{
    public static void main(String args[]){
        System.out.println("KYA TUM MUJHSE \3 KARTI HO");
        Scanner ss=new Scanner(System.in);
       String a=ss.nextLine();
        if(a.equals("yes")){
            System.out.println("I \3 YOU ");
        }
        else if(a.equals("no")){
            System.out.println("I DONT \3 YOU");
        }
        else{
            System.out.println("GIVE ME MY ANSWER");
        }
    }
}