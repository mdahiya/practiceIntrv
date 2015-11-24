import java.util.*;

public class BitManipulation{
	public static void main(String[] args){
		int max=~0;
		System.out.println(Integer.toBinaryString(max));
		int left=max-((1<<2)-1);
		System.out.println(left);
		System.out.println(permutations("abc"));
		
	}
	private static List<String> permutations(String s) {
		System.out.println("String:\t"+s);
		List<String> permutations = new ArrayList<String>();
		if (s == null) {
			return null;
		} else if (s.length() == 0) {
			permutations.add("");
			return permutations;
		}
		
		List<String> remainder = permutations(s.substring(1));
		System.out.println("Remainder:\t "+remainder);
		for (String permutation : remainder) {
			System.out.println("permutation: \t"+permutation);
			for (int i = 0; i <= permutation.length(); ++i) {
				System.out.println("Insertion: "+insertCharAt(permutation, s.charAt(0), i));
				permutations.add(insertCharAt(permutation, s.charAt(0), i));
				System.out.println("permutations list:\t"+permutations);
			}
		}
		return permutations;
	}
	
	private static String insertCharAt(String s, char c, int i) {
		System.out.println("insertCharAt :\t"+s+" char:\t"+c+"  index:\t"+i);
			
		return new StringBuilder(s).insert(i, c).toString();
	}
		

}