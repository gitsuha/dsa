package com.suha.app;

public class DynamicProgrammingFibonacci {

	static int fibonacci(int i) {
		if (i == 0)
			return 0;
		if (i == 1)
			return 1;
		return fibonacci(i - 1) + fibonacci(i - 2); 
	}
	
	static int fibonacci_dp_td_memo(int i) {
		return fibonacci_dp_td(i, new int[i + 1]);
	}
	
	static int fibonacci_dp_td(int i, int[] memo) {
		if (i == 0)
			return 0;
		if (i == 1)
			return 1;
		if (memo[i] == 0)
			memo[i] = fibonacci(i - 1) + fibonacci(i - 2);

		return memo[i]; 
	}
	
	static int fibonacci_bu(int i) {
		if (i == 0)
			return 0;
		if (i == 1)
			return 1;
		int[] memo = new int[i];
		
		memo[0] = 0;
		memo[1] = 1;
		
		for (int j = 2; j < i; j++)
			memo[j] = memo[j - 1] + memo[j - 2]; 

		return memo[i - 1] + memo[i - 2]; 
	}	
	public static void main(String[] args) {
		System.out.println(fibonacci(12));
		System.out.println(fibonacci_dp_td_memo(12));
		System.out.println(fibonacci_bu(12));
	}
}
