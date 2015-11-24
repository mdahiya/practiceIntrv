import java.util.Arrays;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Anagrams{


	public static void main(String[] args){
		String[] wordList= {"accreted","adhibits","elapse","manish"};
		Map<String,List<String>> wordMap=new HashMap<String,List<String>>();
		for(String word:wordList){
			String alpha=alphabetize(word);
			 List<String> l = wordMap.get(alpha);
			  if (l == null)
                    wordMap.put(alpha, l=new ArrayList<String>());
                l.add(word);

		}
		 // Print all permutation groups above size threshold
        for (List<String> l : wordMap.values())
                System.out.println(l.size() + ": " + l);


	}	


	private static String alphabetize(String org){
		char[] charArray=org.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);


	}
}