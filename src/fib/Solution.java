package fib;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	private static Boolean DEBUG = false;

	private static List<Long> list = new ArrayList<>();

	private static long[] hako = { 0, 1, 1 };

	public static long sol2(final int n) {
		if (n == 0 || n == 1) {
			return Solution.hako[n];
		}
		for (int i = 2; i < n; i++) {
			long fib = 0;
			Solution.hako[0] = Solution.hako[1];
			Solution.hako[1] = Solution.hako[2];
			fib = Solution.fib2(Solution.hako[1], Solution.hako[0]);
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
		long ret = Solution.list.get(Solution.list.size() - 1);
		return ret;
	}

	private static long fib1(final int n) {
		long ret = Solution.list.get(n - 1) + Solution.list.get(Solution.list.size() - 2);
		if (Solution.DEBUG) {
			System.out.println("fib: " + ret);
		}
		return ret;
	}

}
