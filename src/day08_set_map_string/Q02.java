package day08_set_map_string;
import java.util.*;
public class Q02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		String name = null;
		String price = null;
		int num=0;
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.�� ��");
			System.out.print(">>> ");
			num = input.nextInt();
			if(num == 1) {
				System.out.print("�޴� �Է� : ");
				name = input.next();
				if(map.containsKey(name)==false) {
				System.out.print("���� �Է� : ");
				price = input.next();
				map.put(name, price);
				System.out.println("��� �Ǿ����ϴ�.");
				}else {
					System.out.println("�����ϴ� �޴� �Դϴ�");
				}
			}
			else if(num == 2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
			}
			else break;
		}

	}

}
