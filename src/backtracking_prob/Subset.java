package backtracking_prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Subset {
	   public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> aList) {
	        Collections.sort(aList);
	        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
	        return createSubsets(aList, new ArrayList<Integer>(),ansList,0);
	    }
	    
	    public ArrayList<ArrayList<Integer>> createSubsets(ArrayList<Integer> aList, ArrayList<Integer> cList, ArrayList<ArrayList<Integer>> ansList, int index){
	        ArrayList<Integer> newList = new ArrayList<>(cList);
	        ansList.add(new ArrayList<Integer>(cList));
	        for(int i = index; i<aList.size(); i++){
	            newList.add(aList.get(i));
	            this.createSubsets(aList,newList,ansList,i+1);
	            newList.remove(newList.size()-1);
	        }
	        return ansList;
	    }
	    public static void main(String[] args) {
	    	Integer arr[] = new Integer[] { 1,2,3};
			System.out.println(new Subset().subsets(new ArrayList<Integer>((Arrays.asList(arr)))));
		}
}
