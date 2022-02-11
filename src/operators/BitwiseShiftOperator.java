package operators;

public class BitwiseShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=34;
		int b=-20;
		System.out.println("Signed Right Shift 34 devide by 2 = " +(a>>1));
		System.out.println("Signed Right Shift -20 devide by 2 = " +(b>>1));
		System.out.println("Signed Left Shift 34 multiply by 2 = " +(a<<1));
		System.out.println("Signed Left Shift -20 multiply by 2 = " +(b<<1));
		System.out.println("Unsigned Right Shift of 34  = " +(a>>>1));
		System.out.println("Unsigned Right Shift of -20 = " +(b>>>1));
	}

}
