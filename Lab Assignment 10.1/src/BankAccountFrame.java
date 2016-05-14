import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankAccountFrame extends JFrame 
{
	private BankAccount account;
public BankAccountFrame(BankAccount acc)
{
	account = acc;
	
	//settings for window
	setSize(450,100);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//panel object
	JPanel panel = new BankAccountPanel(account);
	this.add(panel);
	
	
}

}
