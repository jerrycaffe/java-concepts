//class constructor can throw exception but cannot return
class JavaThirtyFour {
    JavaThirtyFour(int a) throws ArithmeticException {
        for (int i = 1; i <= 10; i++) {
//            if((a-i)==0){
//                throw new ArithmeticException();
//            }
            System.out.println(100 / (a - i));
        }
    }

  /*

  JavaThirtyFour(String s) {
        return s; //This throws error because A constructor should return any value
    }

   */
}

public class JavaConceptThirtyFour {
    public static void main(String[] args) {
        JavaThirtyFour numberDiv = new JavaThirtyFour(8);

    }
}
