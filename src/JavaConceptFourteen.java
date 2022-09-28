//In inheritance, if the parent class contains only parameterized constructor,
//It must be called inside child class using super()

class ParentFourteen{
    ParentFourteen(String s){
        System.out.println("Constructor inside parent saya "+s);
    }
}

class ChildFourteen extends ParentFourteen{
    ChildFourteen(){
        super("Pami");//if this line is removed error will be thrown
        System.out.println("Constructor inside child called");
    }
}
public class JavaConceptFourteen {
    public static void main(String[] args) {
        new ChildFourteen();
    }
}
