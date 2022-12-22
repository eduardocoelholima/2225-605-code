package exceptions.exceptions2;

public class xx {

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
//	System.out.println("xx");
//	return 3;
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
	int r = new xx().noSystemExit();
	System.out.println(r);
	new xx().withSystemExit();
  }
}
