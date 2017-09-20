package fib;

public class Main {

	public static void main(final String[] args) {
		System.out.println("INT MAX  : " + Integer.MAX_VALUE);
		System.out.println("LONG MAX : " + Long.MAX_VALUE);

		int checkNum = 40;

		long start1 = System.nanoTime();
		long sol1 = Solution.sol1(checkNum);
		System.out.println("Solution1: " + sol1);
		long end1 = System.nanoTime();

		long start2 = System.nanoTime();
		long sol2 = Solution.sol2(checkNum);
		System.out.println("Solution2: " + sol2);
		long end2 = System.nanoTime();

		long start3 = System.nanoTime();
		long sol3 = Solution.sol3(checkNum);
		System.out.println("Solution3: " + sol3);
		long end3 = System.nanoTime();

		long start4 = System.nanoTime();
		long sol4 = Solution.sol3(checkNum);
		System.out.println("Solution4: " + sol4);
		long end4 = System.nanoTime();

		if (sol1 != sol2) {
			System.err.println("ERROR");
		}

		long elapsed1 = end1 - start1;
		long elapsed2 = end2 - start2;
		long elapsed3 = end3 - start3;
		long elapsed4 = end4 - start4;

		System.out.println("Elapsed1: " + elapsed1 + " nanos");
		System.out.println("Elapsed2: " + elapsed2 + " nanos");
		System.out.println("Elapsed3: " + elapsed3 + " nanos");
		System.out.println("Elapsed4: " + elapsed4 + " nanos");

		// long duration = elapsed1 - elapsed2;
		// System.out.println("Duration: " +
		// TimeUnit.NANOSECONDS.toMillis(duration) + " ms");
	}

}
