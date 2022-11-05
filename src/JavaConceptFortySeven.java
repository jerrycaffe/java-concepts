//In && operator if left side is false then right side won't be evaluated
//In && operator if left side is true then right side will be evaluated
//In || operator if the left side is true then right side won't be evaluated
//In || operator if left side is false then right side will be evaluated
public class JavaConceptFortySeven {
    public static void main(String[] args) {
        int numberOne = 20;
        int numberTwo =100;
        if(numberOne == 10 && numberTwo == 100){
            System.out.println("Option 1 Printed");
        }else {
            System.out.println("Option2 Printed");
        }
        if(numberOne == 20 && numberTwo == 100){
            System.out.println("Option 1 Printed");
        }else {
            System.out.println("Option2 Printed");
        }
        if(numberOne == 30 || numberTwo == 100){
            System.out.println("Option 1 Printed");
        }else {
            System.out.println("Option2 Printed");
        }
        if(numberOne == 20 || numberTwo == 100){
            System.out.println("Option 1 Printed");
        }else {
            System.out.println("Option2 Printed");
        }
    }
}
