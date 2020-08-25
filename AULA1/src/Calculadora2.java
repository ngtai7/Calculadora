import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora2 extends JFrame {
	
	//VARIAVEIS
	boolean op = false; 
	boolean sum = false;
	float a, b, c;
	String tela="", slot="";
	
	//FUNCOES
	public static float soma(float a, float b)
	{return(a+b);}

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora2 frame = new Calculadora2();
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
	public Calculadora2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JButton um = new JButton("1");
		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+tela)+(""+1);
				textField.setText(tela);
				slot = (""+slot)+(""+1);
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		contentPane.add(um, BorderLayout.WEST);
		
		JButton dois = new JButton("2");
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+tela)+(""+2);
				textField.setText(tela);
                slot = (""+slot)+(""+2);
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		contentPane.add(dois, BorderLayout.EAST);
		
		JButton soma = new JButton("+");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				slot = "";
				
				tela = (""+tela)+(""+"+");
				textField.setText(tela);
				
				op = true;
				sum = true;
				
			}
		});
		contentPane.add(soma, BorderLayout.CENTER);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (sum == true);
				c = soma(a, b);
				a = c;
				b = 0;
				slot = "";
				tela = ""+c;
				sum = false;
				
				textField.setText(tela);
				
			}
		});
		contentPane.add(igual, BorderLayout.SOUTH);
	}

}
