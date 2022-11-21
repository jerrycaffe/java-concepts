
public class JavaConceptFiftySeven {
    int y; // global variable can be used without initialization
    void fun(){
        int x = 0;// you cannot use a local variable without initializing it.
        System.out.println("Calling local variable "+x);
        System.out.println("Calling global variable "+y);
    }
    public static void main(String[] args) {
        JavaConceptFiftySeven test = new JavaConceptFiftySeven();
        test.fun();
    }
}
