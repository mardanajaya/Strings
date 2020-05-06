
public class DifferencebtwStringandStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * StringClass is immutable
		 * StringBufferclass is mutable but synchronized
		 * StringBuilder is mutable and non synchronized
		 * 
		 */
		 String str = "study";
		 str.concat("tonight");
		 System.out.println(str); // Output: study
		 StringBuffer strB = new StringBuffer("study");
		 strB.append("tonight");
		 System.out.println(strB); // Output: studytonight//

	}

}
