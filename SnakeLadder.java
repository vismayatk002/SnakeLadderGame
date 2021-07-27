import java.util.*;  
import java.lang.*;
public class SnakeLadder{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        //initialise position as 0
        int position = 0;
        int min = 1;
        int max = 6;
        System.out.println("Press 1 for Roll the Die :");
        int number = sc.nextInt();
        if(number == 1){

            int dieNumber = (int)(Math.random() * (max - min +1) + min);
            System.out.println("Dies number : " + dieNumber);
        }
        else{

            System.out.println("Not Valid");

        }
    }
}