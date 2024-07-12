public class incdec {

    public static void main(String args[]){
        /*
        byte x=5;
      int y=6;
      short z=8;
      int a=y+z;
      float b=6.54f+x;
      System.out.println(b);
      
    
         */

//increment and decrement operator
int i=56;
// int b=i++; // frist b is assigned i then i (56) is incremented
int j =67;
int c =++j;// frist j is incremented then c is assigned j (68)
System.out.println(i++);
System.out.println(i);
System.out.println(++i);
System.out.println(i);
// a++ --> means frist use the value and then increment
// ++a --> means frist increment the value then use n  
int y=7;
int x=++y*8;
System.out.println(x);
char ch='a';
System.out.println(++ch );  

    }
    
}
