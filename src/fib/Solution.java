package fib;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	private static Boolean DEBUG = false;

	private static List<Long> list = new ArrayList<>();

	private static long[] hako = { 0, 1, 1 };
	private static long[] memo = new long[10000];
	private static long[] dpbox = new long[10000];

	// DP
	public static long sol4(final int n) {
		Solution.dpbox[0] = 0;
		Solution.dpbox[1] = 1;
		for (int i = 2; i < n; i++) {
			Solution.dpbox[i] = Solution.dpbox[i - 1] + Solution.dpbox[i - 2];
		}
		return Solution.dpbox[n];
	}

	// Memoization
	public static long sol3(final int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (Solution.memo[n] != 0) {
			return Solution.memo[n];
		}
		return Solution.sol3(n - 1) + Solution.sol3(n - 2);
	}

	public static long sol2(final int n) {
		if (n == 0 || n == 1) {
			return Solution.hako[n];
		}
		for (int i = 2; i < n; i++) {
			long fib = 0;
			Solution.hako[0] = Solution.hako[1];
			Solution.hako[1] = Solution.hako[2];
			fib = Solution.fib2(Solution.hako[1], Solution.hako[0]);
			if (fib < 0) {
				System.err.println("[ERROR] Watchdog2 detected.");
				System.exit(-1);
			}
			Solution.hako[2] = fib;
			if (Solution.DEBUG) {
				for (int j = 0; j < 3; j++) {
					System.out.println("hako[" + j + "]: " + Solution.hako[j]);
				}
			}
		}
		return Solution.hako[2];
	}

	private static long fib2(final long num1, final long num2) {
		return num1 + num2;
	}

	public static long sol1(final int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		Solution.list.add(0, 1l);
		Solution.list.add(1, 1l);
		for (int i = 2; i < n; i++) {
			Solution.list.add(i, Solution.fib1(i));
		}
		long fib = Solution.list.get(Solution.list.size() - 1);
		return fib;
	}

	private static long fib1(final int n) {
		long fib = Solution.list.get(n - 1) + Solution.list.get(Solution.list.size() - 2);
		if (Solution.DEBUG) {
			System.out.println("fib: " + fib);
		}
		if (fib < 0) {
			System.err.println("[ERROR] Watchdog1 detected.");
			System.exit(-1);
		}
		return fib;
	}

}
