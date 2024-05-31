import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class DecisionMaking
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int num1 = sc.nextInt();
        if(num1>= 0)
        {
            System.out.println("enter no is positive");
        }
        else
        {
            System.out.println("enter no is negative");
        }
    }


    }


