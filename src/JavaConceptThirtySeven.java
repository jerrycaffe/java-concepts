//A private constructor can only be assessed through an inner static method
class JavaThirtySeven {
    private String value;

    private JavaThirtySeven(String value) {
        this.value = value;
        System.out.println("Constructor says "+value);
    }
    public static JavaThirtySeven create(String value){
        JavaThirtySeven javaThirtySeven = new JavaThirtySeven(value);
        return javaThirtySeven;
    }
}

public class JavaConceptThirtySeven {
    public static void main(String[] args) {
        JavaThirtySeven newObj = JavaThirtySeven.create("Passing argument in here");
    }
}
