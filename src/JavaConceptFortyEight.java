//primitive datat type cannot be assigned the value null
//but reference variables can
public class JavaConceptFortyEight {
    public static void main(String[] args) {
        Object newObj = null; // do not throw error because Object is a reference variable
        String newStr = null; //do not throw error because String is a reference variable
//        int number = null; //Throws error because int is a primitive data type
    }
}
