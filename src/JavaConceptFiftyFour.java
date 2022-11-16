//final method cannot be overridden
//private final method can be overridden

class JavaFiftyFourParent{
    private final void getInfo(){
        System.out.println("This is the private final method");
    }



}

class JavaFiftyFourChild extends JavaFiftyFourParent{

   void getInfo(){
        System.out.println("From parent");
    }
}
public class JavaConceptFiftyFour {
    public static void main(String[] args) {
        JavaFiftyFourChild obj = new JavaFiftyFourChild();
        obj.getInfo();
    }

}
