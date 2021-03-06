import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountPanel extends JPanel implements ActionListener

{
	//TextFields, JLabels, and JButtons for Panel
	public JTextField amountTextField;
	public JLabel amountLabel, balanceLabel;
	public JButton withdrawButton, depositButton;
	public BankAccount account;
	


	public BankAccountPanel(BankAccount acc)
	{
		account = acc;


		//display panel & button panel
		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel displayPanel2 = new JPanel();


		//amountLabel
		amountLabel = new JLabel("Amount: ");
		displayPanel.add(amountLabel);

		//amount text field
		amountTextField = new JTextField(10);
		displayPanel.add(amountTextField);

		//balance text field
		balanceLabel = new JLabel("Balance = "+ account.getBalance());

		displayPanel2.add(balanceLabel);


		//buttons
		withdrawButton = new JButton("Withdraw");
		depositButton = new JButton("Deposit");
		withdrawButton.addActionListener(this);
		depositButton.addActionListener(this);
		buttonPanel.add(withdrawButton);
		buttonPanel.add(depositButton);

		//adding to main panel
		this.setLayout(new BorderLayout());
		this.add(displayPanel, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.EAST);
		this.add(displayPanel2, BorderLayout.SOUTH);



	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		BankAccountListener listen = new BankAccountListener(this);
		listen.actionPerformed(e);

	}




}
