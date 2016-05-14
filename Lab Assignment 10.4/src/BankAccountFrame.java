import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BankAccountFrame extends JFrame
{
private BankAccount account;
private JLabel label;
private JTextField amountField;
private static final int FRAME_WIDTH =400;
private static final int FRAME_HEIGHT = 100;
public BankAccountFrame(BankAccount acc)
{
	account = acc;
	label = new JLabel("Balance = " + account.getBalance());
	JLabel amount = new JLabel("Amount: ");
	amountField = new JTextField(5);
	
	JPanel ctrl = new JPanel();
	ctrl.add(amount);
	ctrl.add(amountField);
	

	
	add(ctrl);
	setSize(FRAME_WIDTH,FRAME_HEIGHT);

JButton depositButton;
JButton withdrawButton;
withdrawButton = new JButton("Withdraw");
withdrawButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		double money = Double.parseDouble(amountField.getText());
		
		account.withdraw(money);
		label.setText("Balance = " + account.getBalance());
	}
		
});
ctrl.add(withdrawButton);

depositButton = new JButton("Deposit");
depositButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double money = Double.parseDouble(amountField.getText());
				
				account.deposit(money);
				label.setText("Balance = " + account.getBalance());
			}
		});
ctrl.add(depositButton);
ctrl.add(label);


/*
{
	JButton depositButton = new JButton("Deposit");
	
	class DepositListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			double money = Double.parseDouble(amountField.getText());
			
			account.deposit(money);
			label.setText("Balance = " + account.getBalance());
		}
	}
	
	ActionListener l = new DepositListener();
	depositButton.addActionListener(l);
	return depositButton;
	
}
private JButton withdrawButton() {
	JButton withdrawButton = new JButton("Withdraw");

	class WithdrawListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			double money = Double.parseDouble(amountField.getText());

			account.withdraw(money);
			label.setText("Balance =" + account.getBalance());
	}
}

ActionListener l = new WithdrawListener();
withdrawButton.addActionListener(l);
return withdrawButton;
*/
}

}
