import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setBounds(300, 100, 500, 400);
		frame.setLayout(null);
		
		JButton btn1 = new JButton();
		btn1.setText("Clicar");
		btn1.setBounds(30, 30, 130, 150);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Cliquei no 1 Botão");
				
			}
			
			
		}
				
				);
		
		JButton btn2 = new JButton();
		btn2.setText("Segundo Botão");
		btn2.setBounds(200, 30, 130, 150);
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.setVisible(true);
		
		
		
	}
}