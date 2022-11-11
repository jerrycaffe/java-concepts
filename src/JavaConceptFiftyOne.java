//super keyword is used to call parent class overridden method
//this keyword can be used to call child class overriddent method
class JavaFiftyOneParent{
    int value = 100;

    void getInfo(){
        System.out.println("Parent");
    }
    void value(){
        System.out.println("Parent value variable "+value);
    }
}
class JavaFiftyOneChild extends JavaFiftyOneParent{
    void getInfo(){
        System.out.println("Child");
    }
    void callMethod(){
        this.getInfo();
        super.getInfo();
        value();
    }
}
public class JavaConceptFiftyOne {
    public static void main(String[] args) {
        JavaFiftyOneChild ch = new JavaFiftyOneChild();
        ch.callMethod();
    }
}
