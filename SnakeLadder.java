import java.util.*;  
import java.lang.*;
public class SnakeLadder{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        //initialise position as 0
        int position = 0;
        int min = 1;
        int max = 6;
        int play;

        // Iterate till position  reaches 100
        while(position <= 100 ){
            System.out.print("Press 1 for Roll the Die : ");
            play = sc.nextInt();
            if(play == 1){
                // Get dies number
                int dieNumber = (int)(Math.random() * (max - min +1) + min);
                System.out.println("Dies number : " + dieNumber);
                // Get options 
                int checkOption = (int)(Math.random() * 10) % 3;
                
                switch(checkOption){
                    case 0 : 
                        System.out.println("Option : No play ");
                    break;
                    case 1 : 
                        System.out.println("Option : Ladder ");
                        position += dieNumber;
                    break;
                    case 2 : 
                        System.out.println("Option : Snake ");
                        position -= dieNumber;
                    break;
                }
                // Reset position value to 0 when it is negative
                if(position < 0){
                    position = 0;
                }
                System.out.println("Current position : " + position + "\n");  
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        System.out.println("You won the game !! ");       

    }
}