import java.util.StringTokenizer;
public class StringTokensDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("apple ball cat dog"," ");
		 while (st.hasMoreTokens()) {
		 System.out.println(st.nextToken()); 
	}
		 StringTokenizer st1 = new StringTokenizer("apple,ball cat,dog", ",");
		 while (st1.hasMoreTokens()) {
		 System.out.println(st1.nextToken());
	}
	}
}
