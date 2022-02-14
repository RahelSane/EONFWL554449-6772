package OopsConcepts;

class Student
{
	int roll_no;
	String name;
	String stream;
	String mob_no;
	static String division ="A";
	static String clg_name ="Modern_College";
	
	Student(int r,String n,String strm,String mn)
	{
		roll_no=r;
		name=n;
		stream=strm;
		mob_no=mn;
	}
	
 void print()
	{
		System.out.println(roll_no +  name + stream  + mob_no + division  + clg_name);
	
	
	}
	
}


public class StaticVariable1
{

	public static void main(String[] args) 
	{
		Student obj1=new Student(1, " Rahel " ,   " Science ", " 7756074903 ");
		Student obj2=new Student(2, " Sara " ,    " Arts ",    " 9326274903 ");
		Student obj3=new Student(3, " John " ,    " Arts ",    " 9890018883 ");
		Student obj4=new Student(4, " Siyon " ,   " Science ", " 9923886612 ");
		Student obj5=new Student(5, " Sharon " ,  " Commerce "," 8149574417 ");
		
		obj1.print();
		obj2.print();
		obj3.print();
		obj4.print();
		obj5.print();
	}

}
