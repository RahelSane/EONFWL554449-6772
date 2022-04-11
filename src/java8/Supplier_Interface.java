package java8;

import java.util.function.Supplier;

public class Supplier_Interface 
{

	public static void main(String[] args) 
	{
		Supplier<Double> sup = () -> Math.random();
		
		System.out.println(sup.get());

	}

}
