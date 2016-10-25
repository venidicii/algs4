import edu.princeton.cs.algs4.*;
import java.util.*;

public class PrintTable{
	public static void main(String[] args){
		String[] name = new String[100];
		int[] numerator = new int[100];
		int[] denomenator = new int[100];
		int num = 0;
		while(!StdIn.isEmpty()){
			name[num] = StdIn.readString();
			numerator[num] = StdIn.readInt();
			denomenator[num] = StdIn.readInt();
			num += 1;
		}
		for (int i = 0; i < num; ++i){
			StdOut.printf("%-8s\t%d\t%d\t%.3f\n", name[i], numerator[i], denomenator[i], (double)numerator[i]/denomenator[i]);
		}
	}
}
