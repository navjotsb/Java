import sun.misc.Version;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("enter a no ");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        if(num1%2==0)
        {
            System.out.println("entered no is even");
        }
        else
        {
            System.out.println("entered no is odd");
        }

    }
}
