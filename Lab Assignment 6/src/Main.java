
import java.util.Set;
import java.util.TreeSet;
/**
 * This will be your main to run the code.
 * @author Raymond Chin 012754597
 */
public class Main 
{
 
 public static void main(String[] args)
 {
  Set<Integer> yourTicket;
  Set<Integer> winningTicket;
  Set<Integer> matchingNum;
  Lottery lotto = new Lottery();
  winningTicket = lotto.generateWinningNumbers();
  yourTicket = lotto.getTicket();
  matchingNum = lotto.areYouaWinner(yourTicket,winningTicket);
  System.out.println("Your ticket was: " + yourTicket.toString());
  System.out.println("Winning Numbers: " + winningTicket.toString());
  System.out.println("Matching Numbers: " + matchingNum.toString());
  switch(matchingNum.size())
  {
  case 0: System.out.println("Sorry you are not a winner.");
  break;
  
  case 1: System.out.println("Your Prize is $250!");
  break;
  
  case 2: System.out.println("Your Prize is $500!");
  break;
  
  case 3: System.out.println("Your Prize is $1000!");
  break;
  
  case 4: System.out.println("Your Prize is $25,000!");
  break;
  
  case 5: System.out.println("Your Prize is $75,000!");
  break;
  
  case 6: System.out.println("OMG OMG OMG OMG OMG ");
  System.out.println("YOU WON THE GRAND PRIZE OF $1,000,000");
  System.out.println("Can you do it again?");
  break;
  }
 }

}
