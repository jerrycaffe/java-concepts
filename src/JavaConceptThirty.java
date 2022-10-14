

public class JavaConceptThirty {
    int a = 100;
    static int sum = 100;
    static int temp = 200;

    public static class JavaThirty{
        void calculate(){
            System.out.println(temp+sum/2+3);
            System.out.println(a); //An error occured because a is non static and it cannot be called within a static class
        }
    }

    public static void main(String[] args) {
        JavaConceptThirty.JavaThirty obj = new JavaConceptThirty.JavaThirty();
        obj.calculate();
    }
}
