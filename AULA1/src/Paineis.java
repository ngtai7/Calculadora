import javax.swing.JOptionPane;

public class Paineis {

	public static void main(String[] args) {
		int idade;
		int resp;
		
		//Output
		JOptionPane.showMessageDialog(null, "Alo Mundo");
		
		//Input
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		JOptionPane.showMessageDialog(null, "Bem vindo "+nome);
		
		//Aqui usamos um metodo para transformar a string recebida pelo JOptionPane em Int
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		JOptionPane.showMessageDialog(null, "Sua idade é: "+idade);
		
		resp = JOptionPane.showConfirmDialog(null, "O seu nome é faria e tem 18 anos?");
		
		if (resp == JOptionPane.OK_OPTION)
			JOptionPane.showMessageDialog(null, "Ok, obrigado!");
		else if (resp == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(null, "Burro do caramba");
		else
			JOptionPane.showMessageDialog(null, "Desculpe");
		
		
		
			
		

	}

}
