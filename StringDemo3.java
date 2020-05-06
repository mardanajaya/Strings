
public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * trim method in strings is used to remove the extra spaces before and after the string
		 * replace() in string is used to replace certain part of the string with new string
		 * substring method to get the substring of the string
		 * length()
		 * charAt()*/
		String s1 = new String(" Hello World!! ");
		String t = s1.trim(); 
		System.out.println(t);
		
		String s2 = "popcorn";
		System.out.println(s2.replace('p','W'));
		
		String s = "this is an example";
		String a = s.substring(11);
		System.out.println(a);
		String b = s.substring(5, 10);
		System.out.println(b);
		
		String str = "Hello, World!";
		System.out.println(str.length());
		int length = str.codePointCount(0, str.length());
		System.out.println(length);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		
		
		
	}

}
