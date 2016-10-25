import edu.princeton.cs.algs4.*;
import java.util.*;
import java.lang.Math.*;

public class LnOfFactorial{
	public static double lnoffactorial(int N){
		if (N == 1)
			return 0;
		else
			return lnoffactorial(N-1) + Math.log(N);
	}

	public static void main(String[] args){
		StdOut.println(lnoffactorial(20000));
	}
}
