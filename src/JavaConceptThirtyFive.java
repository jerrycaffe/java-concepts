//Declaring constructor return type (void, int, float etc) makes it a method and not a constructor
class JavaThirtyFiveCar{
    int modelYear;
    public void JavaThirtyFiveCar(int year){
        System.out.println(year);
    }
}
public class JavaConceptThirtyFive {
    public static void main(String[] args) {
        JavaThirtyFiveCar concept = new JavaThirtyFiveCar(); // only default constructor is instantiated
        concept.JavaThirtyFiveCar(20); //no more a constructor but a method

    }
}
