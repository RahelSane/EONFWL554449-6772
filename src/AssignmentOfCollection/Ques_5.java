package AssignmentOfCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Emp 
{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Emp(int id, String name, String address, Double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId()
	{
		return id;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Ques_5
{

	public static void main(String[] args) 
	{
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp(101, "Sharon", "444 street, USA", 22000.0));
		list.add(new Emp(102, "Siyon", "333 street, UAE", 30000.0));
		list.add(new Emp(103, "Sohan", "222 street, India", 55000.0));
		list.add(new Emp(104, "John", "111 street, India", 80000.0));
		
		Iterator<Emp> it = list.iterator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID :");
		int searchId=sc.nextInt();
		
		//int searchId = 101;
		while (it.hasNext())
		{
			Emp emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}


