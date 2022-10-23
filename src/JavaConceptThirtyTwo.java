//Try and catch cannot be inside class directly
class JavaThirtyTwo {
//try{}catch(Exception e) This line of code throws error as it is directly inside the class
    JavaThirtyTwo(int a){
        try{
            double sum = 2/0;
            System.out.println(sum);
        }catch(Exception e){
            System.out.println("The error is that we are "+e.getMessage());
        }

    }
}

public class JavaConceptThirtyTwo {
    public static void main(String[] args) {

        System.out.println(new JavaThirtyTwo(20));
    }

}
