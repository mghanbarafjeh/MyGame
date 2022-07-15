import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeSmallestNumbers {
    private ArrayList list;
    private  int number;
    public ThreeSmallestNumbers(){
        list = new ArrayList();
        number=0;
    }

    public void findSmallestNumbers(){
        while (number != -1)
        {
            number = ReadNumber.readNumber();
            if (number != -1)
            list.add(number);
        }
        Collections.sort(list);
        System.out.println("Min1 is : " + list.get(0));
        System.out.println("Min2 is : " + list.get(1));
        System.out.println("Min3 is : " + list.get(2));
    }



}
