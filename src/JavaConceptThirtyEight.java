//while calling the super keyword in an inheritted class you have to call

class ParentThirtyEight{
    public ParentThirtyEight(String name){
        System.out.println("You are welcome "+name);
    }
}
class ChildThirtyEight extends ParentThirtyEight{
   public ChildThirtyEight(){
//       int x = 0; This here will throw an error because super constructor is supposed to be called first
       super("Child");
       int x = 0; //super comes before this which means no error will be thrown

    }
}
public class JavaConceptThirtyEight {
    public static void main(String[] args) {
        ChildThirtyEight test = new ChildThirtyEight();
    }
}
