import java.util.Scanner;
public class multiplication_tables {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=in.nextInt();
        System.out.println("Enter the limit");
        int s=in.nextInt();
        for(int i=1;i<=s;i++){
            System.out.println(n+"x "+i+" = "+(n*i));
        }

}}
