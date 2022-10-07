class Google{
    int a = 0;
    static int b = 2;
    static {
        statMethod();
//        nonStaticMethod(); //This throws error as static block cannot be used to call static variable or method
        b = 10;
//        a = 12; //This throws error for the same reason
    }

    static void statMethod(){
        System.out.println("Static Method");
    }
    void nonStaticMethod(){
        System.out.println("Non Static Method");
    }
}
public class JavaConceptTwentyThree {
    public static void main(String[] args) {
        System.out.println(Google.b); //static Method and 10 will be printed
    }
}
