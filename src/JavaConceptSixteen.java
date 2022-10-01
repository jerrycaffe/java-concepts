//When a global variable is redeclare inside a function it changes from global to local variable within the function
class PhoneSixteen{
    String sixteen_obj = "global phone";
    public void getPhone(){
        sixteen_obj = "local phone";
        System.out.println("Inside PhoneSixteen : "+this.sixteen_obj+" / " + sixteen_obj);
    }
}

class SmartPhoneSixteen{
    String sixteen_obj = "global smart phone";
    public void getSmartPhone(){
        String sixteen_obj;
        sixteen_obj = "local smart phone";
        System.out.println("Inside smart Phone Sixteen : "+this.sixteen_obj+" / "+sixteen_obj);
    }
}

public class JavaConceptSixteen {
    public static void main(String[] args) {
new PhoneSixteen().getPhone();
new SmartPhoneSixteen().getSmartPhone();
    }
}
