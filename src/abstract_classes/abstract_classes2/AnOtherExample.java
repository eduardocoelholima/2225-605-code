package classes.inheritance;

public class  AnOtherExample	{
  int instanceV = 1;
  static AnOtherExample staticAnOtherExample;
  AnOtherExample instanceAnOtherExample;

  public AnOtherExample()	{
	this.instanceAnOtherExample = this;
  }
  public void create() {
	AnOtherExample aAnOtherExample;
	for ( int index = 0; index < 10; index ++ )	{
		aAnOtherExample = new AnOtherExample();
	}
  }
  public String toString() {
	return "this/instanceAnOtherExample " + this + "/" + instanceAnOtherExample;
//	 return "" + instanceV;
  }

  public static void main(String args[] )	{
	staticAnOtherExample = new AnOtherExample();
	System.out.println(staticAnOtherExample);
	staticAnOtherExample.create();
  }
}
