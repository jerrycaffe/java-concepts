class JavaThirtySixCar{
    JavaThirtySixCar(){
        System.out.println("Constructor default");
    }
    public JavaThirtySixCar(int i){
        System.out.println("Constructor public");
    }

    protected JavaThirtySixCar(String s){
        System.out.println("Constructor protected");
    }
    private JavaThirtySixCar(String s, int a){
        System.out.println("Constructor private");
    }

}
public class JavaConceptThirtySix {
    public static void main(String[] args) {
        new JavaThirtySixCar(); //calling the default constructor
        new JavaThirtySixCar(2); //calling public constructor
        new JavaThirtySixCar("protected"); //calling protected constructor
//        new JavaThirtySixCar("private", 90); //calling private constructor throws error about using private access modifier
    }
}
