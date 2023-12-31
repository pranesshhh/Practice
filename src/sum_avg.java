import java.util.Scanner;
public class sum_avg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        int sum=0,a;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the number "+i+" ");
            a=in.nextInt();
            sum+=a;//sum=sum+a;

        }
        System.out.println("The Sum of "+n+" numbers is "+sum);
        System.out.println("The Average of "+n+" numbers is "+sum/n);

    }
}
