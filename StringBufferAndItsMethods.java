
public class StringBufferAndItsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*capacity()
		 * length()
		 * append()
		 * insert()
		 * delete()
		 * reverse()
		 * charAt()
		 * substring()
		 */
         StringBuffer sb = new StringBuffer("Maradana");
         System.out.println(sb.capacity());//default the capacity 16 + (maradana)8 = 24
         System.out.println(sb.length());//length which gives the string contains 8
         
        	 sb.append("Jaya");
        	 System.out.println(sb);
        	 
        	 sb.insert(8, " ");
        	 System.out.println(sb);
        	 
        	 sb.delete(9, 14);
        	 System.out.println(sb);
        	 
        	 System.out.println(sb.reverse());
        	 System.out.println(sb.charAt(3));
        	 
        	 System.out.println(sb.substring(4));
        	 System.out.println(sb.substring(4,6));
        	   
	}

}
