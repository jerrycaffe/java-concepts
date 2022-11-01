//Non static variable can be accessed inside a static method within an interface
//Non static variable cannot be accessed inside a static method within a class
//Variable are static by default inside an interface

interface JavaFortyFOur{
    String name = "Yellow paw par";
   static void names(){
       System.out.println(name);
    }
}
public class JavaConceptFortyFour {
    String name = "Ade";
    static void names(){
//        System.out.println(names);
    }

    public static void main(String[] args) {

    }

}
