import java.util.Scanner;

public class May21 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first and last name");
        String EmployeeName = scanner.nextLine();

        System.out.println("enter your Email");
        String Email = scanner.nextLine();

        System.out.println("enter your Phone No");
        String Phone = scanner.nextLine();

        System.out.println("enter your Address");
        String Address = scanner.nextLine();

        System.out.println("enter your Salary");
        int Salary = scanner.nextInt();

        System.out.println("Employee Name is is " + EmployeeName);
        System.out.println(EmployeeName + " Email is " + Email);
        System.out.println(EmployeeName + " Phone NO is " + Phone);
        System.out.println(EmployeeName + " Address is " + Address);
        System.out.println(EmployeeName + " Salary is " + Salary);
    }
}
