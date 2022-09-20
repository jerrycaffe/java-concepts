//The order of accessibility in Java remains private, default, protected and public
//To overwrite methods in java this should be obeyed i.e the order...
//e.g if a parent class declares a method as protected, overwriting class should use a public method with a
//method with more restrictive modifier cannot be overridden



class ParentNine{
    public void fun(){
        System.out.println("Inside Parent Class");
    }
    protected void pFun(){
        System.out.println("Private method within parent");
    }
}
class ChildNine extends ParentNine{
//Overloading fun function
    public void fun(String x){
        System.out.println("Inside Child class nine "+x);
    }
    public void pFun(){
        System.out.println("Private method within child");
    }
}

public class JavaConceptNine {
    public static void main(String[] args) {
ChildNine c = new ChildNine();
c.fun();
c.fun("Jerry");
c.pFun();
    }
}
