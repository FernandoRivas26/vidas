package menuPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Menu extends JFrame implements MouseListener {

	private JPanel contenedor, pnl_head, pnl_menu, pnl_graf;
	private JButton btn_insertar, btn_imprimir, btn_consultar;
	
	private final Font arial14 = new Font("arial", Font.PLAIN, 14);
	private final Font arial14b = new Font("arial", Font.BOLD, 14);
	private final Font arial16 = new Font("arial", Font.PLAIN, 16);
	private final Font arial16b = new  Font("arial", Font.BOLD, 16);
	
	public Menu() {
		setTitle("VIDAS");
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//setLayout(new FlowLayout());
		setResizable(false);
		
		contenedor = new JPanel();
		contenedor.setBackground(Color.black);
		contenedor.setLayout(null);
		setContentPane(contenedor);
		
		pnl_head = new JPanel();
		pnl_head.setLayout(new FlowLayout());
		pnl_head.setBounds(0, 0, 700, 50);
		pnl_head.setBackground(Color.red);
		
		pnl_menu = new JPanel();
		pnl_menu.setLayout(null);
		pnl_menu.setBounds(0, 50, 200, 500);
		pnl_menu.setBackground(Color.white);
		
		pnl_graf = new JPanel();
		pnl_graf.setLayout(new BorderLayout());
		pnl_graf.setBackground(Color.white);
		pnl_graf.setBounds(200, 50, 500, 450);
		
		contenedor.add(pnl_graf);
		contenedor.add(pnl_head);
		contenedor.add(pnl_menu);
		
		btn_insertar = new JButton("Insertar");
		btn_insertar.setBounds(0, 0, 200, 50);
		btn_insertar.setBackground(null);
		btn_insertar.setBorder(null);
		btn_insertar.setFont(arial16b);
		btn_insertar.addMouseListener(this);
		pnl_menu.add(btn_insertar);
		
		btn_consultar = new JButton("Consultar");
		btn_consultar.setBounds(0, 50, 200, 50);
		btn_consultar.setBackground(null);
		btn_consultar.setBorder(null);
		btn_consultar.setFont(arial16b);
		btn_consultar.addMouseListener(this);
		pnl_menu.add(btn_consultar);
		
		
		// create a dataset...
		DefaultPieDataset data = new DefaultPieDataset();
		data.setValue("Category 1", 43.2);
		data.setValue("Category 2", 27.9);
		data.setValue("Category 3", 79.5);
		// create a chart...
		JFreeChart chart = ChartFactory.createPieChart(
		"Sample Pie Chart",
		data,
		true, // legend?
		true, // tooltips?
		false // URLs?
		);
		
		ChartPanel pannn = new ChartPanel(chart);
		pnl_graf.add(pannn, BorderLayout.CENTER);
		//frame.setVisible(true);

	}	
	

	//--------------------------------------------
	// CUANDO SE HACE CLIC A UN ELEMENTO
	//--------------------------------------------
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//--------------------------------------------
	// CUANDO SE ESTA PRESIONANDO UN ELEMENTO
	//--------------------------------------------
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//--------------------------------------------
	// CUANDO SE DEJA DE PRESIONAR UN ELEMENTO
	//--------------------------------------------
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//--------------------------------------------
	// CUANDO SE PASA EL CURSOR SOBRE UN ELEMENTO
	//--------------------------------------------
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn_insertar) {
			btn_insertar.setBackground(Color.RED);
			btn_insertar.setForeground(Color.white);
		}
		if(e.getSource()==btn_consultar) {
			btn_consultar.setBackground(Color.red);
			btn_consultar.setForeground(Color.white);
		}
	}

	//--------------------------------------------
	// CUANDO SE QUITA EL CURSOR DE UN ELEMENTO
	//--------------------------------------------
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn_insertar) {
			btn_insertar.setBackground(Color.white);
			btn_insertar.setForeground(Color.black);
		}
		if(e.getSource()==btn_consultar) {
			btn_consultar.setForeground(Color.black);
			btn_consultar.setBackground(Color.white);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Menu mmm = new Menu();
				mmm.setVisible(true);
			}
			
		});
	}

}
