package inheritance.inheritance2;

class BB extends B {

    int aBBint;
    public int x;
    int common = 2;


    public BB()	{
        System.out.println("public BB()" );
    }
    public BB(int aBBint)	{
        this.aBBint = aBBint;
        System.out.println("public BB(int x)" );
    }
    public String toString()	{
        return "" + getClass();
    }
    public static void main(String args[])	{
        System.out.println("1: " + new BB());
        System.out.println("2: " + new BB(42));

        //upcasting
//        BB var = new BB();
//        var.set(3);
//        System.out.println(((B)var).common+" "+var.common);

        //concatenation precedence
//        BB var2 = new BB();
//        Object var3 = (Object) var2;
//        System.out.println((var2 == var3) + " " + var2.equals(var3));
//        System.out.println("string " + var2 == var3);
    }
}
