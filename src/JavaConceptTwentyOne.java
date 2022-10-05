//Static variables are initialized as soon as class is loaded in the memory
//Two was to load a class into the memory
//1. Calling Static variable of a class
//2. Creating instance of a class

class TwentyOneExample{
    TwentyOneExample(String s){
        System.out.println("Constructor for class A "+s);
    }

    static String valueOne = "static variable A";
    static TwentyOneExample ref = new TwentyOneExample(("Inside"));

}

public class JavaConceptTwentyOne {
    public static void main(String[] args) {
        System.out.println(TwentyOneExample.valueOne); //Constructor for class A Inside
                                                        //static variable A
        System.out.println(new TwentyOneExample("outside"));
    }
}
