package exceptions.exceptions2;

public class F {

  private int noSystemExit()	 {
		try {
			throw new Exception("1");
		} catch (Exception e)	{
			System.out.println("2");
			return 0;
		} finally	{
			System.out.println("3 finally");
			return 1;
		}
  }
  private int noExeption()	 {
		try {
			int x = 1 - 1;
			System.out.println("inside try: 1");
		} catch (Exception e)	{
			System.out.println("inside catch: 2");
		} finally	{
			System.out.println("inside finally: 3 ");
			return 2;
		}
  }
  private int anExeption1()	 {
		int[] anArray  = new int[1];
		try {
			anArray[2] = 1 / 0;
			System.out.println("inside try: 1");
			return 0;
		} catch (ArithmeticException e)	{
			anArray[2] = 0;
			System.out.println("inside catch: 2");
			return 1;
		} finally	{
			System.out.println("inside finally: 3 ");
			return 2;
		}
		// return 3;
  }
  private int anExeption2()	 {
		int[] anArray  = new int[1];
		try {
			anArray[2] = 0;
			anArray[2] = 1 / 0;
			System.out.println("inside try: 1");
			return 0;
		} catch (ArithmeticException e)	{
			System.out.println("inside catch: 2");
			return 1;
		} finally	{
			System.out.println("inside finally: 3 ");
			return 2;
		}
		// return 3;
  }
  private void withSystemExit()	 {
		try {
			throw new Exception("4");
		} catch (Exception e)	{
			System.out.println("5");
			System.exit(0);
		} finally	{
			System.out.println("6 finally");
		}
		System.out.println("exit(): you will not see this line");	// not exectuted
  }

  public static void main(String[] args) {
	// int r = new F().noSystemExit();
	// System.out.println(new F().noSystemExit());
	new F().noExeption();
	// new F().anExeption1();
	// new F().anExeption2();
	// new F().withSystemExit();
  }
}
