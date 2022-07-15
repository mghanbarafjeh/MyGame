import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {

    public static int readNumber()throws InputMismatchException {
        boolean ok=false;
        int c=0;
        while (!ok)
        {
            try
            {
                Scanner x = new Scanner(System.in);
                c = x.nextInt();
                ok=true;
                return c;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Enter a *** NUMBER ***");

            }

        }
        return c;

    }
}
