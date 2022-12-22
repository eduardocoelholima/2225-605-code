package exceptions.exceptions2;

public class Finally_2 {

  private void caller()	 {
		try {
			throw new Exception("in thisMethodThrowsAnException");
		} catch (Exception e)	{
			e.printStackTrace();
		} finally	{
			System.out.println("Finally");
		}
  }
  private void exit()	 {
		try {
			throw new Exception("in thisMethodThrowsAnException");
		} catch (Exception e)	{
			e.printStackTrace();
			System.out.println("calling System.exit(0)");
			System.exit(0);
		} finally	{
			System.out.println("Finally");
		}
  }

  public static void main(String[] args) {
	new Finally_2().caller();
	new Finally_2().exit();
  }
}
