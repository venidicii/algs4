import edu.princeton.cs.algs4.*;
import java.util.*;

public class BinominalDistribution{
	public static long[][] dp;

	public static double binomial(int N, int k, double p)
	{
		if ((N == 0) || (k < 0)) return 1.0;
		return (1.0 - p)*binomial(N-1, k) + p*binomial(N-1, k-1);
	}

	public static long binomial(int N, int k){
		if (N < k)
			return 0;
		else if (N == 0 || (k == 0))
			return 1;
		long med = dp[N-1][k-1];
		if (med == 0){
			med = binomial(N-1, k) + binomial(N-1, k-1);
			dp[N-1][k-1] = med;
			return med;
		}
		else
			return med;
	}

	public static void main(String[] args){
		int N = StdIn.readInt();
		int k = StdIn.readInt();
		double p = StdIn.readDouble();
		dp = new long[N][k];
		for(int i = 0; i < N; ++i)
			for(int j = 0; j < k; ++j)
				dp[i][j] = 0;
		StdOut.println(binomial(N, k, p));
	}
}
