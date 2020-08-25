import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio_2 extends JFrame {

	private JPanel contentPane;
	private JTextField inicio;
	private JTextField fim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio_2 frame = new Exercicio_2();
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
	public Exercicio_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textA = new JLabel("A:");
		textA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textA.setBounds(36, 64, 46, 14);
		contentPane.add(textA);
		
		JLabel textB = new JLabel("B:");
		textB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textB.setBounds(36, 120, 46, 14);
		contentPane.add(textB);
		
		JButton Botao = new JButton("Mostar Numeros");
		Botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(inicio.getText());
				int b = Integer.parseInt(fim.getText());
				int c;
				String d = " ";
				
				if (a<b)
				{do
				{String d1 = " "+a;
				 d = d + d1;
				 
				 
				 if (a==b)
					 JOptionPane.showMessageDialog(contentPane, d);
				
				 a++;
				}
				while (a<=b);}
				
				else if (a>b)
				{do
				{String d1 = " "+a;
				 d = d + d1;
				 
				 
				 if (a==b)
					 JOptionPane.showMessageDialog(contentPane, d);
				
				 a--;
				}
				while (a>=b);}
				
				
				
			
				 
			
				
			}
		});
		Botao.setBounds(36, 185, 188, 23);
		contentPane.add(Botao);
		
		inicio = new JTextField();
		inicio.setBounds(63, 63, 142, 20);
		contentPane.add(inicio);
		inicio.setColumns(10);
		
		fim = new JTextField();
		fim.setBounds(63, 119, 142, 20);
		contentPane.add(fim);
		fim.setColumns(10);
	}

}

