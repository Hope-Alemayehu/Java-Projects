import java.util.Scanner;

/**
 3.Implement a class representing a bank account. Include methods for depositing and withdrawing money, as well as a property to track the account balance.

 */
public class bank {
    double initalMoney;
    double depMoney;
    double sentcash;
    Scanner scan =new Scanner(System.in);
    bank(){
        System.out.println("*****WELCOME USER*****");
        System.out.println("How much do you have in your account: ");
        
        initalMoney =scan.nextDouble();
        

    }

    void depositing(){
        System.out.println("How much would you like to deposite: ");
        depMoney=scan.nextDouble();
        if (depMoney < 0){
            System.out.println("Enter valid number");
        }
        else{
            System.out.println("You have deposited "+ depMoney +" birr.");
            System.out.println("you're current amount is: "+(initalMoney+depMoney)+" birr");
        }

    }

    void withdrawing(){
        
        System.out.println("How much would you like to withdraw: ");
        sentcash=scan.nextDouble();
        if (sentcash> initalMoney){
            System.out.println("You don't have enough amount.Try again");
        }
        else{
            System.out.println("You have withdrawn: "+ sentcash+" birr.");
            System.out.println("you're current amount is: "+(initalMoney-sentcash)+" birr");
        }

    }
    
}