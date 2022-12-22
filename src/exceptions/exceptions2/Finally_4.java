package exceptions.exceptions2;

public class Finally_4 {

	public int tryCatchFinally() {
		int i = 0;
		try {
			i = 1;
			System.out.println("a: " + i );
			try {
				i = 2;
				System.out.println("b: " + i );
				System.out.println("return 0: " + i );
				return i;		// this will be the return value
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				++i;
				System.out.println("c: " + i );
				 return i;		// what is the problem here?
			}
//			System.out.println("d: " + i );
//			System.out.println("return 1: " + i );
//			return i;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("e: " + i );
		}
		System.out.println("return 2: " + i );
		return i;
	}
	public static void main(String[] args) {
		System.out.println("Rvalue " + new Finally_4().tryCatchFinally() );
	}
}
