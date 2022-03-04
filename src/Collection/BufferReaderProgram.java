package Collection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferReaderProgram
{

	public static void main(String[] args) 
	{
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter Any Numeric Value");
			String num = br.readLine();
			
			int n= Integer.parseInt(num);
			float f= Float.parseFloat(num);
			double d= Double.parseDouble(num);
			
			System.out.println("Integer "+n);
			System.out.println("Interger "+f);
			System.out.println("Double "+d);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
