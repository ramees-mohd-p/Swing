package sampleswing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
public class LoginForm {
    private JFrame frame;
    private JTextField textField;
    private JPasswordField passwordField;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	LoginForm window = new LoginForm();
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
    public LoginForm() {
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
        
        JLabel lblUserName = new JLabel("User Name");
        lblUserName.setBounds(10, 36, 106, 14);
        //lblUserName.setText("your name");
        frame.getContentPane().add(lblUserName);
        
        textField = new JTextField();
        textField.setBounds(127, 33, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblPassword = new JLabel("password");
        lblPassword.setBounds(10, 81, 46, 14);
        frame.getContentPane().add(lblPassword);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(54, 190, 261, 43);
        frame.getContentPane().add(lblNewLabel);
        
        
        JButton btnSubmit = new JButton("SUBMIT");
        btnSubmit.setBounds(124, 123, 89, 23);
        frame.getContentPane().add(btnSubmit);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(127, 78, 86, 20);
        frame.getContentPane().add(passwordField);
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String a=textField.getText();
                String b=passwordField.getText();
                
                if(a.equals("ramees") && b.equals("123")) {
                    lblNewLabel.setText("successfull");
                }
                else
                {
                    lblNewLabel.setText("not successfull");
                }
            
                
            
            }
        });
        
        
        
        
    }
}




