import java.util.Scanner;

public class ageGroup {
    public static void main(String[] args) {
        System.out.println("enter a age");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age<=12)
        {
            System.out.println("child");
        } 
        else if (age>12 && age<20) 
        {
            System.out.println("teenage");
        }
        else if (age>19 && age<60) {
            System.out.println("adult");
        }
        else {
            System.out.println("Senior");
        }
    }
}
