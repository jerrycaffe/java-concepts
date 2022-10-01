//though you can directly call static method
//When a static override method is called from the child reference, the parent is called instead
class Computer{
    void ram(String value){
        System.out.println("Computer Non Static ram: "+value);
    }
    static void hardDisk(String value){
        System.out.println("Computer Static HardDisk: "+value);
    }
}
class Laptop extends Computer{
    void ram(String value){
        System.out.println("Laptop Non Static ram: "+value);
    }
    static void hardDisk(String value){
        System.out.println("Laptop static hard disk: "+value);
    }
}
public class JavaConceptSeventeen {
    public static void main(String[] args) {
        Computer c = new Laptop();
        c.ram("20GB");
        c.hardDisk("30gb");

    }
}
