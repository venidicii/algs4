import edu.princeton.cs.algs4.*;
import java.util.*;

public class EqualOrNot{
	public static void main(String[] args){
		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		if (a == b && b == c)
			StdOut.println("equal");
		else
			StdOut.println("not equal");
	}
}
