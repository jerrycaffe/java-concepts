//In Java the order of compiling is that the global variable is first initialized
//after this the constructor is initialized
//In the code below the global variable (Python) is called first

class Python {
    public Python(){
        System.out.println("Java initialized global variable before constructor");
    }
}

public class JavaConceptSeven {
    Python x = new Python();

    JavaConceptSeven(String i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        JavaConceptSeven javaConst = new JavaConceptSeven("Java constructor is initialized");


    }
}


