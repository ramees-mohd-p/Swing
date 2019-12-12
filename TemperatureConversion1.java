

package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TemperatureConversion1 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnToF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConversion1 window = new TemperatureConversion1();
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
	public TemperatureConversion1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Temperature Conversion");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(111, 26, 199, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("To c");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=textField.getText();
				 float number = Float.valueOf(a);
				 float cel=(number-32)*5/9;
				String b=String.valueOf(cel);
				 lblNewLabel.setText("Result = "+b);
			}
		});
		btnNewButton.setBounds(48, 191, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(158, 112, 112, 34);
		frame.getContentPane().add(lblNewLabel);
		
		btnToF = new JButton("To f");
		btnToF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				 float number = Float.valueOf(a);
				 float cel=(number*1.8f)+32;
				String b=String.valueOf(cel);
				 lblNewLabel.setText("Result = "+b);	
			}
		});
		btnToF.setBounds(247, 191, 89, 23);
		frame.getContentPane().add(btnToF);
		
	}

}
