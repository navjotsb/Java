import java.util.Scanner;

public class greaterno {
    public static void main(String[] args) {
        System.out.println("enter 3 nos");
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println(num1 + " is biggest");
        }

        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2 + " is biggest");
        }
        else if(num1==num2 && num2==num3) {
            System.out.println("all no are equal");
        }
        else
        {
            System.out.println("no 3 are biggest");
        }

    }
}
/* int maxi= Math.max(num1,Math.max(num2,num3));
        System.out.println(maxi); */