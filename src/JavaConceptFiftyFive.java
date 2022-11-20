
//Direct conversion from larger data type to small data type is not possible e.g double has the data type of 16 bit and int has the data type of 8bits
//Through the type casting version from larger datat ype to small data type is possible
//it is important to note the following data type and their sizes
//byte 1 -- byte, short -- 2 bytes, int -- 2 bytes, long 8 -- bytes, float 4 -- bytes, double -- 8 bytes, boolean -- 1 bit, char -- 2 bytes
public class JavaConceptFiftyFive {
    public static void main(String[] args) {

        int data1 = 20;
        double data2 = 25.0;
        short dataNum = 20;
        double data3 = data1;// No error because int is a smaller data type compared to double
        int data4 = (int) data2; //An error occurred due to the fact that double is bigger data type than int, the solution is that I need to type cast by adding (int)
        char data5 = (char) data1;
        double shorty = dataNum;
        System.out.println(data3+" "+data4+" "+data5);
    }
}
