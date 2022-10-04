//Tatic variable are created and assigned values just once


class JavaStatic{
     JavaConceptTwenty obj = new JavaConceptTwenty("Variable created");
    static  JavaConceptTwenty obj2 = new JavaConceptTwenty("Variable created");
    JavaStatic(String s){
        System.out.println("JavaStatic Object created :"+s);
        System.out.println("JavaObject creation is one: "+s);
    }
}

public class JavaConceptTwenty {
    JavaConceptTwenty(String s){
        System.out.println("JavaConcept :" +s);
    }
    public static void main(String[] args) {
        new JavaStatic("One");
        new JavaStatic("Two");
        new JavaStatic("Three");
    }
}
