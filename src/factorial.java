import java.sql.SQLOutput;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=in.nextInt();
        int f=1;
        if(n>=1) {
            for (int i = 1; i <= n; i++) {
                f = f * i;

            }
            System.out.println("Factorial of " + n + " is " + f);
        }
        else{
            System.out.println("Error");
        }


    }
}
