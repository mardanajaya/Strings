
public class stringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * String equals method usage
		 * String equalsIgnoreCase method usage
		 * Testing what is wrong in case of == and !=
		 * how we can overcome == and != false case using String intern method
		 * String contains usage
		 *indexOf usage
		 **/
		String firstString = "Test123";
		String secondString = "Test" + 123;
		if (firstString.equals(secondString)) {//1
		 // Both Strings have the same content.
   System.out.println("done");
   
	}
		String a = "Test123";
		String b = "TEST" + 123;
		System.out.println(a.equalsIgnoreCase(b));//2
		 
		String foo="Null";
		System.out.println(foo.equals("baz") );
		
		String strObj = new String("Hello!");
		String str = "Hello!";
		
		// The two string references point two strings that are equal
		if (strObj.equals(str)) {
		 System.out.println("The strings are equal");
		}
		// The two string references do not point to the same object
		if (strObj != str) {
		 System.out.println("The strings are not the same object");
		}
		
		// If we intern a string that is equal to a given literal, the result is
		// a string that has the same reference as the literal.
		String internedStr = strObj.intern();
		if (internedStr == str) {
		 System.out.println("The interned string and the literal are the same object");
		 
		 String str1 = "Hello World";
		 String str2 = "Hello";
		 String str3 = "helLO";
		 System.out.println(str1.contains(str2)); //prints true
		 System.out.println(str1.contains(str3)); //prints false
		 
		 int j=str1.indexOf("l");//gives th e first occurenceof l//you can give char or string as input
		 System.out.println(j);
		 
	}
}
}