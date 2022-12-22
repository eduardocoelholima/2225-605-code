package exceptions.exceptions2;

public class CatchOrder {

	private void anExeption1()	 {
		int[] anArray  = new int[1];
		try {
			System.out.println("Before execption causing instruction");
			anArray[2] = 1;		// exception will be thrown
			System.out.println("After execption causing instruction");
/*
		} catch (Exception e)	{
CatchOrder.java:10: error: exception ArrayIndexOutOfBoundsException has already been caught
		} catch (ArrayIndexOutOfBoundsException e)	{
		  ^
CatchOrder.java:11: error: exception IndexOutOfBoundsException has already been caught
		} catch (IndexOutOfBoundsException e)	{
		  ^
2 errors
*/
		} catch (ArrayIndexOutOfBoundsException e)	{
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e)	{
		}
	}

	public static void main(String[] args) {
		try {
			new CatchOrder().anExeption1();
		} catch ( Exception e )	{
			e.printStackTrace();
		}
	}
}
