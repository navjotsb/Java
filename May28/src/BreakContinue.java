public class BreakContinue {
    public static void main(String[] args) {
        int x=0;
        do{

            System.out.println(x);
            x++;
            if(x==6)
            {
                break;
            }

        }while(x<=10);
    }
}
