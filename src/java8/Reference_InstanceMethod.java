package java8;

interface Engine22
{
	abstract public void speed();
}
class Car22
{
	public void wheel()
	{
		System.out.println("Car has wheels of MRF company");
	}
}

public class Reference_InstanceMethod 
{

	public static void main(String[] args) 
	{
		//Using Lambda Expression
		Engine22 obj1= ()-> System.out.println("Speed is Good");
		obj1.speed();
		
		//Lambda replaced with Instance Method Reference
		Car22 obj2 = new Car22();
		Engine22 obj3 = obj2::wheel;
		obj2.wheel();
	}

}
