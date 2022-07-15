import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class YouGuess {

    private int guess;
    private int start;
    private int end;
    private int attempt = 0;
    Random r = new Random();
    private int a;

    public YouGuess(int end){
        guess=-1;
        this.start=0;
        this.end=end;
        attempt=0;
        a = r.nextInt(end);

    }


    public void guessNumber(){
        boolean status=false;

        while (!status)
        {

            try
            {
                // for InputMismatchException Scanner needs to be initialized in TRY or WHILE block.
                // for NumberFormatException Scanner can be initialized outside of loop but, we need to write
                // int a = INTEGER.parseINT(input.next()) then catch NumberFormatException.
                Scanner input = new Scanner(System.in);
                while (guess != a & !status)
                {
                   // guess =Integer.parseInt(input.next()) ;

                    guess = input.nextInt();
                    if (guess > start && guess < a)
                    {
                        start = guess;
                        System.out.printf("Guess a number between %s and %s\n", start, end);
                        attempt++;
                    } else if (guess < end && guess > a)
                    {
                        end = guess;
                        System.out.printf("Guess a number between %s and %s\n", start, end);
                        attempt++;
                    } else
                    {
                        System.out.printf("Guess a number between %s and %s\n", start, end);
                        attempt++;
                    }
                }status=true;

                System.out.printf("Great! after %s times you found the number which was %s\n", attempt, a);
            }

            catch (InputMismatchException e)
            {
                System.out.println("The input only accepts NUMBERS not letters or any symbols.");
                System.out.printf("Guess a number between %s and %s\n", start, end);
            }
        }
    }
    private static int setDifficulty(){
        int number = 0;
        System.out.println("Input Character");
        Scanner k = new Scanner(System.in);
        while (number == 0){
            System.out.println("Please chose a level.\nPress 'E' for easy\nPress 'M' for medium\nPress 'H' for Hard.\n");
            char c = k.next().toLowerCase().charAt(0);
            switch (c)
            {
                case 'e':
                    number=10;break;
                case 'm':
                    number = 100;break;
                case 'h':
                    number = 1000;break;
                default:
                    System.out.println("You have chosen a wrong input\nPlease try again!");
            }}
        return number;
    }

}
