//When child class is initialized, the top parent constructor gets initialized first
class GrandParentThirteen{
    GrandParentThirteen(){
        System.out.println("Inside GrandParent class");
    }
}
class ParentThirteen extends GrandParentThirteen{
    ParentThirteen(){
        System.out.println("Inside Parent class");
    }
}
class ChildThirteen extends ParentThirteen{
    ChildThirteen(){
        System.out.println("Inside Child class");
    }
}
public class JavaConceptThirteen {
    public static void main(String[] args) {
        new ChildThirteen();
    }
}
