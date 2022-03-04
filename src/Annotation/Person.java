package Annotation;

import java.*;

public class Person 
{
	int a,b;
	public void input()
	{
	 System.out.println("Person is parent class ");
	}
}
class Employee extends Person
	{
	 @Override
	 public void input()
	 {
	 System.out.println("Employee is parent class ");
	 }

	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		 obj.input();

	}

}
