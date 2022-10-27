//when a class implements several interfaces with the same method name,
//implementation is expected to be provided just once

interface JavaFortyParent{
    public void callMe();
}
interface JavaFortyChildOne{
    public void callMe();
}

class JavaFortyImpl implements JavaFortyParent, JavaFortyChildOne{
    public void callMe(){
        System.out.println("Calling in here");
    }

}
public class JavaConceptForty {
    public static void main(String[] args) {
        JavaFortyImpl javaForty = new JavaFortyImpl();
        javaForty.callMe();
    }
}
