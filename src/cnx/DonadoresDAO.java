package cnx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

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
			e.printStackTrace();
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
			
			carreras.add(" ");
			
			while (rs.next()) 	//Se indica que recorra el vector hasta que exista un registro
			{
				carreras.add(rs.getString("tipo"));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
			
		
		return carreras;
	}
}
