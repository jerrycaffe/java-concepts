//String is immutable
//it throws error when trying to change character within a string
//String buffer is mutable which means character can be changed
//After concatenting strings a new string will be created

public class JavaConceptEleven {
    public static void main(String[] args) {
String s1 = "javaConcepts";
//    s1.charAt(0) = 'M'; This fails to print because string is immutable
    System.out.println(s1);
    StringBuffer sb1 = new StringBuffer("Javaconepts");
    sb1.deleteCharAt(0);
    sb1.insert(0, "M");
    System.out.println(sb1); //This prints Mavaconcepts since string buffer is mutable
    }
}
