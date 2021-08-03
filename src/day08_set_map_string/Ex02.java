package day08_set_map_string;

import java.util.ArrayList;
import java.util.Iterator;
public class Ex02 {

	public static <E> void main(String[] args) {
	ArrayList arr = new ArrayList();
	
	arr.add("¿œ");
	arr.add("¿Ã");
	arr.add("ªÔ");

	Iterator it = arr.iterator();
	System.out.println(it.hasNext());
	System.out.println(it.next());
	}

}
