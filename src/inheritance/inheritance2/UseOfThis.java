package inheritance.inheritance2;

/**
 * Use of this!
 */

class UseOfThis
{
   int id;
   UseOfThis(int id) {
	this.id = id;
   }
   private void method_2()
   {
	System.out.println("method_2: " + this);
   }

   private void method_1()
   {
	System.out.println("method_1: " + this);
	this.method_2();
	method_2();
   }
   public String toString()	{
	return "" + id;
   }

   public static void main(String args[])
   {
      UseOfThis aUseOfThis = new UseOfThis(1);
      UseOfThis bUseOfThis = new UseOfThis(2);

      System.out.println(aUseOfThis);
      System.out.println(bUseOfThis);

      aUseOfThis.method_1();
      bUseOfThis.method_1();
   }
}

