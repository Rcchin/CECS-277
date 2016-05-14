import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BankAccountListener
{
	public JTextField amtTF;
	public JLabel amtL, bL;
	public JButton wB, dB;
	public BankAccount acc;
	public BankAccountListener(BankAccountPanel listen)
	{
		amtTF=listen.amountTextField;
		amtL=listen.amountLabel;
		bL =listen.balanceLabel;
		wB = listen.withdrawButton;
		dB = listen.depositButton;
		acc = listen.account;
	}
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == wB)
		{
			double money = Double.parseDouble(amtTF.getText());
			acc.withdraw(money);
			bL.setText("Balance = " + acc.getBalance());
			
		}
		if(source == dB)
		{
			double money = Double.parseDouble(amtTF.getText());
			acc.deposit(money);
			bL.setText("Balance = " + acc.getBalance());
		}
	}
	

}
