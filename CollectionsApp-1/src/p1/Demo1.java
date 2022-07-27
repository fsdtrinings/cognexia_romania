package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Demo1 {

	public static void main(String[] args) {
		
		
		//List list = new ArrayList();
		
		Set list = new TreeSet();
		
		
		list.add(15);
		list.add("Hello");
		list.add(new Exception("Demo"));
		
		System.out.println(list);
	//	System.out.println(list.get(1)); // IndexOutOf Exception
		
		Object arr[] = list.toArray();
		
		int size = list.size();
		
		for (Object object : list) {
			System.out.println(object.toString());
		}
		
		
		/// ----- Iterator ---- 
		
		Iterator itr  = list.iterator();
		
		while(itr.hasNext())
		{
			 Object obj= itr.next();
			 System.out.println(obj.toString());
		}
		
	}//end main
	
}//end class
