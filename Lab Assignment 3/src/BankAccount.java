
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
/**
 * @author Raymond Chin 012754597
 */
/**
A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount
{
    private double balance;
    private int accountNumber;
 
    /**
Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0.0;
        accountNumber = 0;
    }
    /**
Constructs a bank account with a given account number and a initial balance.
 
     */
    public BankAccount(double b, int a)
    {
        balance = b;
        accountNumber = a;
    }
    /**
Reads an account number and balance.
@param in the scanner
     * @throws IOException 
 
     */
    public void read(Scanner in) throws IOException
    {
            String accNum = "";
            String bal = "";
            String line = in.nextLine();
            String[] delim = line.split(" ");
            try
            {
                accNum = delim[0];
                bal = delim[1];
                accountNumber = Integer.parseInt(accNum);
                balance = Double.parseDouble(bal);
            } catch(NumberFormatException e) {
 
                throw new IOException("End of file expected");
            }
     
    }
 
 
    //Note: You need to check for incompatible input.
 
    /**
Deposits money into the bank account.
@param amount the amount to deposit
     */
    public void deposit(double money)
    {
        balance = balance + money;
    }
    /**
Withdraws money from the bank account.
@param amount the amount to withdraw
     */
    public double withdraw(double money)
    {
 
        balance = balance - money;
        System.out.println("Your new balance is: " + balance);
        return money;
 
 
    }
    /**
Gets the current balance of the bank account.
@return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    /**
Gets the account number of the bank account.
@return the account number
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }
 
}