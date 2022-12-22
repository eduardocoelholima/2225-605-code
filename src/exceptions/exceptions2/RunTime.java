package exceptions.exceptions2;

public class RunTime {

  private void divide(int a, int b)	{
	int result = a / b;
  }
  private void callDivider(int a, int b)	{
	divide(a, b);
  }

  public static void main(String[] args) {
	int a = (int) Math.random();
	int b = 1;
	new RunTime().callDivider(a, b);
	new RunTime().callDivider(b, a);
  }
}
