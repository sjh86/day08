package day08_set_map_string;

public class EX09 {

	public static void main(String[] args) {
		String str = new String("ㅇ리ㅏ러");
		System.out.println( str.length());
		System.out.println( str.charAt(2));

		str +="안녕하세요";
		System.out.println(str);
		



		System.out.println(str.charAt(0)=='a');
		
		System.out.println(str.charAt(0)-32 );
		System.out.println((char)(str.charAt(0)-32));
	}

}
