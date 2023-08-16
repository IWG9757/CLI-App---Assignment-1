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

        do {
            final String APP_TITLE = String.format("%s%s%s", COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("-".repeat(50));
            System.out.println(" ".repeat((50 - APP_TITLE.length() + 7)/2).concat(APP_TITLE));
            System.out.println("-".repeat(50));

            switch(screen){
                case DASHBOARD: 
                    System.out.println("\n[1]. Welcome to Smart Banking App\n[2]. Open New Account\n[3]. Deposit Money\n[4]. Withdraw Money\n[5]. Transfer Money\n[6]. Check Account Balance\n[7]. Drop Existing Account\n[8]. Exit\n");
                    System.out.println("Enter an option to continue > ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option){
                        case 1: screen = OPEN_ACCOUNT; break;
                        case 2: screen = DEPOSIT_MONEY; break;
                        case 3: screen = WITHDRAW_MONEY; break;
                        case 4: screen = TRANSFER_MONEY; break;
                        case 5: screen = CHECK_BALANCE;break;
                        case 6: screen = DROP_ACCOUNT; break;
                        case 7: System.exit(0); break;
                        default: continue;
                    }
                    break;



                case OPEN_ACCOUNT:
                    System.out.printf("New Account Number: SDB-S%d \n", (accountNumber.length+1));
                    boolean valid = false;
                    String name;

                    do{


                        System.out.println("Enter Account Holder Name: ");

                        
                        
                        name = scanner.nextLine().strip();

                        if(!name.isBlank()){
                            System.out.printf("%sName can't be empty%s\n",COLOR_RED_BOLD, RESET);
                        }

                        for (int i = 0; i < name.length(); i++) {
                           if(!(Character.isLetter(name.charAt(i)) || Character.isSpaceChar(name.charAt(i)))) {
                                System.out.printf("%sInvalid Names%s\n", COLOR_RED_BOLD, RESET);
                                valid = false;
                                break;
                            }
                        
                        }
                    }while(!valid);

                    

                }

            

            }while(true);
                
                    




        
    }
}