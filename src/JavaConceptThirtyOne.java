import java.io.IOException;

//if a method in child class throws exception then the overridden method in parent class must throw exception
class JavaParentThirtyOne{
    public void find() throws Exception{
        System.out.println("Inside Parent : Java");
    }
}

class JavaChildThirtyOne extends JavaParentThirtyOne{
    public void find() throws IOException{ //Removing this brings about error
        System.out.println("Inside Child : JavaConcept");
    }
}
public class JavaConceptThirtyOne {
    public static void main(String[] args) {
        JavaChildThirtyOne jc = new JavaChildThirtyOne();
        try{
            jc.find();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
