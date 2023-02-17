package lessons;

import java.util.Scanner;


public class if_else {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("a-ni daxil edin: ");
	       double a = sc.nextDouble();
	       
	       System.out.println("b-ni daxil edin: ");
	       double b = sc.nextDouble();
	       
	       System.out.println("Emeliyyat daxil edin: ");
	       double emeliyyat = sc.nextDouble();
	       
	       double netice = 0;
	       
	       
	       
	       if(emeliyyat == 1) {
	    	   netice = a + b;
	    	  
	       }
	       
	       else if(emeliyyat == 2) {
	    	   netice = a - b;
	    	   }
	       
	       else if(emeliyyat == 3) {
	    	   netice = a * b;
	    	   }
	       
	       else if(emeliyyat == 4 & a != 3) {
	    	   netice = a / b;
	       }
	       
	       else {
	    	   System.out.println("Duzgun emeliyyat daxil edin.");
	       }
	       
		   System.out.println("Netice = " + netice);

	       netice = (a != b)? a + b: 0; 
		}


}
