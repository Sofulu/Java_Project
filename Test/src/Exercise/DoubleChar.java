package Exercise;

/*
 * This code return a string that repeat two times each character of given string.
 */
public class DoubleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleChar("alma");


	}
	
	public static String doubleChar(String s) {
		char[] list = s.toCharArray();
		String result = "";
		
		for(char i : list) 
			result = result + "" + i + "" + i;
		
		
		System.out.println(result);
		return result;
		
	}

		
	}


