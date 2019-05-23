import java.util.ArrayList;
import java.util.*;

public class ArraySorter {

	
	public static void main(String[] args) {
		
	
	int[] a = {1,4,2,6};
	
	Arrays.sort(a);
	
	System.out.println(Arrays.toString(a));
	System.out.println();
	
	String[] s = {"Casey", "Sean", "Ruan", "Liam", "Jack", "Brett"};
	
	ArrayList<String> s2 = new ArrayList<String>();
	
	for(String b:s)
	{
		
		s2.add(b);
		
	}
	
	ListIterator<String> iter = s2.listIterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
		

	}
	System.out.println("***************");
	while(iter.hasPrevious()) {
		
		System.out.println(iter.previous());
	}}}
	

