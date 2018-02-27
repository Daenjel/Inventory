package dita;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class MainController extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainController frame = new MainController();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainController() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewStock = new JButton("New Stock");
		btnNewStock.setBounds(74, 88, 89, 23);
		contentPane.add(btnNewStock);
		
		JButton btnCheckStock = new JButton("Check Stock");
		btnCheckStock.setBounds(74, 138, 103, 23);
		contentPane.add(btnCheckStock);
		
		JButton btnRemoveStock = new JButton("Remove Stock");
		btnRemoveStock.setBounds(248, 88, 103, 23);
		contentPane.add(btnRemoveStock);
		
		JButton btnBorrow = new JButton("Borrow");
		btnBorrow.setBounds(248, 138, 89, 23);
		contentPane.add(btnBorrow);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(166, 206, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblDitaInventory = new JLabel("Dita Inventory");
		lblDitaInventory.setFont(new Font("Lucida Handwriting", Font.PLAIN, 18));
		lblDitaInventory.setBounds(116, 24, 207, 23);
		contentPane.add(lblDitaInventory);
	}
}
