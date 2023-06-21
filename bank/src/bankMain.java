import java.util.Scanner;

/**
 * bankMain
 */
public class bankMain {
    

    

    public static void main(String[] args) {
        bank b=new bank();
        int n;
        Scanner scanner =new Scanner(System.in);
        boolean continueLoop =true;
        while(continueLoop){        
        
     
        System.out.println("If you would like to deposit,Enter 1 :");
        System.out.println("If you would like to withdraw,Enter 2 :");
        n= scanner.nextInt();
        scanner.nextLine();

        switch (n){
            case 1:
                b.depositing();
                break;
        
            case 2:
                b.withdrawing();
                break;
            default:
                System.out.println(("Invlaid Choice"));
                break;
        }
        System.out.println("Do you want to continue? Enter 'Y'to coninue or any other key to exit");
        String userInput =scanner.nextLine();
        //equalsIgnoreCase is used to make sure the input whatever the case to work 
        //in this case unless userInput is y or Y it will set continueLoop to false

        if (!userInput.equalsIgnoreCase("Y"))  {
            continueLoop=false;
        }  

        }
        scanner.close();
    }
}
    