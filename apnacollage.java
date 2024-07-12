import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

class apnacollage {
  public static void main(String args[]) {

    // System.out.println("hello samshad!");
    // int i;
    // for (i=1;i<100;i++)
    // System.out.println("\3i love you saim\3");

    // STRINGS
    // CONCATENATE

    // String name = "Aman";
    // int age = 30;
    // String neighbour = "Saim";
    // String friend = neighbour;
    // String friend2 = name + " and " + neighbour;
    // System.out.println(friend2);

    /**
     * PRIMITIVE TYPES(simple types)
     * 
     * byte - 1 [-128 to 127]
     * short - 2
     * int - 4 1,2,3,
     * long - 8
     * float - 4 3.14
     * double - 8
     * char - 2 a,b,c,d
     * boolean - 1 true/false
     */

    // String name = "Aman";
    // System.out.println(name.length());

    // charAt

    // String na = "samshad";
    // System.out.println(na.charAt(0));

    // replace

    // String name2 = "ramen";
    // String name3 = name2.replace('r','b');
    // System.out.println(name3);

    // substring
    // String name ="ShamShad and Saquib";
    // System.out.println(name.substring(4,8));

    // ARRAY

    // int[] marks={98,85,68,86};

    // int[] marks=new int[4];
    // marks[0]=96;
    // marks[1]=95;
    // marks[2]=98;
    // marks[3]=93;

    // System.out.println(marks[2]);
    // Arrays.sort(marks);

    // System.out.println(marks[2]);

    // int[] marks1={95,98,96};

    // int[][] finalmarks={{95,98,96},{98,97,95}};
    // System.out.println(finalmarks[0][2]);

    // VERIABLE
    // int AGE=18;
    // AGE=19;
    // AGE=20;
    // System.out.println( AGE);

    // final int AGE=18;
    // AGE=19; ERROR
    // AGE=20; ERROR {BCOZ YOU ALREDAY DECLEARED A FINAL VALUE SO YOU CANT CHANGE
    // THE VALUE DURING THE EXECUATION}
    // System.out.println( AGE);

    // CONSTANT

    // final float pi =3.14f;
    // pi=2.5468f;
    // System.out.println(pi);

    /*
     * OPERATORS { THERE ARE 4 TYPES OF OPERATOR IN JAVA
     * 1 ARITHMETIC OPERATORS
     * 2 ASSIGNMENT OPERATORS
     * 3 LOGICAL OPERATORS
     * 4 COMPARISON OPERATORS
     */

    // 1 ARITHMETIC OPERATORS

    // float a=8;
    // float b=5;
    // float modulo = a%b;
    // float div = a/b;
    // float mul= a*b;
    // float sub = a-b;

    // System.out.println(modulo);
    // System.out.println(div);
    // System.out.println(mul);
    // System.out.println(sub);

    // UNIARY OPERATOR

    // int numb=52;
    // System.out.println(numb++);//52
    // System.out.println(numb);//53
    // System.out.println(++numb);//54
    // System.out.println(numb--);//54
    // System.out.println(numb);//53
    // System.out.println(--numb);//52

    // CALCULATOR

    // int a,b;

    // System.out.println("ENTER YOUR 1ST NUMBER!");
    // Scanner sk=new Scanner(System.in);
    // int a=sk.nextInt();
    // System.out.println("ENTER YOUR 2ND NUMBER!");
    // int b=sk.nextInt();
    // System.out.println(a+b);
    // System.out.println(a-b);
    // System.out.println(a*b);
    // System.out.println(a/b);

    // FIND MAX AND MIN NUMBER IN BTWN 2 NUMBER

    // System.out.println(Math.max(12,5));
    // System.out.println(Math.max(2,15));

    // TAKE INPUT STRING AND SHOW SAME STRING IN OUTPUT

    // String name;

    // Scanner ss=new Scanner(System.in) ;
    // System.out.println("ENTER YOUR NAME!");
    // name=ss.nextLine();
    // System.out.println("YOUR NAME IS\n" +name);

    // COMPRISIION OPERATOR
    // a == b
    // a!=b
    // a<b
    // a>b
    // a<=b
    // a>=b

    // LOGICAL OPERATOR
    // && AND OPERATOR
    // || OR OPERATOR

    // int a=60;
    // int b=40;

    // if(a<50 && b<50){
    // System.out.println("both less than 50!");
    // }

    // if(a<50 || b<50){
    // System.out.println("atleat one is less than 50!");
    // }



    // let us see price of a pen =10 ,pencil =40
    // int a;



    // Scanner sc = new Scanner(System.in);
    // System.out.println("How much money do you have:");
    // int cash = sc.nextInt();
    // if (cash < 10) {
    //   System.out.println("you cant buy anything");
    //   System.out.println("get more money");
    // } else if (cash > 10 && cash < 50) {
    //   System.out.println("you can buy only one thing");}
    // else {
    //   System.out.println("you can buy both pen and pencil ");
    // }
 
    // conditional statemen switch case
       

      //int day=1;// 1- monday 2- tuesday 

// System.out.println("ENTERANY NUMBER IN BTWN 1 TO 7!");
// Scanner sk=new Scanner(System.in);
// int day=sk.nextInt();
// switch(day){

//   case 1:
//   System.out.println("Monday");
//   break;// IF YOU NOT USE BREAK STATEMENT THEN PRINT ALL THE BELOW CASE
//   case 2:
//   System.out.println("Tuesday");
//   break;
//   case 3:
//   System.out.println("Wednesday");
//   break;
//   case 4:
//   System.out.println("Thirsday");
//   break;
//   case 5:
//   System.out.println("Friday");
//   break;
//   case 6:
//   System.out.println("Saturday");
//   break;
//   case 7:
//   System.out.println("Sunday");
//   break;
//   default:
//   System.out.println("YOU ENTERD WRONG INPUT!");
// }

/*LOOPS
 * 1 FOR
 * 2 WHILE
 * 3 DO WHILE
 */

// System.out.println("1");
// System.out.println("2");
// System.out.println("3");
  
// // for (int i=100;i>=0;i--)       // REVERCE FORM EX-> 100,99,98,97...........0
//  for (int i=1;i<=10;i++)            //EX-> 1,2,3,4,.........10
// {
//    System.out.println(i);
//  }


 //  USING FOR LOOP
// int j,n;
// System.out.println("enetr you integer");
// Scanner sk=new Scanner(System.in);
// n=sk.nextInt();
// //for( j=0;j<=n;j++)       // EX-> 0,1,2,3,4,5
// for(j=n;j>=0;j--)          // REVERSE FORM EX-> 5,4,3,2,1,0
// {
//   System.out.println(j);
// }



// WHILE LOOP

  // int a=100;
  // while(a>=0){
  //   System.out.println(a);
  //   a--;
  // }

  // int a=0;
  // while(a<=10){
  //   System.out.println(a);
  //   a++;



//   System.out.println("ENTER YOUR NUMBER!");
// Scanner sk=new Scanner(System.in);
// int a=sk.nextInt();
// // while(a<=100){
// //   System.out.println(a);
// //   a++;
//   while(a>=0){
//     System.out.println(a);
//     a--;
//  }

// DO WHILE

//  int a=100;
// do{
//   System.out.println(a);
//   a--;
// } while(a>=0);


// int a=10;
// do{
//   System.out.println(a);
//   a++;
// } while(a<=100);

// Scanner sk=new Scanner (System.in);
// int num=0;
// do{
//   System.out.println("INPUT YOUR NUMBER!");
//   num=sk.nextInt();
//   System.out.print("HERE IS YOUR NUBER-->:");
//   System.out.println(num);
// }
// while(num>=0);
// System.out.println("THE END!");


// BREAK AND CONTINUE

// int a=0;
// while(true){
// if(a==2){
//   a=a+1;
//   continue;
// }
//   System.out.println(a);
//   a++;
//   if(a>10){
//     break;
//   }
// }




}
  }
  

