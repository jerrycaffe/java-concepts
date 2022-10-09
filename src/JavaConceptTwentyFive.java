class ParentTwentyFive{
    void canBeOverridden(int a, int b){
        System.out.println("Parent Sum is : "+(a+b));
    }
    final void cannotBeOverridden(int a, int b){
        System.out.println("Parent cannot be overridden : "+(a+b));
    }
}
class ChildTwentyFive extends ParentTwentyFive{
    @Override
    final void canBeOverridden(int a, int b){
        System.out.println("Child Sum is : "+(a+b));
    }
//    @Override // This throws error because it is overridden a more restricted method
//    void cannotBeOverridden(int a, int b){
//        System.out.println("Parent cannot be overridden : "+(a+b));
//    }
}
public class JavaConceptTwentyFive {
    public static void main(String[] args) {
        ChildTwentyFive ch = new ChildTwentyFive();
        ch.canBeOverridden(10, 2); //Prints Child Sum is : 12

    }
}
