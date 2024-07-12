
import java.util.Scanner;

public class string {
    public static void main(String args[]){

       // String name =new String ("saim");
     //  String name ="shamshad";
       // System.out.println("the name is :");
        //System.out.print(name);
       // int a =6;
        //float b =4.568f;
       //float c=a+b;
       //System.out.printf("%f",c);
       // System.out.printf("the value of a id %d and the value of b is %f",a,b);
       
    // Scanner sc=new Scanner(System.in);
    // String saim=sc.nextLine();
    // System.out.println(saim);


// String name ="shamshad";
// System.out.println(name.length());




//String name ="SHAMSHAD";
//System.out.println(name.toLowerCase());




// String s ="shamshad ansari";
// System.out.println(s.toUpperCase());

// String nonTrimmedString = "        saim   ";
// System.out.println(nonTrimmedString);


// String 
// TrimmedString = "        saim   ";
// System.out.println(TrimmedString.trim());


  
 String name="shamshad";
 System.out.println(name.toUpperCase());
// System.out.println(name.substring(1));
//System.out.println(name.substring(1,7));

//System.out.println(name.replace('s', 'k'));
//System.out.println(name.replace("s", "skkk"));
System.out.println(name.startsWith("sh"));
System.out.println(name.startsWith("ha"));
System.out.println(name.endsWith("ad"));
System.out.println(name.endsWith("sa"));


System.out.println(name.charAt(2));
System.out.println(name.indexOf("d"));



System.out.println(name.equals("Shamshad"));//CASE SENSATIVE

System.out.println(name.equals("saim"));



System.out.println(name.equalsIgnoreCase("ShAmShAd")); // NOT CASE SENSATIVE



System.out.println("MOHAMMAD SHAMSHAD \nANSARI"); 
System.out.println("MOHAMMAD SHAMSHAD \t ANSARI"); 



}
}