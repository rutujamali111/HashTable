

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordfrequencyinPara {

	public static void main(String[] args) {
		String inp ="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		countwords(inp);
	}

	private static void countwords(String inp) {
		inp = inp.toLowerCase().replaceAll("[^a-z ]", "");
        List<String> arr = new LinkedList<String>();
        String[] sentarr = inp.split(" ");
        Map<String, Integer> a = new HashMap<String, Integer>();
        for (String word : sentarr) {
            arr.add(word);
        }
        for (String word : arr) {
            int count = Collections.frequency(arr, word);
            a.put(word, count);
        }
        for (String key : a.keySet()) {
            System.out.println(key + " = " + a.get(key));
        }
		
	}

}
