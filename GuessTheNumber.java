import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber{
    public static void main(String[] args){

        //use Random class to generate random number
        Random rand =new Random();
        //we bound the random number only in between 1 and 100

        int randomNumber = rand.nextInt(1,100);
        
        //to count the number of tries
        int tryCounts=0;
        while(true){

        tryCounts++;
        System.out.println("Enter Your guess (1,100)");
        //creating object to use the scanner class
        Scanner scanner =new Scanner(System.in);
        //setting the value we accept to a variblle to hold it
        int playerGuess = scanner.nextInt();
        if (playerGuess==randomNumber){
            System.out.println("Correct!!! you win!");
            System.out.println("It took you "+tryCounts+" tries");
            break;

        }
        else if (randomNumber>playerGuess){
            System.out.println("Nope!number is Higher guess again");

        }
        else{
            System.out.println("Nope!number is lower guess again");
        }

        }

       
    }

}