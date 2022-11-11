//All Exception in java inherits from the Exception base class
//When creating exception class one can inherit from the base Exception class
//When a method is inheritted and the method is throwing an exception, the overridden method can call the same exception with the parent
//but the overridden method should not throw the exception higher in the exception in the inherrittance chain
//e.g Arithmetic Exception inherrits from IOException and IOException inherits from the Exception class
//if an overridden method throws IOException and the parent method is throwing ArithMethicException then there will be error

class ParentFifty {
    void sumNumber() throws ArithmeticException {
        System.out.println("Throwing parent exception");
    }
    void multiplyNumber() throws ArithmeticException{
        System.out.println("Throwing parent Exception multiply");
    }
}

class ChildFifty extends ParentFifty{
    void sumNumber() throws ArithmeticException{
        System.out.println("This is fine and no error");
    }
//    void multiplyNumber() throws Exception{
//        System.out.println("This is not fine as this is throwing an exception higher than the parent in the chain");
//    }
}

public class JavaConceptFifty {
}
