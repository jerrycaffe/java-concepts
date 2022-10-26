interface AnonymousThirtyNine {
    public void setValue(int data);
}

public class JavaConceptThirtyNine {
    public static void main(String[] args) {

        AnonymousThirtyNine anonymous = new AnonymousThirtyNine() {
            int data = 0;

            @Override
            public void setValue(int data) {
                this.data = data;
            }
            public int getValue(int data){
                return data;
            }
        };

        anonymous.setValue(8);
//        anonymous.getValue(); This method is not available because it was not delared in the interface
    }
}
