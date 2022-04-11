package AssignmentOfCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

	class Emp2
	{
		private int id;
		private String name;
		private String address;
		private Double salary;
		
		public Emp2(int id, String name, String address, Double salary)
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
	public class Ques_8
	{		
		public static void main(String[] args)
		{
			Vector<Emp2> list = new Vector<>();
			list.add(new Emp2(101, "Sharon", "444 street, USA", 22000.0));
			list.add(new Emp2(102, "Siyon", "333 street, UAE", 30000.0));
			list.add(new Emp2(103, "Sohan", "222 street, India", 55000.0));
			list.add(new Emp2(104, "John", "111 street, India", 80000.0));
			Iterator<Emp2> it = list.iterator();
			while (it.hasNext())
			{
				System.out.println(it.next());
			}

	}

}
