/**
 * 
 */
package project1;

/**
 * @author 26941
 *
 */
public class class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, firstTerm = 0, secondTerm = 1, p = 1;
		System.out.print("Hello worBDld bbD.!");

		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			p = p / 0;
			System.out.println(p);
		}
	}
}
