package cnx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;

import donadores.Donador;
import donadores.UTD;

public class DonadoresDAO 
{
	private conn con=new conn();
	private String sql;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	public Vector traerCarreras()
	{
		Vector carreras=new Vector();
		
		Connection c=con.conectar();
		
		sql="SELECT * FROM carreras ORDER BY nombre";
		
		try 
		{
			pstm=c.prepareStatement(sql);
			rs=pstm.executeQuery();
			
			carreras.add("Seleccione carrera:");
			
			while (rs.next()) 	//Se indica que recorra el vector hasta que exista un registro
			{
				carreras.add(rs.getString("nombre"));
			}
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
			
		
		return carreras;
	}
	
	public Vector traerTiposSangre()
	{
		Vector carreras=new Vector();
		
		Connection c=con.conectar();
		
		sql="SELECT * FROM tipos_sangre ORDER BY tipo";
		
		try 
		{
			pstm=c.prepareStatement(sql);
			rs=pstm.executeQuery();
			
			carreras.add("Seleccione:");
			
			while (rs.next()) 	//Se indica que recorra el vector hasta que exista un registro
			{
				carreras.add(rs.getString("tipo"));
			}
			
			con.desconectar(c);
			pstm.close();
			rs.close();
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
		return carreras;
	}
	
	public int traerIdSangre(String tipo)
	{
		int id=0;
		Connection c=con.conectar();
		
		try
		{
			sql="SELECT * FROM tipos_sangre WHERE tipo=?";
			pstm=c.prepareStatement(sql);
			pstm.setString(1, tipo);
			
			rs=pstm.executeQuery();
			
			while (rs.next())
			{
				id=rs.getInt("id_tipo_sangre");
			}
			
			con.desconectar(c);
			pstm.close();
			rs.close();
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return id;
	}
	public boolean ingresarDonador(Donador d)
	{
		boolean bandera=false;
		Connection c=con.conectar();
		
		try 
		{
			sql="INSERT INTO donadores VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			pstm=c.prepareStatement(sql);
			pstm.setString(1, d.getCurp());
			pstm.setString(2, d.getNombres());
			pstm.setString(3, d.getAp1());
			pstm.setString(4, d.getAp2());
			pstm.setString(5, d.getCorreo());
			pstm.setString(6, d.getTel());
			pstm.setString(7, d.getCel());
			pstm.setInt(8, d.getTipo_sangre());
			pstm.setBoolean(9, d.isUtd());
			pstm.setString(10, d.getResp_nombre());
			pstm.setString(11, d.getResp_tel());
			pstm.setString(12, d.getResp_direccion());
			
			if (pstm.executeUpdate()==1)
			{
				bandera=true;
			}
			
			con.desconectar(c);
			pstm.close();
			
			
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return bandera;
	}
	
	public boolean ingresarDonadorUTD(Donador d, UTD u)
	{
		boolean bandera=false;
		Connection c=con.conectar();
		
		try 
		{
			bandera=ingresarDonador(d);
			
			if (bandera)
			{
				sql="INSERT INTO datosutd VALUES (@,?,?,?) ";
				pstm=c.prepareStatement(sql);
				
				pstm.setString(1, d.getCurp());
				pstm.setInt(2, u.getCarrera());
				pstm.setString(3, u.getFecha());
				
				if (pstm.executeUpdate()==1)
				{
					bandera=true;
				}
				else
				{
					bandera=false;
				}				
			}		
			
			con.desconectar(c);
			pstm.close();
			
			
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return bandera;
	}
	
	public int buscarCarrera(String carrera)
	{
		int id=0;
		
		Connection c=con.conectar();
		
		try
		{
			sql="SELECT * FROM carreras WHERE nombre=?";
			pstm=c.prepareStatement(sql);
			pstm.setString(1, carrera);
			
			rs=pstm.executeQuery();
			
			while (rs.next())
			{
				id=rs.getInt("id_carrera");
			}
			
			con.desconectar(c);
			pstm.close();
			rs.close();
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
		return id;
	}
}
