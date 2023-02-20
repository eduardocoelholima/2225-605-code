package generics.generics2;

class A {
    public    void a(){ }
} 
interface I1 {
    public void i1();
}
interface I2 {
    public void i2();
}
class AA extends A implements I1, I2 	{
    public    void i1()   {} 
    public    void i2()  {}
} 

class MultipleB2<T extends AA & I1 & I2> {
    void test(T t) { 	
        t.a();
        t.i1();
	    t.i2();
    } 
    public static void main(String[] args )	{
	new MultipleB2<AA>().test(new AA() );
    }
}
