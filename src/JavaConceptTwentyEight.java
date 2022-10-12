import java.io.IOException;

//System.exit(0) is used if you dont want to run finally block in try catch
public class JavaConceptTwentyEight {
    public static void main(String[] args) {
        try{
            System.out.println("In try block");
            throw(new Exception());
        }catch(IOException e){
            System.out.println("IOException");
        }catch(Exception e){
            System.out.println("Exception");
            System.exit(0); // Terminates the whole program here
        }finally {
            System.out.println("Inside Finally");
        }
    }
}
