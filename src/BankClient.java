import java.rmi.Naming;

public class BankClient {

    public static void main(String[] args) {

        try {

            BankAccount account =
                    (BankAccount) Naming.lookup("rmi://localhost/BankAccount");

            account.deposit(500);

            account.withdraw(200);

            double balance = account.getBalance();

            System.out.println("Current balance: $" + balance);

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}