import java.util.Scanner;

import static java.lang.System.in;

public class calculator {
    public static void main(String[] args) {
        int a,b,c,ch;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Choice");
        ch=in.nextInt();

        System.out.println("Enter Two Values");
        a=in.nextInt();
        b=in.nextInt();

        switch (ch)
        {
            case 1:
            c=a+b;
                System.out.println("Addition "+(a+b));
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction "+(a-b));
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication "+(a*b));
                break;
            case 4:
                c=a/b;
                System.out.println("Division "+(a/b));

                break;
            default:
                System.out.println("Entered Wrong Choice");
                break;
        }




    }
}
