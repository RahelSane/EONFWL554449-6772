package OopsConcepts;

class Sem1
{
	private int c,cpp,dbms;
	public void input1()
	{
		c=65;
		cpp=75;
		dbms=85;
	}
	public void output1()
	{
		System.out.println("**********Semester-1**********\n");
		System.out.println("Marks in C  	:"+c);
		System.out.println("Marks in CPP    :"+cpp);
		System.out.println("Marks in DBMS   :"+dbms);
	}
	
}
class Sem2 extends Sem1
{
	private int java,php,rdbms;
	public void input2()
	{
		java=68;
		php=88;
		rdbms=75;
	}
	public void output2()
	{
		System.out.println("\n**********Semester-2**********\n");
		System.out.println("Marks in JAVA   :"+java);
		System.out.println("Marks in PHP  	:"+php);
		System.out.println("Marks in RDBMS  :"+rdbms);
	}

}

public class SingleInheritance {

	public static void main(String[] args) 
	{
		Sem2 obj = new Sem2();
		obj.input1();
		obj.input2();
		
		obj.output1();
		obj.output2();

	}

}
