package dita;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class Login extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblUserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
			try
		     {
				if(textField.getText().equals("Mbugua") && passwordField.getText().equals("4321")){
					Connection mycon = DriverManager.getConnection("JDBC:mysql://localhost:3306/inventory","root","Mbugua21");
					  JOptionPane.showMessageDialog(null, "Welcome");
				       MainController man = new MainController();
				       man.setVisible(true);
				       close();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "UserName or Password incorrect");
				}
			
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			//e.printStackTrace();
		}
			
		}});
		
		btnNewButton_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 14));
		btnNewButton_1.setBounds(194, 159, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(194, 61, 140, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Lucida Handwriting", Font.PLAIN, 15));
		lblUserName.setBounds(42, 58, 119, 28);
		contentPane.add(lblUserName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 101, 140, 23);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Lucida Handwriting", Font.PLAIN, 15));
		lblPassword.setBounds(42, 93, 119, 28);
		contentPane.add(lblPassword);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Lucida Handwriting", Font.PLAIN, 15));
		label.setBounds(42, 20, 177, 28);
		contentPane.add(label);
	}

	private void close() {
		// TODO Auto-generated method stub
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	

}
