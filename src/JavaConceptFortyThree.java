//static methods and static variable can be made inside interface
interface JavaFortyThree{
    static int salary = 10;
    static void display(){
        System.out.println("Static defined within");
    }
}
public class JavaConceptFortyThree{
    public static void main(String[] args) {

        JavaFortyThree.display();
    }
}
