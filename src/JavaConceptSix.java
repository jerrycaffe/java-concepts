//When an instance of a child is created from the parent,
//calling a method in the instantiated object, the metod of the child will be called
//calling a variable in the instantiated object, the variable or the parent will be called
class Phone {
    int ram = 0;

    void call() {
        System.out.println("Calling from the Parent class");
    }
}

class SmartPhone extends Phone {
    int ram = 4;

    void call() {
        System.out.println("Calling from the Child Class");
    }
}


public class JavaConceptSix {

    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.call(); //Calling from the Child Class will be printed coming from (Smartphone class)
        System.out.print(obj.ram); // 0 will be printed coming from Parent class (Phone Class)
    }
}

