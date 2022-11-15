//final class cannot be inherited in ava
//final class JavaFiftyTwoShape{
//    int length;
//    int breadth;
//    JavaFiftyTwoShape(int length, int breadth){
//        this.breadth = breadth;
//        this.length = length;
//    };
//}

class JavaFiftyTwoShape{
    int length;
    int breadth;
    JavaFiftyTwoShape(int length, int breadth){
        this.breadth = breadth;
        this.length = length;
    };
}

class JavaFiftyTwoRectangle extends JavaFiftyTwoShape{
    JavaFiftyTwoRectangle(int length, int breadth){
        super(length, breadth);

    }
    void area(){
        System.out.println("The area of a rectangle is "+length*breadth);
    }
}
public class JavaConceptFiftyTwo {
    public static void main(String[] args) {

    }
}
