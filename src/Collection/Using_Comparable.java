package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student
{
	int rollno,age;
	String name;
	
	public Student(int rollno,String name,int age) 
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		return "rollno=" +rollno + ", age=" + age + ", name="+name;
	}
}

class StudentSortByRollNo implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		if(o1.rollno==o2.rollno)
			{
				return 0;
			}
		else
		if(o1.rollno>o2.rollno)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class StudentSortByName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.name.compareTo(o2.name);
	}
	
}

public class Using_Comparable
{

	public static void main(String[] args)
	{
		
		ArrayList<Student> list = new ArrayList();
		list.add(new Student(3,"John",21));
		list.add(new Student(1,"Sara",27));
		list.add(new Student(2,"Rahel",24));
		
		System.out.println("Sort By Roll No");
		Collections.sort(list,new StudentSortByRollNo());
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
		System.out.println("Sort By Name");
		Collections.sort(list,new StudentSortByName());
		Iterator itr1= list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}
}
