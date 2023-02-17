package lessons;

import java.util.Scanner;

public class arraylar {

	public static void main(String[] args) {
//		birsiraliMassiv();
//		coxsiraliMassiv();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Daxil edin: ");
		String word = sc.nextLine();
//		tersDuz(word);
		 
	}
	

	public static void tersDuz(String word) {

		for(int i = 0; i< word.length(); i ++) {
			System.out.println("Duz = " + word.charAt(i) + "," + "Ters = " + word.charAt(word.length() - 1 - i));
		}
	}
	
	public static void birsiraliMassiv() {
		
		int[] list = new int[12];// {0, 0, 0, 0, 0, 0, 0};
		
		System.out.println("Daxil Etme Basladi");
		for(int i=0; i<list.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println(i + "Ededi Daxil edin:");
			list[i] = sc.nextInt();
		}
		for(int t = 0; t<list.length; t++) {
			System.out.println(t + "," + list[t]);
		}
	}
	
	public static void coxsiraliMassiv() {
		int[][] list = new int[2][5];
		System.out.println("2-ci Daxil Etme Basladi");
		for(int sutun=0; sutun<list.length; sutun++) {
			
			for(int setir=0; setir<list[sutun].length; setir++) {
				Scanner sc = new Scanner(System.in);
				System.out.println(setir + "Ededi Daxil edin:");
				list[sutun][setir] = sc.nextInt();
				
			}

		}
		
		System.out.println("Chap edilme");
		for(int sutun=0; sutun<list.length; sutun ++) {
			for(int setir=0; setir<list[sutun].length; setir ++) {
				System.out.println(sutun + "," + setir + "." + list[sutun][setir]);
			}
		}
		
		
	}

}
