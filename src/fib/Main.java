package fib;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(final String[] args) {
		System.out.println("INT MAX  : " + Integer.MAX_VALUE);
		System.out.println("LONG MAX : " + Long.MAX_VALUE);

		int checkNum = 92;

		long start1 = System.nanoTime();
		long sol1 = Solution.sol1(checkNum);
		System.out.println("Solution1: " + sol1);
		long end1 = System.nanoTime();

		long start2 = System.nanoTime();
		long sol2 = Solution.sol2(checkNum);
		System.out.println("Solution2: " + sol2);
		long end2 = System.nanoTime();

		if (sol1 != sol2) {
			System.err.println("ERROR");
		}

		long elapsed1 = end1 - start1;
		long elapsed2 = end2 - start2;

		System.out.println("Elapsed1: " + elapsed1 + " nanos");
		System.out.println("Elapsed2: " + elapsed2 + " nanos");
		long duration = elapsed1 - elapsed2;
		System.out.println("Duration: " + TimeUnit.NANOSECONDS.toMillis(duration) + " ms");
	}

}
