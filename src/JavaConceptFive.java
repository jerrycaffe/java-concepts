public class JavaConceptFive {
//    Parent class reference variable can store child class reference variable value
//    child class reference variable can not store parent class reference variable

    public static void callPrint(Parent p){
        p.printOut();
    }
    public static void main(String[] args){
//        Will Print
        Child childRef = new Child();
        Parent parentRef = childRef;
        parentRef.printOut();


        Child childRef2 = new Child();
        callPrint(childRef2);

//        Will not run
        Parent parentChild = new Parent();
        Child childParent = parentChild;
        childParent.printOut();
    }




}

class Parent {
    public void printOut(){
        System.out.println("I am the parent class");
    }
}

class Child extends Parent{
    public void PrintOut(){
        System.out.println("I am the child class");
    }
}



