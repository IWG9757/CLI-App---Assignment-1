import java.util.Scanner;

//Smart Banking App
public class CLI_Assignment1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J"; //To clear the terminal 
        final String COLOR_BLUE_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";
        final String COLOR_RED_BOLD = "\033[33;1m";
       
        final String DASHBOARD = "Welcome to Smart Banking App";
        final String OPEN_ACCOUNT = "Open New Account";
        final String DEPOSIT_MONEY = "Deposit Money";
        final String WITHDRAW_MONEY = "Withdraw Money";
        final String TRANSFER_MONEY = "Transfer Money";
        final String CHECK_BALANCE = "Check Account Balance";
        final String DROP_ACCOUNT = "Drop Existing Acccount";

        String[] accountHolderName = new String[0];
        String[] accountNumber = new String[0];

        String screen = DASHBOARD;


        
    }
}