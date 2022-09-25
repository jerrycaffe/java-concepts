//When 3 variables are involved in concatenation, 1 string and 2 integers
//if the string comes first before the two integers, concatenation would be performed
//if the string comes last, the compiler will first add the two integers then concatenate the result with the string
public class JavaConceptTwelve {
    public static void main(String args[])
    {
        String s1 = "Java";
        int var1 = 1;
        int var2 = 2;

        String s2 = "";
        s2 = s1+var2;
        System.out.println("s2 "+s2);
        System.out.println(var2+var1+s2); //this  prints 3Java2
        System.out.println(s1+var1+var2); //This prints Java12
    }}
