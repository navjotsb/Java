
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int luckyno= 13;

        int chances=3;
        do
        {
            System.out.println("you have "+ chances + " chances left");
            System.out.println("enter a no");
            Scanner sc= new Scanner(System.in);
            int userno= sc.nextInt();
            if(userno==luckyno)
            {
                System.out.println("congratulations you won");
                break;
            }
            else{
                System.out.println("You entered wrong no");
                chances--;
            }
        } while(chances!=0);

    }
}
