import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        System.out.println("enter a character ");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        character = Character.toLowerCase(character); // convert capital letters to lower case
        int asciiValue = (int) character; // ascii value of character
        if (asciiValue == 97 || asciiValue == 101 || asciiValue == 105 || asciiValue == 111 || asciiValue == 117) {
            System.out.println(" vowel");
        } else {
            System.out.println("consonant");
        }
    }
}


        /* switch (character)
        {
            case 'a':   //97
            case 'e':   //101
            case 'i':   //105
            case 'o':   //111
            case 'u':   //117
            {
                System.out.println("character is a vowel " + asciiValue);
                break;
            }
            default:
            {
                System.out.println("not a vowel");
                break;
            }
        }
    }
} */
