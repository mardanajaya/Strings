import java.util.StringTokenizer;
import java.util.StringJoiner;
public class StringDemo2 {
public static void main(String [] args) {
	/**
	 * usage of split(delimiters) in strings
	 * using the same function as split() by StringTokenizer class 
	 * string.join() to combines the strings with delimeters
	 * usage of StringJoiner class*/
	String lineFromCsvFile = "Mickey;Bolton;12345;121216";
	String[] dataCells = lineFromCsvFile.split(";");
	// Result is dataCells = { "Mickey", "Bolton", "12345", "121216"}
	System.out.println(dataCells[0]);
	
	String s = "a|b|c";
	String[] arr = s.split("\\|",-1);
	for(String i:arr) {
		System.out.println(i);
		
	}
	String str = "jumped over";
	// In this case character `u` and `e` will be used as delimiters
	StringTokenizer tokenizer = new StringTokenizer(str, "ue");
	while (tokenizer.hasMoreTokens()) {
	 System.out.println(tokenizer.nextToken());
	}
	
	String str1 = "jayasri";
	StringTokenizer tokenizers=new StringTokenizer(str1);
	while (tokenizers.hasMoreTokens()) {
		System.out.println(tokenizers.nextToken());
	}
	String[] elements = { "foo", "bar", "foobar" };
	String singleString = String.join(" + ", elements);
	System.out.println(singleString); 
	
	StringJoiner sj = new StringJoiner(", ");
	 
	 // u can also define prefix and suffix for the result string by using inverted commas
	sj.add("foo");
	sj.add("bar");
	sj.add("foobar");
	System.out.println(sj); 
}
}
