package sampleswing;

import java.awt.EventQueue;
import java.awt.event.*;


import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class CheckboxValue {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkbox window = new checkbox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public checkbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("c++");
		chckbxNewCheckBox.setBounds(234, 66, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(234, 122, 97, 23);
		frame.getContentPane().add(chckbxJava);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(150, 181, 158, 40);
		frame.getContentPane().add(lblNewLabel);
		
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			{
				lblNewLabel.setText("c++"+(e.getStateChange()==1?"checked":"unchecked"));
			}

			}
		});
	}
}
