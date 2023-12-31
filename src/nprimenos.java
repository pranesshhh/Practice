//import java.util.Scanner;
public class nprimenos {
    public static void main(String[] args) {
        //  Scanner in = new Scanner(System.in);
        // System.out.println("Enter the value");
        // int n = in.nextInt();
        int f = 0;
        for (int n = 1; n <= 20; n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                System.out.println(n + " is a prime num");
            } else {
                System.out.println(n + " is not a prime num");
            }
            f=0;
        }
    }
}

