package Caculator;

import java.util.Scanner;

public class Caculator_clss {
	public static void main(String[] args) {
		Caculator();

	}

	public static void Caculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a-ni daxil edin");
		double a = sc.nextDouble();

		System.out.println("b-ni daxil edin");
		double b = sc.nextDouble();

		System.out.println("Emeliyyati daxil edin. +1, -2, *3, /4: ");
		int operation = sc.nextInt();

		double result = 0;
		
		switch(operation) {
			case 1:
			result = MathUtil.topla(a, b);
			System.out.println(result);
			break;
			
			case 2:
			result = MathUtil.cixma(a, b);
			System.out.println(result);
			
			break;
			case 3:
			result = MathUtil.vurma(a, b);
			System.out.println(result);
			break;
			
			case 4:
			result = MathUtil.bolme(a, b);
			System.out.println(result);
			break;
			
			default:
			result = -1;
			System.out.println(result);
		}
//		if (operation == 1) {
//			result = MathUtil.topla(a, b);
//
//		} else if (operation == 2) {
//			result = MathUtil.cixma(a, b);
//
//		} else if (operation == 3) {
//			result = MathUtil.vurma(a, b);
//			
//		} else if (operation == 4) {
//			result = MathUtil.bolme(a, b);
//		}
//		
//		System.out.println("Netice = " + result);

	}


}
