import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample{

	public static void main(String args[]){
	
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:///test1","root","root");
			 if(!conn.isClosed())
				System.out.println("Succesfully connected");
		}catch(Exception e){
					System.err.println("Exception "+e.getMessage());
		}finally{
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException e){}
		}
		
	
	}

}