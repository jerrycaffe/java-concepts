//nested interface can be public
//nested interface cannot be private, protected and default
//interface members are always public with no access modifier
interface JavaThirtyThreePython{
    interface innerOne{ // this is considered public by default
        String name();
    }
    private interface InnerTwo{ //throws error as inner interface cannot be private
        String name();
    }
    public interface innerThree{ // no error
        String name();
    }
    protected interface innerFour{
        String name();
    }
}
public class JavaConceptThirtyThree {
    public static void main(String[] args){
        System.out.println("Hello guys, common guys");
    }
}

