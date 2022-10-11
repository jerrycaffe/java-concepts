class TestVarLengthArgs{
    static void multiplyWithVarArg(int ...a){ //You can only make method with 1 variable length argument
        int mult = 1;
        for(int i = 0; i < a.length; i++){
            mult = mult*a[i];
        }
        System.out.println("Multiplication result is "+mult);
    }
    static void multiplyWithooutArgs(int a, int b){
        System.out.println(a*b);
    }
    static void multiplyWithooutArgs(int a, int b, int c){
        System.out.println(a*b*c);
    }
}
public class JavaConceptTwentySix {
    public static void main(String[] args) {
        TestVarLengthArgs.multiplyWithooutArgs(2,3); //6
        TestVarLengthArgs.multiplyWithVarArg(2,3,4); //24

        TestVarLengthArgs.multiplyWithooutArgs(2,3); //6
        TestVarLengthArgs.multiplyWithooutArgs(2,3,4); //24
    }
}
