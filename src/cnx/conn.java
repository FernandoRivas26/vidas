package cnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conn 
{
	private PreparedStatement pstm=null;
	private ResultSet rs=null;
	
	public Connection conectar()
	{
		String usr="root", 							//Nombre de usuario
				pwd="",								//Contrase�a
				sql="",								//Varible donde se guardar�n las sentencias SQL
				driver="com.mysql.jdbc.Driver";		//Driver
		
		Connection c=null;
		
		try 
		{
			Class.forName(driver);
			c=DriverManager.getConnection("jdbc:mysql://localhost/fotografo",usr,pwd); 	//Configurar la conexi�n (host, usuario, contrase�a)
			
			//pstm=c.prepareStatement(sql);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		return c;
	}
	
	public void desconectar(Connection c)
	{
		try 
		{
			c.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
