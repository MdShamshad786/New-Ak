public class variable {
    int a=10; // INSTANCE VARIABLE
    static int b=40; // STATIC VARIABLE
    public static void main(String args[]){
    variable saim =new variable();
    int c=50; // LOCAL VARIABLE
    System.out.println(saim.a);
    System.out.println(variable.b);
    System.out.println(c);
    }

    /*
     * int a;
     * int b;
     * public static void main(String args[]){
     * variable saim=new variable();
     * saim.a=10;
     * saim.b =0;
     * System.out.println(saim.a);
     * System.out.println(saim.b);
     * }
     */

    // string color;
    // int age;

    // void obj(string c, int a) {
    //     color = c;
    //     age = a;
    // }

    // void display() {
    //     System.out.println(color + " " + age);
    // }

    // public static void main(String args[]) {
    //     variable bruno = new variable();
    //     bruno.object("balck", 10);
    //     bruno.display();
    //     System.out.println(bruno);
    // }
}
