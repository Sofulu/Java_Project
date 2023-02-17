package Exercise;

import java.util.Scanner;

/*
 * This code sums the digits of a given number.
 */

public class CountGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Daxil edin: ");
		int num = sc.nextInt();
		String strNum = Integer.toString(num);
		System.out.println(strNum);
		int[] list = new int[strNum.length()];
		int a = 0;
		for(int i = 0; i < strNum.length(); i ++) {
			
			a += Character.getNumericValue(strNum.charAt(i));
//			list[i] = ;
		}
		System.out.println(a);
	}

}
