public class largestdatatype {
    public static void main(String[] args) {
        char c = 'a';
        byte b = 4;
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.99;

        double result = (f*b) +  (i%c)- (d*s);
        System.out.println("result is :"+ result);
    }
    
}
