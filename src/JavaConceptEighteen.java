//In case of String, Integer == is used to compare memory location
//In case of char, int == is used to compare values
//equal() method is used to compare values of String and Integer class objects

public class JavaConceptEighteen {
    public static void main(String[] args) {
        String s1 = "J";
        String s2 = "J";
        System.out.println("Comparing String address: "+(s1==s2)); //result is false
        System.out.println("Comparing String values: "+s1.equals(s2)); // result is true

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println("Comparing Integer address: "+(i1==i2)); //result is false
        System.out.println("Comparing Integer values: "+i1.equals(i2)); // result is true

        int t1 = 1;
        int t2 = 1;
        System.out.println("Comparing int values: "+(t1 == t2)); // returns true

        char c1 = 'J';
        char c2 = 'J';
        System.out.println(c1 == c2); //returns true
    }
}
