package day08_set_map_string;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap  map = new HashMap ();
		String key = null, value=null;
		System.out.println("������ Ű �Է�");
		key = input.next();
		System.out.println("������ �� �Է�");
		value = input.next();
		
		map.put(key, value);
		
		System.out.println(map);
	}

}
