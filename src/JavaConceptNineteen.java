//calling static method and variable using class name
class A{
    static String s = "Static variable";
    static String callMe(){
        return "Static method";
    }
}
public class JavaConceptNineteen {
    public static void main(String[] args) {
//        Calling static variable with class name directly
        System.out.println(A.s); // result is Static variable
        System.out.println(A.callMe()); // result is Static method

//        calling static variable with objects
        A staticNineteen = new A();
        System.out.println(staticNineteen.s); // result is Static variable
        System.out.println(staticNineteen.callMe()); // result is Static method
    }
}
