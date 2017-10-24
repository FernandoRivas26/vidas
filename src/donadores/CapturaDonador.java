package donadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class CapturaDonador extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JTextField tfCurp;
	private JTextField tfCel;
	private JTextField tfNombre;
	private JTextField tfAp1;
	private JTextField tfRefNombre;
	private JTextField tfAp2;
	private JTextField tfRefTel;
	private JTextField tfCorreo;
	private JTextField tfRefDireccion;
	private JTextField tfTel;
	private JCheckBox chckUTD;
	private JComboBox cbTipoSangre, cbCarrera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CapturaDonador frame = new CapturaDonador();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CapturaDonador() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//Descomentar al acabar las pruebas
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfCurp = new JTextField();
		tfCurp.setBounds(100, 50, 225, 25);
		contentPane.add(tfCurp);
		tfCurp.setColumns(10);
		
		tfCel = new JTextField();
		tfCel.setColumns(10);
		tfCel.setBounds(449, 50, 225, 25);
		contentPane.add(tfCel);
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		tfNombre.setBounds(100, 86, 225, 25);
		contentPane.add(tfNombre);
		
		tfAp1 = new JTextField();
		tfAp1.setColumns(10);
		tfAp1.setBounds(100, 122, 225, 25);
		contentPane.add(tfAp1);
		
		tfRefNombre = new JTextField();
		tfRefNombre.setColumns(10);
		tfRefNombre.setBounds(449, 149, 225, 25);
		contentPane.add(tfRefNombre);
		
		tfAp2 = new JTextField();
		tfAp2.setColumns(10);
		tfAp2.setBounds(100, 158, 225, 25);
		contentPane.add(tfAp2);
		
		tfRefTel = new JTextField();
		tfRefTel.setColumns(10);
		tfRefTel.setBounds(449, 185, 225, 25);
		contentPane.add(tfRefTel);
		
		tfCorreo = new JTextField();
		tfCorreo.setColumns(10);
		tfCorreo.setBounds(100, 194, 225, 25);
		contentPane.add(tfCorreo);
		
		tfRefDireccion = new JTextField();
		tfRefDireccion.setColumns(10);
		tfRefDireccion.setBounds(449, 221, 225, 25);
		contentPane.add(tfRefDireccion);
		
		tfTel = new JTextField();
		tfTel.setColumns(10);
		tfTel.setBounds(100, 230, 225, 25);
		contentPane.add(tfTel);
		
		chckUTD = new JCheckBox("\u00BFPertenece a la instituci\u00F3n?");
		chckUTD.setBounds(100, 262, 200, 23);
		contentPane.add(chckUTD);
		
		JLabel lblNewLabel = new JLabel("CURP");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 55, 85, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(10, 91, 85, 20);
		contentPane.add(lblNombre);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno");
		lblApellidoPaterno.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellidoPaterno.setBounds(10, 127, 85, 20);
		contentPane.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
		lblApellidoMaterno.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellidoMaterno.setBounds(10, 163, 85, 20);
		contentPane.add(lblApellidoMaterno);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreo.setBounds(10, 199, 85, 20);
		contentPane.add(lblCorreo);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelfono.setBounds(10, 235, 85, 20);
		contentPane.add(lblTelfono);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelular.setBounds(354, 55, 85, 20);
		contentPane.add(lblCelular);
		
		JLabel lblTipoDeSangre = new JLabel("Tipo de sangre");
		lblTipoDeSangre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDeSangre.setBounds(354, 91, 85, 20);
		contentPane.add(lblTipoDeSangre);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre_1.setBounds(354, 154, 85, 20);
		contentPane.add(lblNombre_1);
		
		JLabel lblTelfono_1 = new JLabel("Tel\u00E9fono");
		lblTelfono_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelfono_1.setBounds(354, 190, 85, 20);
		contentPane.add(lblTelfono_1);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccin.setBounds(354, 226, 85, 20);
		contentPane.add(lblDireccin);
		
		cbTipoSangre = new JComboBox();
		cbTipoSangre.setBounds(449, 87, 70, 23);
		contentPane.add(cbTipoSangre);
		
		JLabel lblNewLabel_1 = new JLabel("Referencia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(393, 122, 200, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDatosDelDonador = new JLabel("Datos del donador");
		lblDatosDelDonador.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDelDonador.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDatosDelDonador.setBounds(242, 11, 200, 25);
		contentPane.add(lblDatosDelDonador);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(585, 302, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(486, 302, 89, 23);
		contentPane.add(btnIngresar);
		
		JPanel panelUTD = new JPanel();
		panelUTD.setVisible(false);
		panelUTD.setLayout(null);
		panelUTD.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelUTD.setBackground(Color.LIGHT_GRAY);
		panelUTD.setBounds(10, 302, 400, 148);
		contentPane.add(panelUTD);
		
		
		cbCarrera = new JComboBox();
		cbCarrera.setBounds(74, 59, 252, 30);
		panelUTD.add(cbCarrera);
		
		JLabel lblDatosEscolares = new JLabel("Datos escolares");
		lblDatosEscolares.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDatosEscolares.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosEscolares.setBounds(100, 11, 199, 30);
		panelUTD.add(lblDatosEscolares);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}
