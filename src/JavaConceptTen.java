//when all the overloaded methods have the same level of specifity,
// the compiler gets confused and won't know what method to call
//due to this the compiler throws exception

public class JavaConceptTen {
    public static void funTen(String str){
        System.out.println("String reference is called "+str);
    }

    public static void funTen(Integer i){
        System.out.println("Integer reference called "+i);
    }
    public static void main(String[] args) {
        funTen(null); //An error of ambiguous method call is thrown
        // because both Integer and String are more specific, so the compiler is confused
    }
}
