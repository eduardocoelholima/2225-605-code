package inheritance.inheritance2;//package classes.inheritance;

public class  Overview	{
    int 			instanceVariable;
    static    int 	classVariable;
    static  int 	finalVariable = 42; // static?
    volatile  int 	volatileVariable;
    transient int		transientVariable;

    public Overview()	{
//        finalVariable = 42;
    }

    public Overview(int aLocalVariable)	{
//        finalVariable = 43;
    }

    void instanceMethod()	{
        Overview x = new Overview(42);
//        x.finalVariable = 42;
//        finalVariable = 43;
//        instanceVariable = 22;
//        classVariable = 33;
    }

    static void classMethod()	{
        classVariable = 3;
    }

    public static void main(String args[] )	{
        Overview aOverview = new Overview();
        Overview bOverview = new Overview();
        Overview cOverview = new Overview(1);
        cOverview = bOverview;
        aOverview.instanceMethod();
//	instanceMethod();
        bOverview.classMethod();
        // values of aOverview.? bOverview.?
        // aOverview.finalVariable??

    }
}
