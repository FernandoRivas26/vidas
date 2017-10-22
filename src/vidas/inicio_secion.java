package vidas;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
@SuppressWarnings("serial")
public class inicio_secion extends JFrame{
	private JTextField usrField;
	private JPasswordField passwordField;

	public inicio_secion(){
		super("Inicio Secion");
		getContentPane().setBackground(SystemColor.menu);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Webdings", Font.PLAIN, 20));
		lblUsuario.setBounds(29, 20, 86, 16);
		getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Webdings", Font.PLAIN, 20));
		lblContrasea.setBounds(29, 85, 119, 26);
		getContentPane().add(lblContrasea);
		
		usrField = new JTextField();
		usrField.setBounds(23, 42, 200, 40);
		getContentPane().add(usrField);
		usrField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(23, 163, 91, 47);
		getContentPane().add(btnNewButton);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(132, 163, 91, 47);
		getContentPane().add(btnIngresar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(23, 111, 200, 40);
		getContentPane().add(passwordField);
		setIconImage(Toolkit.getDefaultToolkit().getImage(inicio_secion.class.getResource("/imagenes/vidas.png")));
		setResizable(false);
		setTitle("Inicio Secion VIDAS");
		setSize(246, 275);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), lblUsuario, lblContrasea, usrField, btnNewButton, btnIngresar, passwordField}));
		setVisible(true);
	}
	public static void main(String[] args){
		new inicio_secion();
	}
}
