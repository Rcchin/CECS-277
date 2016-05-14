
import java.util.*;

/**
 * This will be your lottery program which create sets for player and winning ticket

 * @author 012754597
 *
 */
public class Lottery 
{
 
 /**
  * This will generate the winning numbers
  * @return the winnnig ticket numbers
  */
 public static Set<Integer>generateWinningNumbers()
 {
  TreeSet<Integer> ticket = new TreeSet<Integer>();
  Random r = new Random();
  for(int i = 0; i<6; i++)
  {
   int number = r.nextInt(40)+1;
   while(ticket.contains(number))
   {
    number = r.nextInt(40)+1;
   }
   ticket.add(number);
  }
  return ticket;
 }
 /**
  * This get's player's ticket. Gets by user input.
  * @return player's ticket numbers
  */
 public static Set<Integer>getTicket()
 {
  Scanner input = new Scanner(System.in);
  TreeSet<Integer>ticket = new TreeSet<Integer>();

  System.out.println("Hello!!!! Welcome to Java Lottery!!!! Please enter 6 numbers ranging from 1-40!! Good Luck!!! :))");
  System.out.println("Disclaimer: Java Lottery is just a game you dont win real money. Sorry!!");
  for(int i = 0; i<6;i++)
  {
   System.out.println("Enter a number(" + (i+1) + "): ");
   int number = input.nextInt();
   
   while(number<1 || number>40||ticket.contains(number))
   {
    if(ticket.contains(number))
    {
     System.out.println("Error: No Duplicates! Please Try Again: " );
     number = input.nextInt();
    }
    if(number<1 || number>40)
    {
     System.out.println("Error make sure your number is between 1-40");
     number = input.nextInt();
    }
   }
   ticket.add(number);
  }
  return ticket;
 }
 /**
  * checks to see how many numbers are matching in two sets
  * @param playerTicket attempt to match numbers
  * @param winningNum winning numbers.(Numbers to match)
  * @return set with matching numbers
  */
 public Set<Integer>areYouaWinner(Set<Integer>playerTicket,Set<Integer>winningNum)
 {
  TreeSet<Integer>winNum = new TreeSet<Integer>();
  winNum.addAll(playerTicket);
  winNum.retainAll(winningNum);
  return winNum;
 }
 

}
