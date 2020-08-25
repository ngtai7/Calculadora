import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {
	
	//FUNCOES
	public static float soma(float x, float y)
	{return x + y;}
	
	public static float subtracao(float x, float y)
	{return x - y;}
	
	public static float multiplicacao(float x, float y)
	{return x * y;}
	
	public static float divisao(float x, float y)
	{return x / y;}
	

	
	

	private JPanel contentPane;
	private JTextField textField;
	
	//VARIAVEIS
	String tela = "", slot = "";
	float a, b, c;
	boolean op, sum, sub, mult, div = false;
	int cont=0;
	
	//Funcionamento:
	// tela: tudo que aparece na tela atraves dos botoes vira string pra tela.
	//slot: transforma as strings da variavel tela em float.
	//a, b, c: os valores de slot sao armazenados primeiro em a, depois em b, e a conta e salva em c.
	//op: diz se estou ou nao fazendo uma operacao. E o que vai definir se o que tiver na variavel Slot sera¡ salvo em a, b ou c.
	//cont == 0 a operacao foi encerrada ou nao iniciou, cont == 1 esta¡ em andamento.
	// sum, sub, mult, div: a que estiver true sera¡ executada.

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(0, 0, 269, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
        //Botoes numericos
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+tela)+(""+0);
				textField.setText(tela);
				slot = (""+slot)+(""+0);
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
				
				
			}
		});
		zero.setFont(new Font("Tahoma", Font.BOLD, 18));
		zero.setBounds(0, 239, 70, 57);
		contentPane.add(zero);
		
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
		um.setFont(new Font("Tahoma", Font.BOLD, 18));
		um.setBounds(0, 183, 70, 57);
		contentPane.add(um);
		
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
		dois.setFont(new Font("Tahoma", Font.BOLD, 18));
		dois.setBounds(67, 183, 70, 57);
		contentPane.add(dois);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+3);
				textField.setText(tela);
				slot = (""+slot) + (""+3);
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		tres.setFont(new Font("Tahoma", Font.BOLD, 18));
		tres.setBounds(134, 183, 70, 57);
		contentPane.add(tres);
		
		JButton quatro = new JButton("4");
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+4);
				textField.setText(tela);
				slot = (""+slot) + (""+4);
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		quatro.setFont(new Font("Tahoma", Font.BOLD, 18));
		quatro.setBounds(0, 127, 70, 57);
		contentPane.add(quatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+5);
				textField.setText(tela);
				slot = (""+slot) + (""+5);
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		cinco.setFont(new Font("Tahoma", Font.BOLD, 18));
		cinco.setBounds(67, 127, 70, 57);
		contentPane.add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+6);
				textField.setText(tela);
				slot = (""+slot) + (""+6);
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		seis.setFont(new Font("Tahoma", Font.BOLD, 18));
		seis.setBounds(134, 127, 70, 57);
		contentPane.add(seis);
		
		JButton sete = new JButton("7");
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+7);
				textField.setText(tela);
				slot = (""+slot) + (""+7);
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		sete.setFont(new Font("Tahoma", Font.BOLD, 18));
		sete.setBounds(0, 71, 70, 57);
		contentPane.add(sete);
		
		JButton oito = new JButton("8");
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+8);
				textField.setText(tela);
				slot = (""+slot) + (""+8);
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		oito.setFont(new Font("Tahoma", Font.BOLD, 18));
		oito.setBounds(67, 71, 70, 57);
		contentPane.add(oito);
		
		JButton nove = new JButton("9");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+9);
				textField.setText(tela);
				slot = (""+slot) + (""+9);
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		nove.setFont(new Font("Tahoma", Font.BOLD, 18));
		nove.setBounds(134, 71, 70, 57);
		contentPane.add(nove);
		
		//Botoes nao numericos
		
		//PONTO
		JButton ponto = new JButton(".");
		ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = (""+ tela) + (""+".");
				textField.setText(tela);
				slot = (""+slot) + (""+".");
				
				
				if (op == false)
					a = Float.parseFloat(slot);
				else
					b = Float.parseFloat(slot);
			}
		});
		ponto.setFont(new Font("Tahoma", Font.BOLD, 18));
		ponto.setBounds(67, 239, 70, 57);
		contentPane.add(ponto);
		
		//DIVISAO
		JButton divisao = new JButton("/");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            cont++;
				if (cont == 1)
				{slot = "";
				
				tela = (""+tela)+(""+"/");
				textField.setText(tela);
				
				op = true;
				div = true;}
	            
	            else
                	textField.setText("Erro!");
				
			}
		});
		divisao.setFont(new Font("Tahoma", Font.BOLD, 18));
		divisao.setBounds(134, 239, 70, 57);
		contentPane.add(divisao);
		
		//IGUALDADE
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (sum == true)
				{c = soma(a, b);
				a = c;
				b = 0;
				slot = "";
				tela = ""+c;
				sum = false;}
				
				else if (sub == true)
				{c = subtracao(a, b);
				a = c;
				b = 0;
				slot = "";
				tela = ""+c;
				sub = false;}
				
				else if (div == true && b != 0)
				{c = divisao(a, b);
				a = c;
				b = 0;
				slot = "";
				tela = ""+c;
				div = false;}
				
				else if (div == true && b == 0)
				{
				slot = "";
				tela = "ERRO!!!";
			    div = false;}
				
				else if (mult == true)
				{c = multiplicacao(a, b);
				a = c;
				b = 0;
				slot = "";
				tela = ""+c;
				mult = false;}
				
				textField.setText(tela);
				cont = 0;
				    
			}
		});
		igual.setFont(new Font("Tahoma", Font.BOLD, 18));
		igual.setBounds(201, 239, 70, 57);
		contentPane.add(igual);
		
		//MULTIPLICACAO
		JButton multiplicacao = new JButton("*");
		multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            cont++;
				if (cont == 1)
	                {slot = "";
				
				    tela = (""+tela)+(""+"*");
				    textField.setText(tela);
				
				    op = true;
				    mult = true;}
	            
	            else
                	textField.setText("Erro!");
	            
				
			}
		});
		multiplicacao.setFont(new Font("Tahoma", Font.BOLD, 18));
		multiplicacao.setBounds(201, 183, 70, 57);
		contentPane.add(multiplicacao);
		
		//SOMA
		JButton soma = new JButton("+");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                cont++;
				if (cont == 1)
	                {slot = "";
				
				    tela = (""+tela)+(""+"+");
				    textField.setText(tela);
				
				    op = true;
				    sum = true;}
               
                else
                	textField.setText("Erro!");
				
			}
		});
		soma.setFont(new Font("Tahoma", Font.BOLD, 18));
		soma.setBounds(201, 71, 70, 57);
		contentPane.add(soma);
		
		//SUBTRACAO
		JButton subtracao = new JButton("-");
		subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                cont++;
	            if (cont == 1)
				    {slot = "";
				
				    tela = (""+tela)+(""+"-");
				    textField.setText(tela);
				
				    op = true;
				    sub = true;}
				
				else
				    textField.setText("Erro!");
				
			}
		});
		subtracao.setFont(new Font("Tahoma", Font.BOLD, 18));
		subtracao.setBounds(201, 127, 70, 57);
		contentPane.add(subtracao);
	}
}
