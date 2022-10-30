
//Method with default keyword in interface is public, not default
//While overriding method in child class, method access modifier must be public only
//Because all the member of interface can be public only

interface JavaFortyTwo{
    int b = 10;
    default void show(){
        System.out.println("Value of b : "+b);
    }
    default void hi(){
        System.out.println("Say hi ");
    }
}

public class JavaConceptFortyTwo implements JavaFortyTwo {
    public void hi(){
        System.out.println("Say hello public");
    }

    public static void main(String[] args) {
        JavaConceptFortyTwo obj = new JavaConceptFortyTwo();
        obj.show();
        obj.hi();
    }
}
