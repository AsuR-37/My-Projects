import java.util.*;

class ATM {
            private double balance;
           ArrayList<String> statement;

            ATM(){
                balance = 0.0;
                statement  = new ArrayList<>();
            }

            private void showBalance(){
                System.out.println("Your Balance Is : "+balance);
            }

       public void showmenu(){
               Scanner sc =  new Scanner(System.in);
               int choice;

               do { 
                     System.out.println("\n====== ATM Interface ======");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.println("6. Check Balance :");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

                 switch (choice) {
                case 1:
                    showStatement();
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    deposit(sc);
                    break;
                case 4:
                    transfer(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using ATM!");
                    break;
                     case 6:
                    showBalance();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

               } while (choice!=5);
       }
       
       private void showStatement(){
        if(statement.isEmpty()){
               System.out.println("No transaction");
        }
        else{
                 for(String record : statement){
                      System.out.println(record);
                 }   
                    
        }

        
       }

           private void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            statement.add("Withdrawn: ₹" + amount);
            System.out.println("Withdrawal successful.");
        }
    }

        private void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ₹ : ");
        double amount = sc.nextDouble();
        balance += amount;
        statement.add("Deposited: ₹ " + amount);
        System.out.println("Deposit successful.");
    }
        private void transfer(Scanner sc) {
        System.out.print("Enter receiver's name: ");
        sc.nextLine(); // clear buffer
        String name = sc.nextLine();
        System.out.print("Enter amount to transfer: ₹");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            statement.add("Transferred ₹" + amount + " to " + name);
            System.out.println("Transfer successful.");
        }
    }
}
public class AtmInterface {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
    System.out.print("Enter User ID: ");
        String userid = sc.nextLine(); // Full line read karega

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine(); // Full line read karega
     
     if(userid.equals("Govind 123") && pin.equals("8120")){
         ATM atm = new ATM();
         atm.showmenu();
     }else{
              System.out.println("Invalid pin or User ID :  access denied");

     }

    }
}
