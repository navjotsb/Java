import java.util.Scanner;

public class twenty {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        boolean result = more20(n);
        System.out.println(result);
    }
    public static boolean more20(int n)
    {
        if(n%20==1 || n%20==2)
            return true;
        else
            return false;
    }
}
