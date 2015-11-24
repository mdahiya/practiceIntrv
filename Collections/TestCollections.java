import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class TestCollections{

	//System.out.println(strList.toString());

public static void main(String[] args){
	Collection<String> strList=new ArrayList<String>();
	//List<String> strList=new ArrayList<String>();
	//List<String> strList=new ArrayList<String>();
	strList.add("Manish");
	strList.add("Nonu");
	strList.add("Anahi");
	strList.add("Anahi");


	System.out.println("==============================================================================");
	System.out.println(strList.stream().map(Object::toString).collect(Collectors.joining(", ")));

	System.out.println("==============================================================================");
	printUsingForLoop(strList);

	System.out.println("==============================================================================");
	//Collection<String> noDup=new HashSet<String>(strList);
	Collection<String> noDup=strList.stream().collect(Collectors.toSet());

	printUsingIter(noDup);

	System.out.println("==============================================================================");
	String[] a = strList.toArray(new String[0]);
	for(String names:a){
		System.out.println("String Array: "+names);
	}


	Collection<String> linkedHashSet=new LinkedHashSet<String>(strList);
	printUsingForLoop(linkedHashSet);

	System.out.println("==============================================================================");
	Collection<String> treeColl=strList.stream().map(Object::toString).collect(Collectors.toCollection(TreeSet::new));
	printUsingIter(treeColl);


	System.out.println("ArrayListSize: \t"+strList.size()+"\t Array Size:\t" + a.length);

	}
	
	public static void printUsingForLoop(Collection<String> c){
		for(String names:c){
		System.out.println(names+"\t");
		}
	}

		public static void printUsingForLoop(Collection<?> c, String Type){
		for(Object number:c){
		System.out.println(number+"\t");
		}
	}

	public static void printUsingIter(Collection<String> c){
		for(Iterator<String> it=c.iterator();it.hasNext();){
				System.out.println(it.next());


		}

	System.out.println("==============================================================================");
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}