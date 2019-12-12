package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
	String a="";
	float sum=0,mul=1,dev=1;
	String sig="";

	private JFrame frame;
	private JTextField textField;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton btnSin;
	private JButton btnx;
	private JButton btnSqrt;
	private JButton btnCos;
	private JButton btnExp;
	private JButton button_20;
	private JButton btnTan;
	private JButton btnLn;
	private JButton btnXy;
	private JButton btnSec;
	private JButton btnN;
	private JButton btnX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 281);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 11, 389, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sig="/";
				a=textField.getText();
				float n=Float.valueOf(a);
				dev=n/dev;
				sum=dev;
				textField.setText("");
				a="";
				String b=String.valueOf(sum);
				textField.setText(b);
				
			}
		});
		btnNewButton.setBounds(407, 67, 48, 34);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("3");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button.getText();
				textField.setText(a);
			}
		});
		button.setBounds(349, 67, 48, 34);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("6");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_1.getText();
				textField.setText(a);
			}
		});
		button_1.setBounds(348, 112, 49, 34);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sig="*";
				a=textField.getText();
				float n=Float.valueOf(a);
			    mul=mul*n;
			    sum=mul;
				textField.setText("");
				a="";
				String b=String.valueOf(sum);
				textField.setText(b);
			}
		});
		button_2.setBounds(407, 112, 48, 34);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sig="+";
				a=textField.getText();
				float n=Float.valueOf(a);
				
				sum=sum+n;
				textField.setText("");
				a="";
				String b=String.valueOf(sum);
				textField.setText(b);
				mul=sum;
			}   
		});
		button_3.setBounds(407, 157, 48, 34);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_4.getText();
				textField.setText(a);
			}
		});
		button_4.setBounds(349, 157, 48, 34);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("-");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sig="-";
				a=textField.getText();
				float n=Float.valueOf(a);
				sum=n;
				textField.setText("");
				a="";
				String b=String.valueOf(sum);
				textField.setText(b);
			}
		});
		button_5.setBounds(407, 202, 48, 34);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("=");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n;
				switch(sig) {
				case "+":
				a=textField.getText();
				n=Float.valueOf(a);
				
				sum=sum+n;
				a=String.valueOf(sum);
				textField.setText(a);
				a="";
				break;
				case "-":
					a=textField.getText();
					n=Float.valueOf(a);
					sum=sum-n;
					a=String.valueOf(sum);
					textField.setText(a);
					a="";
					break;
				case "*":
					a=textField.getText();
					n=Float.valueOf(a);
					a="";
					mul=mul*n;
					sum=mul;
					a=String.valueOf(sum);
					textField.setText(a);
					break;
				case "/":
					a=textField.getText();
				    n=Float.valueOf(a);
					
					sum=sum/n;
					a=String.valueOf(sum);
					textField.setText(a);
					break;
					default:
						textField.setText("Syntax Error");
					
					
			}}
		});
		button_6.setBounds(348, 202, 49, 34);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_7.getText();
				textField.setText(a);
			}
		});
		button_7.setBounds(290, 67, 49, 34);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=a+button_8.getText();
				textField.setText(a);
			}
		});
		button_8.setBounds(290, 112, 48, 34);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("8");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_9.getText();
				textField.setText(a);
			}
		});
		button_9.setBounds(290, 157, 49, 34);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_10.getText();
				textField.setText(a);
			}
		});
		button_10.setBounds(290, 202, 48, 34);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_11.getText();
				textField.setText(a);
			}
		});
		button_11.setBounds(232, 67, 48, 34);
		frame.getContentPane().add(button_11);
		
		button_12 = new JButton("4");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_12.getText();
				textField.setText(a);
			}
		});
		button_12.setBounds(232, 112, 48, 34);
		frame.getContentPane().add(button_12);
		
		button_13 = new JButton("7");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_13.getText();
				textField.setText(a);
			}
		});
		button_13.setBounds(232, 157, 48, 34);
		frame.getContentPane().add(button_13);
		
		button_14 = new JButton("0");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+button_14.getText();
				textField.setText(a);
			}
		});
		button_14.setBounds(232, 202, 48, 34);
		frame.getContentPane().add(button_14);
		
		btnSin = new JButton("Sin");
		btnSin.setBounds(150, 67, 57, 34);
		frame.getContentPane().add(btnSin);
		
		btnx = new JButton("1/x");
		btnx.setBounds(83, 67, 57, 34);
		frame.getContentPane().add(btnx);
		
		btnSqrt = new JButton("Sqrt");
		btnSqrt.setBounds(16, 67, 57, 34);
		frame.getContentPane().add(btnSqrt);
		
		btnCos = new JButton("Cos");
		btnCos.setBounds(150, 112, 57, 34);
		frame.getContentPane().add(btnCos);
		
		btnExp = new JButton("Exp");
		btnExp.setBounds(83, 112, 57, 34);
		frame.getContentPane().add(btnExp);
		
		button_20 = new JButton("%");
		button_20.setBounds(16, 112, 57, 34);
		frame.getContentPane().add(button_20);
		
		btnTan = new JButton("tan");
		btnTan.setBounds(150, 157, 57, 34);
		frame.getContentPane().add(btnTan);
		
		btnLn = new JButton("ln");
		btnLn.setBounds(83, 157, 57, 34);
		frame.getContentPane().add(btnLn);
		
		btnXy = new JButton("X^Y");
		btnXy.setBounds(16, 157, 57, 34);
		frame.getContentPane().add(btnXy);
		
		btnSec = new JButton("Sec");
		btnSec.setBounds(150, 202, 57, 34);
		frame.getContentPane().add(btnSec);
		
		btnN = new JButton("n!");
		btnN.setBounds(83, 202, 57, 34);
		frame.getContentPane().add(btnN);
		
		btnX = new JButton("X^2");
		btnX.setBounds(16, 202, 57, 34);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_1 = new JButton("c");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=0;
				a="";
				mul=1;
				textField.setText("");
				dev=1;
			}
		});
		btnNewButton_1.setBounds(465, 73, 48, 163);
		frame.getContentPane().add(btnNewButton_1);
	}
}
