package exceptions.exceptions2;

public class TryCatch {

 public int tryCatchFinally() {
	int i = 0;
	try {
		i = 1;
		System.out.println("a: " + i );
		try {
			i = 2;
			int x = 1/0;
			return i;		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			int x = 1/0;
			++i;
		}
	} catch (Exception e) {
		int x = 1/0;
		e.printStackTrace();
	} finally {
		return ++i;
	}
  }
  public static void main(String[] args) {
	System.out.println("Rvalue " + new TryCatch().tryCatchFinally() );
  }
}
