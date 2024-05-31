import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        System.out.println("enter account balance");
        Scanner sc= new Scanner(System.in);
        int balance= sc.nextInt();
        if(balance<0)
        {
            System.out.println("overdraft");
        }
        else if (balance>=0 && balance<=100)
        {
            System.out.println("Low Balance");
        }
        else {
            System.out.println("Healthy Balance");
        }
    }
}
