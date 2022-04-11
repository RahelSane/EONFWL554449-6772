package jdbc;
import java.sql.*;

public class Simple_jdbc_program
{
	public static void main(String[] args) throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql:///rahelsane_6772","root","12345");
			
			Statement stmt = con.createStatement();
			
			//String query = "create table teacher12 (Teacher_Id int primary key,Teacher_Name varchar(20),Teacher_Education varchar(20),Teacher_Address varchar(30),Teacher_Salary int)";
			
			//String query = "insert into teacher12 values(102,'Sara','MA','Nagar',40000)";
			
			//stmt.executeUpdate(query);
			
			String query="select Teacher_Id, Teacher_Name, Teacher_Salary from teacher12";
			
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"          "+rs.getString(2)+"          "+rs.getString("Teacher_Salary"));
			    //System.out.println(rs.getInt("Teacher_Id")+"      "+rs.getString("Teacher_Name")+"      "+rs.getString("Teacher_Salary"));                    
			}
		
			
		
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			
			//System.out.println("Exception has Occured"+e);
			e.printStackTrace();
		}
		

	}

}
