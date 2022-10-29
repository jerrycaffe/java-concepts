//before methods cannot be defined in interface only declared
//from java 8, methods can be defined in interface but method has to be declared using default keyword

interface JavaFortyOne{
    int b =10;
    default void show(){
        System.out.println("Valud of "+b);
    };
}
//
//class JavaFoirtyOneChild implements JavaFortyOne{
//    JavaFortyOne obj = new JavaConceptFortyOne();
//}

class JavaConceptFortyOne implements JavaFortyOne{
    public static void main(String[] args) {
        JavaConceptFortyOne obj = new JavaConceptFortyOne();
        obj.show();
    }


}
