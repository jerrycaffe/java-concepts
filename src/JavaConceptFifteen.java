//The Object class is the highest level of all classes in Java and so therefore, any object can be created out of this
//The Object class reference can store any reference including predefined ones like String, int etc

public class JavaConceptFifteen {
    public static void main(String[] args) {
        String txt1 = "Java Concept testing the power of object";
        StringBuffer txt2 = new StringBuffer("Java concept testing the string buffer");
        Integer num1 = new Integer(20);
        System.out.println("Printing all variables with the specific data type:-  string: "+txt1+" string buffer: "+txt2+" integer: "+num1);

//        ======================================================
        Object txt3 = "Java Concept testing the power of object";
        Object txt4 = new StringBuffer("Java concept testing the string buffer");
        Object num2 = new Integer(20);
        System.out.println("Printing all variables with the object data type:-  string: "+txt3+" string buffer: "+txt3+" integer: "+num2);
    }
}
