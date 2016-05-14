import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.NoSuchElementException;
/**
 * @author Raymond Chin 012754597
 */
/**
A bank contains account numbers and balances of each customer.
 */
public class Bank
{
    private ArrayList<BankAccount> accountList;
 
    /**
Construct a Bank object.
     */
public Bank(){
	accountList = new ArrayList<BankAccount>();
}
 
    /**
Reads a file with account numbers and balances and adds the accounts
to the bank.
@param filename the name of the file
     */
    public void readFile(String filename) throws IOException
    { //Create File object, a scanner object to read data from the file.
        //call the method read 
         
    	File reader = new File(filename);
        Scanner in = new Scanner(reader);
        try
        {
           
            read(in);
            
 
        }catch(FileNotFoundException e){
            throw new IOException();
        }
        catch(NoSuchElementException e){
        	throw new InputMismatchException();
        }
        finally
        {
            in.close();
        }
    }
 
    // Note: call the method read
 
    /**
Read a file with account numbers and balances and adds the accounts
to the bank.
@param in the scanner for reading the input
     */
    private void read(Scanner in) throws IOException
    {
        while (in.hasNextLine())
        {//Create a BankAccount object
            //input data for the BankAccount object
            //Add the BankAccount object to the accountlist 
            BankAccount ba = new BankAccount();
            try{
                ba.read(in);
            }catch(NoSuchElementException e){
                throw new IOException();
            }
            adder(ba);
             
        }
    }
 
    /**
Add an account to the bank.
@param b the BankAccount reference
     */
    public void adder(BankAccount b)
    {
        accountList.add(b);
    }
    /**
Gets the account with the highest balance.
@return the account with the highest balance
     */
    public BankAccount getHighestBalance()
    {
        BankAccount highest = accountList.get(0);
        for(int i = 1; i<accountList.size();i++)
        {
            if(highest.getBalance()<accountList.get(i).getBalance())
            {
                highest=accountList.get(i);
            }
        }
        return highest;
    }
}