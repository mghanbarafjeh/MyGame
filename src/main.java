import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static Scanner k = new Scanner(System.in);
    public static void main(String[] args){
        boolean status = false;

        while (!status) {

            try {

                printMenu();
                int sw = Integer.parseInt(k.next());
                while (sw != 6) {
                    switch (sw) {
                        case 1:
                            System.out.println("Please chose a level.\nPress 'E' for easy\nPress 'M' for medium\nPress 'H' for Hard.\n");
                            int b = setDifficulty(k.next().charAt(0));
                            YouGuess g01 = new YouGuess(b);
                            System.out.printf("Please enter a number between %s and %s\n", 0, b);
                            g01.guessNumber();
                            break;
                        case 2:
                            System.out.println("Keep a number in your mind. I guess a random number between 0 to" +
                                    " 100 .\nIf your number is bigger than mine, press 'B'\nIf it's less than mine press 'S'\n" +
                                    "If it is true press 'T'. ");
                            System.out.println("Press any key to Start.");
                            k.next();
                            PCGuess g02 = new PCGuess();
                            g02.guessNumber(k);
                            break;
                        case 3:
                            System.out.println("This program returns 3 of the biggest numbers you have entered." +
                                    "enter a number and then press enter.\n*** To stop please press \"-1\"");
                            ThreeBiggestNumber g03 = new ThreeBiggestNumber();
                            g03.findBiggestNumbers(k);
                            break;
                        case 4:
                            System.out.println("This program returns 3 of the smallest numbers you have entered." +
                                    "enter a number and then press enter.\n*** To stop please press \"-1\"");
                            ThreeSmallestNumbers g04 = new ThreeSmallestNumbers();
                            g04.findSmallestNumbers(k);
                            break;
                        case 5:
                            System.out.println("This program reverses a word. Enter a name or something and see the reversed. ");
                            ReverseString r = new ReverseString(new Scanner(System.in).nextLine());
                            System.out.println(r.reverseIt());
                            break;
                        default:
                            System.out.println("You choose a wrong option!");

                    }
                    printMenu();
                    sw = Integer.parseInt(k.next());
                    status = true;

                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a *** NUMBER ***");
            }
        }








    }
    private static void printMenu(){
        System.out.println();
        System.out.println("************************");
        System.out.println();
        System.out.println("Please enter a number to start one of the following programs.");
        System.out.println("-------------------------------------------------------------");
        System.out.println("==> Press 1 to start YouGuess");
        System.out.println("==> Press 2 to start PCGuess");
        System.out.println("==> Press 3 to start Find three biggest numbers");
        System.out.println("==> Press 4 to start Find three smallest numbers");
        System.out.println("==> Press 5 to start Reverse Word.");
        System.out.println("==> Press 6 to Exit");

    }
    private static int setDifficulty(Character c){
        int end=0;
        if (c=='e')
            end=10;
        if (c=='m')
            end=100;
        if (c=='h')
            end=1000;
        return end;
    }
    private static int readNumber()throws InputMismatchException {
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
