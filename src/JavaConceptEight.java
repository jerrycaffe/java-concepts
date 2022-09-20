//String type is a more specific type than the Object type
//During overloading child class is preferred than parent class
//During compiled time a more specific data type is called
public class JavaConceptEight {
    public static void funEight(String s){
        System.out.println("String reference variable is called "+s);
    }
    public static void funEight(Object o){
        System.out.println("Object reference variable is called "+o);
    }
    public static void main(String[] args) {
        funEight(null);
    }
}
