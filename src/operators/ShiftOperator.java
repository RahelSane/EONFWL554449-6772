package operators;

public class ShiftOperator {

	public static void main(String[] args) {
		int a=11;
		System.out.println("Signed value if Right Shift is "+(a>>3));
		System.out.println("Signed value if Left Shift is "+(a<<3));
		System.out.println("Unsigned value if Right Shift is "+(a>>>3));
	}

}
