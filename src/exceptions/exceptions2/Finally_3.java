package exceptions.exceptions2;

public class Finally_3 {

  static int rValue = 0;
  private int caller()	 {
		try {
			throw new ArithmeticException("in thisMethodThrowsAnException");
		} catch (ArithmeticException e)	{	// order is relevant
			rValue = 2;
			System.out.println("caller: before return! rValue =  " + rValue);
			return rValue;
			// rValue = 11;
		} catch (Exception e)	{
			rValue = 1;
			System.out.println("caller: before return! rValue =  " + rValue);
			return rValue;
			// rValue = 11;
		} finally	{
			System.out.println("finaly: before return! rValue =  " + rValue);
			rValue = 111;
			return rValue;
			// rValue = 1111;
		}
  }
  public static void main(String[] args) {
	System.out.println("Calling new Finally_3().caller() " + new Finally_3().caller() );
  }
}
