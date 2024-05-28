import java.util.Scanner;
public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the speed of the car");
        int speed = sc.nextInt();

        System.out.println("is it Driver's Birthday? (true/false) ");
        boolean isBirthday = sc.nextBoolean();

        int result = caughtSpeeding(speed, isBirthday); //int result = SpeedingTicket.caughtSpeeding(speed, isBirthday);
        System.out.println(result);

    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65)
                return 0;
            else if (speed >= 86)
                return 2;
            else
                return 1;
        } else {
            if (speed <= 60)
                return 0;
            else if (speed >= 81)
                return 2;
            else
                return 1;
        }
    }
}


