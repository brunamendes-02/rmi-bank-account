import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankAccountImpl extends UnicastRemoteObject implements BankAccount {

    private double balance;

    public BankAccountImpl() throws RemoteException {
        super();
        balance = 0;
    }

    @Override
    public synchronized void deposit(double amount) throws RemoteException {
        balance += amount;
        System.out.println("Deposit completed: $" + amount);
    }

    @Override
    public synchronized void withdraw(double amount) throws RemoteException {

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal completed: $" + amount);
    }

    @Override
    public synchronized double getBalance() throws RemoteException {
        return balance;
    }
}