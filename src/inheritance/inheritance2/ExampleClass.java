package inheritance.inheritance2;//package classes.inheritance;

public class  ExampleClass	{
	static int aLocalVariable = 3;

	public ExampleClass()	{
		aLocalVariable = 2;

	}

	public ExampleClass(int aLocalVariable)	{
		this.aLocalVariable = 6;
		aLocalVariable = 12;
	}

	public String toString()	{
		return "" + aLocalVariable;
	}

	public static void main(String args[] )	{
		ExampleClass aExampleClass = new ExampleClass();
		ExampleClass aExampleClass2 = new ExampleClass(1);
		ExampleClass aExampleClass3 = new ExampleClass(2);
		int intArgument = 3;
		aExampleClass = new ExampleClass(intArgument);
		System.out.println(intArgument);
		System.out.println("the value is: " + aExampleClass.aLocalVariable);
		System.out.println(aExampleClass);
		// System.out.println(aLocalVariable);
	}
}
