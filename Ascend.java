// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (lim * Math.random());
		int b = (int) (lim * Math.random());
		int c = (int) (lim * Math.random());
		int low1 = Math.min(a,b);
		int low2 = Math.min(low1,c);
		int high1 = Math.max(a,b);
		int high2 = Math.max(high1,c);
		int middle = ((a + b + c) - (low2 + high2));
		System.out.println(a + " " + b + " " + c);
		System.out.println(low2 + " " + middle + " " + high2);
		

		// Replace this comment with your code
	}
}
