package day08_set_map_string;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println("set : " +set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//Object o = it.next();
			//String s = (String)o;
			String s =(String)it.next();
			System.out.println(s);
		}
	}

}
