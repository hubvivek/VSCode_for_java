import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();   
        float B = sc.nextFloat();   
        float C = sc.nextFloat();   
        double ans = A+B+C/3;
        System.out.println("ans is : "+ans);

    }
      
}