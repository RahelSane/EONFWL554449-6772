package java8;

import java.util.function.Function;

public class Functionl_Chaining_Interface 
{

	public static void main(String[] args)
	{
		int amount=3;
		
		Function<Integer, Integer> sum = i-> i+i; //3+3= 6
		
		Function<Integer, Integer> sqr = i-> i*i; //6*6= 36
		
		System.out.println(sum.apply(amount));
		
		System.out.println(sqr.apply(amount));
		
		System.out.println(sum.andThen(sqr).apply(amount));
								//3(6)	->	//6(36)
		System.out.println(sum.compose(sqr).apply(amount));
								//9(18)	<-  //3(9)
	}

}
