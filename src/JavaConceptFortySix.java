//if a class implements two or more interfaces and interfaces contain default methods with same method declaration, overriding of method is must
//in java multiple inheritance is achieved using interfaces. you cannot inherit from multiple classes

interface JavaFortySixParent1{
  default void show(){
        System.out.println("Parent 1");
    }
}

interface JavaFortySixParent2{
    default void show(){
        System.out.println("Parent 2");
    }
}
public class JavaConceptFortySix implements JavaFortySixParent1, JavaFortySixParent2{
    @Override
    public void show() {
        System.out.println("Show from child");
    }

    public static void main(String[] args) {
        JavaConceptFortySix obj = new JavaConceptFortySix();
        obj.show();
    }
}
