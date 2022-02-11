package OopsConcepts;

class Student
{
	int roll_no;
	String name;
	String stream;
	//long mob_no;
	static String division ="A";
	//static String clg_name ="Modern_College";
	
	Student(int r,String n,String strm)
	{
		roll_no=r;
		name=n;
		stream=strm;
		//mob_no=mn
	}
	
 void print()
	{
		System.out.println("roll_no+ "+name+" "+division+" "+clg_no");
	
	}
	
}


public class StaticVariable1
{

	public static void main(String[] args) 
	{
		Student obj1=new Student(1, "Rahel" , "Science");
		Student obj2=new Student(2, "Sara" , "Arts");
		Student obj3=new Student(3, "John" , "Arts");
		Student obj4=new Student(4, "Siyon" , "Science");
		Student obj5=new Student(5, "Sharon" , "Commerce");
		
		obj1.print();
		obj2.print();
		obj3.print();
		obj4.print();
		obj5.print();
	}

}
