package menuPrincipal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame implements ActionListener {

	
	private JPanel contenedor, pnl_menu, pnl_graf;
	
	
	public Principal() {
		setTitle("VIDAS");
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		
		contenedor = new JPanel();
		contenedor.setBackground(Color.white);
		setContentPane(contenedor);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Principal pr = new Principal();
				pr.setVisible(true);
			}
		});

	}
	
}
