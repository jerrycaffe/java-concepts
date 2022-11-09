//Overridden method in child class cannot have different return type
class ParentFortyNine{
    void greeting(){
        System.out.println("Parent called");
    }
}
class ChildFortyNine extends ParentFortyNine{
    int greeting(){ //gives error
        System.out.println("Child called");
        return 1;
    }

}
public class JavaConceptFortyNine {

}
