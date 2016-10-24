import edu.princeton.cs.algs4.*;
import java.util.*;

public class Fibonacci
{
	static long[] dp = new long[101];
	
	public static long F(int N)
	{
		if (N == 0) return 0;
		if (N == 1) return 1;
		if (Fibonacci.dp[N] == 0)
		{
			Fibonacci.dp[N] = F(N-1) + F(N-2);
			return Fibonacci.dp[N];
		}
		else
			return Fibonacci.dp[N];
			
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 101; ++i)
			Fibonacci.dp[i] = 0;
		for (int N = 0; N < 100; N++)
			StdOut.println(N + " " + F(N));
	}
}
