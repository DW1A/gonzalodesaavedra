package codeWars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
    if (a != null && b != null && a.length == b.length  ) {
    	int[] aSquared = squareArray(a);
    	
    	IntStream streamA = Arrays.stream(aSquared).sorted();
    	IntStream streamB = Arrays.stream(b).sorted();
    	
    	int[] aSquaredSorted = streamA.toArray();
    	int[] bSquaredSorted = streamB.toArray();
      
			return Arrays.equals(aSquaredSorted , bSquaredSorted);
    	
    }else {
		return false;
	}
  }
	public static int[] squareArray(int[] a){
    	for (int i = 0; i < a.length; i++) {
    		a[i] = a[i] * a[i];
		}
    	return a;
	}
	
}

//Es mi primera vez usando streams así que supongo que están bastante mal utilizados.