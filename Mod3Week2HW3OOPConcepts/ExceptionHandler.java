package Mod3Week2HW3OOPConcepts;

public class ExceptionHandler {

	public static void main(String[] args) {
		int num=45;
		
		int result = 0;
		
		String s = "sss";
		
		try {
		System.out.println("My number is "+Integer.parseInt(s));
		}
		
		catch(NumberFormatException nfex)
		{
			System.out.println(s+ " cannot be converted into a number "+nfex.getMessage());
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
		try {
		result = num/0;
		}
		
		catch(ArithmeticException aex)
		{
			System.out.println("Number cannot be divide by 0 "+aex.getMessage());
		}
		System.out.println("the result is :"+ result);

	}

}
