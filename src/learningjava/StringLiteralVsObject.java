package learningjava;

public class StringLiteralVsObject {

	public static void main(String[] args) {

		String str1 = "POS";
		String str2 = new String ("POS");
		String str3 = "POS";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		
		
		

	}

}
