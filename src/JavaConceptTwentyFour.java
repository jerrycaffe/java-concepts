//If a class have multiple static variable or static blocks then they are executed in the sequence in which they are written
class JavaTwentyFour{
    JavaTwentyFour(String s){
        System.out.println("Constructor Java: "+s);
    }
}
class PythonTwentyFour{
    static String s ="";
    static JavaTwentyFour javaInit = new JavaTwentyFour("Variable 1");
    static {
        System.out.println("Static Block 1");
    }
    static JavaTwentyFour javaInit2 = new JavaTwentyFour("Variable 2");
    static {
        System.out.println("Static Block 2");
    }
}
public class JavaConceptTwentyFour {
    public static void main(String[] args) {
        System.out.println(PythonTwentyFour.s);
    }
}
