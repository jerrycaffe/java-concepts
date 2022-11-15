//Order of execution
//1. Static ini block
//2. instance init block
//3. constructor

class JavaFiftyThree{
    JavaFiftyThree(){
        System.out.println("From the Constructor");
    }
    {
        System.out.println("This is the first instance block");
    }
    static {
        System.out.println("This is the first static block");
    }
    {
        System.out.println("Second instance block");
    }

    static {
        System.out.println("Second static block");
    }
}
public class JavaConceptFiftyThree {
    public static void main(String[] args) {
        JavaFiftyThree test = new JavaFiftyThree();

    }
}
