import java.util.*;

public class REPL {
    public static void main(String[] args) {

        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        do {
            System.out.printf("1. Check Balance%n2. Deposit%n3. Withdraw%n4. Exit%n>>");
            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.printf("Your balance is $%d%n", balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    balance += sc.nextInt();
                    System.out.println("Deposit successful");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (balance == 0){
                        System.out.println("Your balance is $0, withdraw not available");
                    }
                    else if ((balance - withdrawAmount) < 0){
                        System.out.println("Your selected withdraw amount is not available, please select a different amount");
                    }
                    else{
                        balance -= withdrawAmount;
                    }
                    break;
                case 4:
                    System.out.println("Exit complete, have a nice day");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Please choose a valid selection");

            }
        }
        while (keepGoing);
    }
}