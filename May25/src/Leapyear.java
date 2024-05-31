import java.util.Scanner;

public class Leapyear
{
    public static void main(String[] args) {
        System.out.println("enter a year");
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Entered year is a leap year");
        }
        else
        {
            System.out.println("entered year is not a leap year");
        }
    }
}
