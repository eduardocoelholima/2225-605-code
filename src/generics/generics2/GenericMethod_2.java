package generics.generics2;

class Compare {
    public static <K, V> boolean compare(Fruit<K, V> p1, Fruit<K, V> p2) {
        return p1.getName().equals(p2.getName()) &&
               p1.getPrice().equals(p2.getPrice());
    }
}
class Compare2<K, V> {
    public static void staticMethod()	{ }
    public boolean compare(Fruit<K, V> p1, Fruit<K, V> p2) {
        return p1.getName().equals(p2.getName()) &&
               p1.getPrice().equals(p2.getPrice());
    }
}

class Fruit<K, V> {

    private K fruitName;
    private V price;

    public Fruit(K fruitName, V price) {
        this.fruitName = fruitName;
        this.price = price;
    }

    public void setKey(K fruitName) { this.fruitName = fruitName; }
    public void setValue(V price) { this.price = price; }
    public K getName()   { return fruitName; }
    public V getPrice() { return price; }
}

public class GenericMethod_2 {
	public static void main(String[] args)	{
		Fruit<Double, String> p1 = new Fruit<Double, String>(1.23, "apple");
		Fruit<Double, String> p2 = new Fruit<Double, String>(3.21, "pear");
		boolean same1 = Compare.<Double, String>compare(p1, p2);
		boolean same2 = Compare.compare(p1, p2);
		boolean same3 = new Compare2<Double, String>().compare(p1, p2);
	}
}
