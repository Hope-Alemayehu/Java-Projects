import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] gameBoard={{' ','|',' ','|',' ' },
                    {'-','+','-','+','-' },
                    {' ','|',' ','|',' ' },
                    {'-','+','-','+','-' },
                    {' ','|',' ','|',' ' }};
       
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your placment (1-9): "); //
        int pos =scan.nextInt();
        System.out.println(pos);
       //to call the methood place piece and it have three args  
        placePiece(gameBoard, pos,"player");
        Random rand = new Random();
        int cpuPos = rand.nextInt(9)+1;
        placePiece(gameBoard, cpuPos,"cpu");
        
        //this method set the scene aka print the game board literally
        printGameBoard(gameBoard);
    }

 public static void printGameBoard(char[][] gameBoard) {
     for(char[] row:gameBoard){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
public static void placePiece(char[][] gameBoard ,int pos, String user) {
    // to change the x and o based on the user
    char symbol= ' ';
    if (user.equals("player")){
        symbol='X';
    } else if (user.equals("cpu")){
        symbol='O';
    }

    switch(pos){
        case 1:
            gameBoard[0][0]=symbol;
            break;
        case 2:
            gameBoard[0][2]=symbol;
            break;
        case 3:
            gameBoard[0][4]=symbol;
            break;
        case 4:
            gameBoard[2][0]=symbol;
            break;
        case 5:
            gameBoard[2][2]=symbol;
            break;
        case 6:
            gameBoard[2][4]=symbol;
            break;
        case 7:
            gameBoard[4][0]=symbol;
            break;
        case 8:
            gameBoard[4][2]=symbol;
            break;
        case 19:
            gameBoard[4][4]=symbol;
            break;
        default:
            break;
    }
}
} 
    
