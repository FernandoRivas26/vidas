package donadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JYearChooser;

import cnx.*;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class CapturaDonador extends JFrame implements ActionListener
{

	private JPanel contentPane, panelUTD;
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
	private JComboBox cbTipoSangre, cbCarrera, cbMes;
	private JButton btnLimpiar, btnIngresar;
	
	private JYearChooser yearChooser;
	
	private DonadoresDAO donadores_dao=new DonadoresDAO(); 

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
		chckUTD.addActionListener(this);
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
		
		cbTipoSangre = new JComboBox(donadores_dao.traerTiposSangre());
		cbTipoSangre.setBounds(459, 86, 101, 23);
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
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(585, 302, 89, 23);
		btnLimpiar.addActionListener(this);
		contentPane.add(btnLimpiar);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(486, 302, 89, 23);
		btnIngresar.addActionListener(this);
		contentPane.add(btnIngresar);
		
		panelUTD = new JPanel();
		panelUTD.setVisible(false);
		panelUTD.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelUTD.setBackground(Color.LIGHT_GRAY);
		panelUTD.setBounds(10, 302, 400, 148);
		contentPane.add(panelUTD);
		panelUTD.setLayout(null);
		
		// Instanciar Componente
		yearChooser = new JYearChooser();
		yearChooser.setBounds(150, 75, 50, 25);
		yearChooser.setMaximum(3000);
		yearChooser.setMinimum(2000);
		 
		// Ubicar y agregar al panel
		//yearChooser.setBounds...
		 
		panelUTD.add(yearChooser);		
		
		cbCarrera = new JComboBox(donadores_dao.traerCarreras());
		cbCarrera.setBounds(10, 40, 300, 30);
		panelUTD.add(cbCarrera);
		
		JLabel lblDatosEscolares = new JLabel("Datos escolares");
		lblDatosEscolares.setBounds(100, 11, 199, 30);
		lblDatosEscolares.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDatosEscolares.setHorizontalAlignment(SwingConstants.CENTER);
		panelUTD.add(lblDatosEscolares);
		
		String[] A= { "Seleccione un mes", "Enero", "Mayo", "Septiembre" };
		
		cbMes = new JComboBox(A);
		cbMes.setBounds(50, 75, 90, 25);
		panelUTD.add(cbMes);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		boolean bandera=true;
		
		if (e.getSource()==btnLimpiar)
		{
			tfCurp.setText(null);
			tfCel.setText(null);
			tfNombre.setText(null);
			tfAp1.setText(null);
			tfRefNombre.setText(null);
			tfAp2.setText(null);
			tfRefTel.setText(null);
			tfCorreo.setText(null);
			tfRefDireccion.setText(null);
			tfTel.setText(null);
			chckUTD.setSelected(false);
			cbCarrera.setSelectedItem(0);
			cbTipoSangre.setSelectedItem(null);
			panelUTD.setVisible(false);
			
		}
		if (e.getSource()==btnIngresar)
		{
			Donador donador=new Donador();
			if (cbTipoSangre.getSelectedIndex()==0) 
			{
				JOptionPane.showMessageDialog(null, "Por favor, seleccione un tipo de sangre", "Error", JOptionPane.ERROR_MESSAGE);
				bandera=false;
			}
			
			if (bandera)
			{
				if (chckUTD.isSelected())
				{
					if (cbCarrera.getSelectedIndex()==0)
					{
						JOptionPane.showMessageDialog(null, "Por favor, seleccione una carrera", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else 
					{
						donador.setCurp(tfCurp.getText());
						donador.setNombres(tfNombre.getText());
						donador.setAp1(tfAp1.getText());
						donador.setAp2(tfAp2.getText());
						donador.setCorreo(tfCorreo.getText());
						donador.setTel(tfTel.getText());
						donador.setCel(tfCel.getText());
						donador.setTipo_sangre(donadores_dao.traerIdSangre(cbTipoSangre.getSelectedItem().toString()));						
						donador.setResp_nombre(tfRefNombre.getText());
						donador.setResp_tel(tfRefTel.getText());
						donador.setResp_direccion(tfRefDireccion.getText());
						
						donador.setUtd(true);
						UTD utd=new UTD();
						utd.setCarrera(donadores_dao.buscarCarrera(cbCarrera.getSelectedItem().toString()));
						utd.setFecha(cbMes.getSelectedItem().toString()+" "+yearChooser.getYear());
						
						//System.out.println(utd.toString());
						
						if (donadores_dao.ingresarDonadorUTD(donador, utd))
						{
							JOptionPane.showMessageDialog(null, "Donador ingresado", "Realizado",JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "No realizado", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}				
				}
				else
				{
					donador.setCurp(tfCurp.getText());
					donador.setNombres(tfNombre.getText());
					donador.setAp1(tfAp1.getText());
					donador.setAp2(tfAp2.getText());
					donador.setCorreo(tfCorreo.getText());
					donador.setTel(tfTel.getText());
					donador.setCel(tfCel.getText());
					donador.setTipo_sangre(donadores_dao.traerIdSangre(cbTipoSangre.getSelectedItem().toString()));
					donador.setUtd(false);
					donador.setResp_nombre(tfRefNombre.getText());
					donador.setResp_tel(tfRefTel.getText());
					donador.setResp_direccion(tfRefDireccion.getText());
					System.out.println(donador.toString());
					
					if (donadores_dao.ingresarDonador(donador))
					{
						JOptionPane.showMessageDialog(null, "Donador ingresado", "Realizado",JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No realizado", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		}
		if (e.getSource()==chckUTD)
		{
			if (chckUTD.isSelected())
			{
				panelUTD.setVisible(true);
			}
			else
			{
				panelUTD.setVisible(false);
			}
		}
		
	}
}
