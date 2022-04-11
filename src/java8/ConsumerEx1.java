package java8;

import java.util.function.Consumer;

public class ConsumerEx1 
{

	public static void main(String[] args) 
	{
		Consumer<String> con = s-> System.out.println(s);
		con.accept("Hello Welcome To The World Of JAVA");

	}

}
