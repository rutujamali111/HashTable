

import java.util.HashMap;
import java.util.Map;

public class countOfWords {

		public static void main(String[] args)
		{

			String str = "To be or not To be";			
			Map<String, Integer> MyMapNode = new HashMap<>();
			String[] words = str.split(" ");
			for (String word : words) {
				Integer integer = MyMapNode.get(word);
				if (integer == null)					
					MyMapNode.put(word, 1);
				else {					
					MyMapNode.put(word, integer + 1);
				}
			}
			System.out.println(MyMapNode);
		}
	

}

