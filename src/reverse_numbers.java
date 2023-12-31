import java.util.Scanner;
public class reverse_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=in.nextInt();
        int rem;
        int reverse=0;
        while(n!=0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;

        }
        System.out.println("Reverse of the given value "+reverse);
}
}
