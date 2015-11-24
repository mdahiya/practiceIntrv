import java.util.List;
import java.util.ArrayList;

public class Combinations{
	int n;
	int k;
	List<Integer> inputList=new ArrayList<Integer>();

	public Combinations(int n, int k){
		this.n=n;
		this.k=k;
		for(int i=0;i<n;i++)
			inputList.add(++i);

	}
	//C(n,k) = C(n-1, k) + C(n-1, k-1)
	public List<List<Integer>> findCombinations(int n,int k){
		if (n<k) throw new IllegalArgumentException();
		if (k==1) {
			List<List<Integer>> ret = new ArrayList<List<Integer>>();
			for (int i=1; i<=n; i++) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				ret.add(list);
			}
			System.out.println("k==1 return:\t"+ret);
			return ret;
		}
		if (k==n) {
			List<List<Integer>> ret = new ArrayList<List<Integer>>();
			List<Integer> list = new ArrayList<Integer>();
			for (int i=1; i<=n; i++) {
				list.add(i);
			}
			ret.add(list);
			System.out.println("k==n return:\t"+ret);
			return ret;
			
			
		}
		
		List<List<Integer>> combo1 = findCombinations(n-1, k);
		System.out.println("combo1:\t"+combo1);
		List<List<Integer>> combo2 = findCombinations(n-1, k-1);
		System.out.println("combo2:\t"+combo2);
		for (List<Integer> list:combo2) {
			list.add(n);
		}
		System.out.println("combo2 after addition:\t"+combo2);
		combo1.addAll(combo2);
		System.out.println("combo1 after addition:\t"+combo1);
		return combo1;

		//findCombinations(n-1,k)+findCombinations(n-1,k-1);

	}

	public void findComb(){
		List<String> outputList=new ArrayList<String>();
		StringBuilder sbr;
		int lastPos=0;
		for(int i=0;i<k;i++){
			sbr=new StringBuilder();
			lastPos=0;
			for(int j=i;j<k+i;j++){
				sbr.append(j+1);
				lastPos=j;
			}
			outputList.add(sbr.toString());
			if(lastPos<n && k<=lastPos-i){
				for(int j=lastPos;j<n;j++){

				}
			}
			System.out.println(sbr);

		}
	}
	public static void main(String[] args){
		Combinations combinations=new Combinations(5,3);
		System.out.println(combinations.findCombinations(3,2));
	}



}

class TestCombinations{

}