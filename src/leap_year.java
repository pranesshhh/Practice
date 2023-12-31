import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        int year;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year");
        year=in.nextInt();
        if(year%4==0 || (year%100==0 && year%400==0)){
            System.out.println("Year "+year+" is a Leap Year" );
        }
         else{
            System.out.println("Year "+year+" is a not a Leap Year");
        }
    }
}
