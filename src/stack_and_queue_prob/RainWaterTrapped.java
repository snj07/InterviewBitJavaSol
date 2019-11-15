package stack_and_queue_prob;

import java.util.Arrays;
import java.util.List;

/*
 * https://www.interviewbit.com/problems/rain-water-trapped/
 */
public class RainWaterTrapped {
	public int trap(final List<Integer> aList) {
		int result = 0; 
		  
	    int lmax = 0, rMax = 0; 
	  
	    int lo = 0, hi = aList.size() - 1; 
	  
	    while (lo <= hi) { 
	        if (aList.get(lo) < aList.get(hi)) { 
	            if (aList.get(lo) > lmax) 
	                lmax = aList.get(lo); 
	            else
	                result += lmax - aList.get(lo); 
	            lo++; 
	        } 
	        else { 
	            if (aList.get(hi) > rMax) 
	                rMax = aList.get(hi); 
	            else
	                result += rMax - aList.get(hi); 
	            hi--; 
	        } 
	    } 
	  
	    return result; 
	}

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(new Integer[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
		System.out.println(new RainWaterTrapped().trap(lst));
//		Stack<Integer> st = new Stack<>();
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		for(int x: st.i) {
//			System.out.println(x);
//		}
	}

}
