class Calculating{
   static void calculate(String str, int ...a){
    int result = 0;
    if(str.equals("sum")){
        result = 0;
        for (int i:a){
            result += i;
        }
    }
    if(str.equals("multiply")){
        result = 1;
        for (int i:a){
            result *= i;

        }
    }
       System.out.println(str+" of numbers : "+(result));

    }
}
public class JavaConceptTwentySeven {

    public static void main(String[] args) {
        Calculating.calculate("multiply", 2,3,4,2,4,2);
        Calculating.calculate("sum", 2,32,2,3,4,2,4,2,4,3);
    }
}
