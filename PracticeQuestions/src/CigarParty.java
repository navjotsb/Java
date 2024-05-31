import java.util.Scanner;

public class CigarParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cigars: ");
        int cigars = sc.nextInt();

        System.out.print("Is it a weekend (true/false)? ");
        boolean isWeekend = sc.nextBoolean();

        boolean result = cigarParty(cigars, isWeekend);
        System.out.println(result);
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }
}