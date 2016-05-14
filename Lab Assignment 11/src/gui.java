import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class gui extends JFrame {
	// Declare check boxes
	private JCheckBox jCentered, jBold, jItalic;

	// Declare a combo box to hold font names
	private JComboBox jFontName = new JComboBox();

	// Declare a combo box to hold font sizes
	private JComboBox jFontSize = new JComboBox();

	// Font name
	private String fontName = "SansSerif";

	// Font style
	private int fontStyle = Font.PLAIN;

	// Font Size
	private int fontSize = 12;

	// Declare a panel for displaying message
	private MessagePanel messagePanel = new MessagePanel("Java is Cool");

	/** Main method */
	public static void main(String[] args) {
		gui frame = new gui();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true);
	}

	/** Default constructor */
	public gui() {
		setTitle("Message Center");

		// Set the background color of messagePanel
		messagePanel.setBackground(Color.yellow);

		// Find all available font names
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontnames = e.getAvailableFontFamilyNames();
		for (int i = 0; i < fontnames.length; i++) {
			jFontName.addItem(fontnames[i]);
		}
		jFontName.setSelectedItem("" + fontName);

		//adds font sizes
		for (int i = 1; i <= 100; i++) {
			jFontSize.addItem("" + i);
		}
		//sets it into box
		jFontSize.setSelectedItem("" + fontSize);

		JPanel p = new JPanel();
		JPanel p1 = new JPanel(new BorderLayout(10, 10));
		JPanel p2 = new JPanel(new BorderLayout(10, 10));
		JPanel p3 = new JPanel(new BorderLayout(10, 10));
		//adding to border layout
		p1.add(new JLabel("Font Name"), BorderLayout.WEST);
		p1.add(jFontName, BorderLayout.CENTER);

	
		
		p2.add(new JLabel("Font Size"), BorderLayout.WEST);
		p2.add(jFontSize, BorderLayout.CENTER);

		p3.setBorder(new EmptyBorder(10, 10, 10, 10));
		p3.add(p1, BorderLayout.CENTER);
		p3.add(p2, BorderLayout.EAST);

		//adds as check boxes
		p.add(jCentered = new JCheckBox("Centered"));
		p.add(jBold = new JCheckBox("Bold"));
		p.add(jItalic = new JCheckBox("Italic"));

		//underlines the word
		jCentered.setMnemonic('C');
		jBold.setMnemonic('B');
		jItalic.setMnemonic('I');

		
		setLayout(new BorderLayout());
		add(messagePanel, BorderLayout.CENTER);
		add(p3, BorderLayout.NORTH);
		add(p, BorderLayout.SOUTH);

		
		jFontName.addItemListener(new Listener());
		jFontSize.addItemListener(new Listener());
		jCentered.addItemListener(new Listener());
		jBold.addItemListener(new Listener());
		jItalic.addItemListener(new Listener());
	}

	class Listener implements ItemListener {
		/** Handle check box selection */
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == jFontName) {
				fontName = (String)(jFontName.getSelectedItem());

				// Set font for the message
				messagePanel.setFont(new Font(fontName, fontStyle, fontSize));
			}
			else if (e.getSource() == jFontSize) {
				fontSize = Integer.parseInt((String)(jFontSize.getSelectedItem()));

				// Set font for the message
				messagePanel.setFont(new Font(fontName, fontStyle, fontSize));
			}
			else if ((e.getSource() == jBold) || (e.getSource() == jItalic)) {
				fontStyle = Font.PLAIN;

				// Determine a font style
				if (jBold.isSelected()) {
					fontStyle = fontStyle + Font.BOLD;
				}
				if (jItalic.isSelected()) {
					fontStyle = fontStyle + Font.ITALIC;
				}

				// Set font for the message
				messagePanel.setFont(new Font(fontName, fontStyle, fontSize));
			}
			//Determine the center
			else if (e.getSource() == jCentered) {
				if (jCentered.isSelected()) {
					messagePanel.setCentered(true);
				}
				else {
					messagePanel.setCentered(false);
				}
			}
		}
	}
}