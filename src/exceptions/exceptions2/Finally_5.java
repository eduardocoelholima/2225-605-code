package exceptions.exceptions2;


public class Finally_5 {

	public void tryCatchFinally() {
		int[] intArray = {1};
		try {
			try {
				try {
					System.out.println("" + intArray[1]);
					System.out.println("Exception 0 ");
				} catch(Exception e) {
					System.out.println("Exception 1 ");
				}
			} catch(Exception e){
				System.out.println("" + intArray[1]);
				System.out.println("Exception 2 ");
			}
		} catch(Exception e) {
			System.out.println("Exception 3 ");
		} finally {
			System.out.println("finally 2 ");
		}



	}
	public static void main(String[] args) {
		new Finally_5().tryCatchFinally();
	}
}
