import java.util.ArrayList;
import java.util.Scanner;

public class PCGuess {
    private int max;
    private int min;
    private ArrayList numbers;
    private int guess;
    private String result;

    public PCGuess(){
        numbers = new ArrayList();
        result = "false";
        guess=0;
        max=100;
        min=0;
    }

    public void guessNumber(Scanner input){
        while (!result.equals("t"))
        {
            guess = rand(max, min);
            if (!numbers.contains(guess))
            {
                numbers.add(guess);
                System.out.println("Is it " + guess + " ?");
                result = input.next();
                if (result.equals("b")) {
                    min = guess;
                    guess = rand(max, min);
                }
                if (result.equals("s")) {
                    max = guess;
                    guess = rand(max, min);
                }
                System.out.println("Max is: " + max);
                System.out.println("Min is  :" + min);

            }
        }
        System.out.println("Great! I found your number which was " + guess);
    }


    private static int rand (int max, int min){
        int b = (int) (Math.random()*(max-min+1)+min);
        return b;
    }
}
