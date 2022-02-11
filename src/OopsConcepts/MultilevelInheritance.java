package OopsConcepts;

class Sem11
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
class Sem22 extends Sem11
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

class Sem33 extends Sem22
{
	private int ml,cc,sa;
	public void input3()
	{
		ml=55;
		cc=62;
		sa=77;
	}
	public void output3()
	{
		System.out.println("\n**********Semester-3**********\n");
		System.out.println("Marks in Machine Learning :"+ml);
		System.out.println("Marks in Cloud Computing :"+cc);
		System.out.println("Marks in Software Architecture :"+sa);
	}
	
	
}


public class MultilevelInheritance
{

	public static void main(String[] args)
	{
		Sem33 obj = new Sem33();
		obj.input1();
		obj.input2();
		obj.input3();
		
		obj.output1();
		obj.output2();
		obj.output3();
		
		
		

	}

}
