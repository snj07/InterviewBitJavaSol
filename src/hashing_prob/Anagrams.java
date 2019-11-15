package hashing_prob;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	  public ArrayList<ArrayList<Integer>> anagrams(final List<String> aList) {
	         Map<ArrayList<Integer>, ArrayList<Integer>> map = new LinkedHashMap<>();

	        for(int i=0;i<aList.size();i++){
	            ArrayList<Integer> t = new ArrayList<>(26);
	            for(int k=0;k<26;k++){
	                t.add(0);
	            }
	            String s = aList.get(i);
	            for(int j=0;j<s.length();j++){
	                int pos = (s.charAt(j) - 'a');
	                int count = t.get(pos);
	                t.set(pos, count+1);
	            }
	            ArrayList<Integer> value = map.getOrDefault(t, new ArrayList<>());
	            value.add(i+1);
	            map.put(t,value);
	        }

	        return new ArrayList<>(map.values());
	        
	    }
//    public boolean matchMaps( HashMap<Character,Integer> map,  HashMap<Character,Integer> map1){
//        return map.entrySet().stream().filter(value -> map1.entrySet().stream().anyMatch(value1 -> (value1.getKey() == value.getKey() && value1.getValue() == value.getValue()))).findAny().isPresent();
//    }
}
