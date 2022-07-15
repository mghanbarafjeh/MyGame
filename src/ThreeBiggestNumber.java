import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeBiggestNumber {
    private int max1;
    private int max2;
    private int max3;
    private int number;

    public ThreeBiggestNumber(){
        max1=0;
        max2=0;
        max3=0;
        number=0;
    }

    public void findBiggestNumbers(){

        while (number != -1){
            number=ReadNumber.readNumber();
            if (number>max1){
                max3=max2;
                max2=max1;
                max1=number;
            }
            if (number>max2 && number<max1){
                max2 = number;
            }
            if (number<max2 && number>max3 && number<max1){
                max3 = number;
            }
        }
        System.out.println("Max1 is : " + max1);
        System.out.println("Max2 is : " + max2);
        System.out.println("Max3 is : " + max3);

    }



}
