import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_1 extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JTextField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_1 frame = new Exercicio_1();
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
	public Exercicio_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labellogin = new JLabel("Login: ");
		labellogin.setBounds(37, 63, 66, 32);
		contentPane.add(labellogin);
		
		JLabel labelsenha = new JLabel("Senha:");
		labelsenha.setBounds(37, 142, 46, 14);
		contentPane.add(labelsenha);
		
		login = new JTextField();
		login.setBounds(74, 69, 145, 32);
		contentPane.add(login);
		login.setColumns(10);
		
		senha = new JTextField();
		senha.setBounds(74, 133, 145, 32);
		contentPane.add(senha);
		senha.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (login.getText().equals("admin") && senha.getText().equals("swordfish"))
				    JOptionPane.showMessageDialog(contentPane, "Bem-vindo Admin!");
				else
					JOptionPane.showMessageDialog(contentPane, "Login ou senha errados!");
				
			}
		});
		btnNewButton.setBounds(98, 215, 89, 23);
		contentPane.add(btnNewButton);
	}
}
