//try, catch and finally block
//try block starts the whole flow
//catch block which can occur as many times as possible
//finally may or may not occur
public class JavaConceptTwentyNine {
    public static void main(String[] args) {
        try{
            for(int i = 1; i < 4; i++){
                System.out.println("Number : "+100/(5-i));
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" exception caught");
        }finally {
            System.out.println("Exception happened");
        }
    }
}
