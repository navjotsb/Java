import java.util.Scanner;
public class triangle
{
    public static void main(String[] args) {
        System.out.println("Enter the three sides of triangle");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        if( x==y && z==x && y==z)
        {
            System.out.println("equilateral triangle");
        }
        else if(x==y || z==x || y==z)
        {
            System.out.println("isosceles");
        }
        else {
            System.out.println("scalene");
        }


    }
}
