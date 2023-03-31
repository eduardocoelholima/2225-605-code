package previous_exams.exam2_2221;

public class Q3 {
	public void run() {
		int[] intArray = {2};
		try {
			try {
				try {
					System.out.println("" + intArray[1]);
					System.out.println("Exception 0 ");
				} catch(NullPointerException e) {
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
	public static void main(String[] args) { new Q3().run(); }
}

// 1. What will be the output of this program?

//Exception 1
//finally 2

// 2. For all lines that are not executed, explain the reason for that.

//1st (inner most) catch is executed due to an out-of-bounds index used in an array
//other catch blocks will never execute
//single finally block is executed
