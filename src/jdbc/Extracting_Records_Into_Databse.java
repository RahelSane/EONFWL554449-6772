package jdbc;
import java.sql.*;

public class Extracting_Records_Into_Databse
{

	public static void main(String[] args) throws SQLException 
	{
		

			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql:///rahelsane_6772","root","12345");
				
				Statement stmt = con.createStatement();
				
				//String query = "create table teacher (Teacher_Id int,Teacher_Name varchar(20),Teacher_Education varchar(20),Teacher_Address varchar(30),Teacher_Salary int)";
				
				//String query = "insert into teacher values(101,'Dwarka','MA','Shivajinagar',45000),(102,'Ragini','MSC','Kothrud',55000),(103,'Dipali','BBA','Sangvi',40000),(104,'Ashwini','MCS','Pashan',50000),(105,'Asha','MBA','Dhanori',75000)";
				
				String query="select Teacher_Id, Teacher_Name, Teacher_Salary from teacher";
				
				ResultSet rs = stmt.executeQuery(query);
				while(rs.next())
				{
					//System.out.println(rs.getInt(1)+"          "+rs.getString(2)+"          "+rs.getString(5));
				    System.out.println(rs.getInt("Teacher_Id")+"      "+rs.getString("Teacher_Name")+"      "+rs.getString("Teacher_Salary"));                    
				}
			
				rs.close();
				stmt.close();
				con.close();
				
			
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				
				//System.out.println("Exception has Occured"+e);
				e.printStackTrace();
			}
			


	}

}
