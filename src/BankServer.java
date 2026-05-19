import java.rmi.Naming;

public class BankServer {

    public static void main(String[] args) {

        try {

            BankAccountImpl account = new BankAccountImpl();

            Naming.rebind("rmi://localhost/BankAccount", account);

            System.out.println("Bank server is running.");

        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}