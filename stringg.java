import javax.swing.SizeRequirements;

public class stringg {
    public static void main(String args[]){
        //problem 1  WRITE A PROGRA M TO COVERET A STRING TO UPPER CASE

 String name="md shamshad ansari";
 name = name.toUpperCase();
System.out.println(name);

// problem 2 WRITE A JAVA PROGRAM TO REPLACE SPACE WITH _UNSERSCORE

String text ="to my frind";
text=text.replace(" ","_");
System.out.println(text);


// problem 3  WRITE A PROGRAM TO FILL A LETTER TEMPLATE WHICH LOOKS LIKE BELOW
          
String letter ="dear <|name|>, thanks a lot!";
 letter= letter.replace("<|name|>","shamshad");

System.out.println(letter);

// problem 4  WRITE A PROGRAM TO FORMAT THE FOLLOWING LETTER USING SCAPE SEQUENCE


String  myletter= "dear harry,\n\t this java cource is nice,\n\tthanks!";


System.out.println(myletter);

}
    
}
