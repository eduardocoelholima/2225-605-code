package classes.basics;

//For each of these 8 test cases, explain in English why the output changes/does not.
// Each explanation needs to cover/mention all involved variables.
// You should specify the type of these variables: local, field, static, parameter.
// You should specify which object the variable is referencing.
// You can use a memory model drawing for your explanations


public class WillItChange {

    String aString = "initial";

    public void method1(String aString)	{
        aString = new String("new value");
        System.out.println("2. method1:a:" + aString );
    }

    public void method2(String aString)	{
        this.aString = "new value";
        System.out.println("2. method2:a:" + this.aString );
    }

    public void method3(String aString)	{
        String aNewString = "yet a new one";
        aString = aNewString;
        System.out.println("2. method3:a:" + aString );
    }

    public void method4(String aString)	{
        aString = this.aString;
        System.out.println("2. method4:a:" + aString );
    }

    public void test()	{
        String aString = new String("local");

        System.out.println("\nTest A\n--------------------------------");
        System.out.println("1. test:aString:" + aString );
        method1(aString);
        System.out.println("3. test:aString:" + aString );

        System.out.println("\nTest B\n--------------------------------");
        System.out.println("1. test:this.aString:" + this.aString );
        method1(this.aString);
        System.out.println("3. test:this.aString:" + this.aString );

        System.out.println("\nTest C\n--------------------------------");
        System.out.println("1. test:aString:" + aString );
        method2(aString);
        System.out.println("3. test:aString:" + aString );

        System.out.println("\nTest D\n--------------------------------");
        System.out.println("1. test:this.aString:" + this.aString );
        method2(this.aString);
        System.out.println("3. test:this.aString:" + this.aString );

        System.out.println("\nTest E\n--------------------------------");
        System.out.println("1. test:aString:" + aString );
        method3(aString);
        System.out.println("3. test:aString:" + aString );

        System.out.println("\nTest F\n--------------------------------");
        System.out.println("1. test:this.aString:" + this.aString );
        method3(this.aString);
        System.out.println("3. test:this.aString:" + this.aString );

        System.out.println("\nTest G\n--------------------------------");
        System.out.println("1. test:aString:" + aString );
        method4(aString);
        System.out.println("3. test:aString:" + aString );

        System.out.println("\nTest H\n--------------------------------");
        System.out.println("1. test:this.aString:" + this.aString );
        method4(this.aString);
        System.out.println("3. test:this.aString:" + this.aString );

    }

    public static void main(String args[] )	{
        new WillItChange().test();
    }
}
