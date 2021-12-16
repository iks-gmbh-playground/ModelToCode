package flexml.gentest;

public class Counter {
	private static int count = 1;
	
	public static int nextCount() {
		return count++;
	}
}
