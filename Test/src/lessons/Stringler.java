package lessons;

import java.util.Scanner;



public class Stringler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Metni daxil edin: ");
		String s = sc.nextLine();
		
		
		int lngth = s.length();//String-in uzunlugunu verir
		System.out.println("length = " + lngth);
		
		char chrAt = s.charAt(s.length() - 1);//String-den istediyimiz indexdeki symbolu gotururuk.
		System.out.println("charA = " + chrAt);
		
		String substrng = s.substring(1 , 3);// String-den istediyimiz araliqda symbollari goture bilerik.
		System.out.println("substring = " + substrng);
		
		boolean cntns = s.contains("Lan");//Verilmis String-in icinde daxil edilen sozun ve ya symbolun  olub olmadigini yoxlayir
		System.out.println("contains = " + cntns);
		
		boolean eql = s.equals("Java Language");// Daxil edilmis symbolun verilmis symbol-a beraberliyini yoxlayir.(Boyuk kicik herflere diqqet edilir)
		System.out.println("equal = " + eql);
		
		boolean ignr_case = s.equalsIgnoreCase("JaVa LangUage");// Daxil edilmis symbolun verilmis symbol-a beraberliyini yoxlayir.(Boyuk kicik herflere diqqet edilmir)
		System.out.println("ignr_case = " + ignr_case);
		
		boolean empty = s.isEmpty();// Daxil edilen stringin bos olub olmadigini yoxlayir.
		System.out.println("empty = "+ empty);
		
		boolean strt_with = s.startsWith("Jav");// Daxil edilen stringin verilmis string-le baslayib-baslamadigini bildirir.(Boyuk kicik herflere diqqet edilir)
		System.out.println("strt_with = " + strt_with);
		
		boolean end_with = s.endsWith("age");// Daxil edilen stringin verilmis string-le bitib bitmediyini bildirir.(Boyuk kicik herflere diqqet edilir)
		System.out.println("end_with = " + end_with);
		
		String lower = s.toLowerCase(); //Boyuk herfle daxil edilen string-in butun herflerini kiccik herfe cevirir.
		System.out.println("lower = " + lower);
		
		String to_upper_case = s.toUpperCase(); //Kiccik herfle daxil edilen string-i butun herflerini boyuk herfe cevirir.
		System.out.println("upper = " + to_upper_case);
		
		String trm = s.trim();//Daxil edilen string-in evvelinde ve sonunda olan bosluqlari silir.
		System.out.println("trim = " + trm);
		
		int index_of = s.indexOf("Lan");// verilmis string-in, daxil edilmis stringde necenci yerden basladigini gosterir. Tapa bilmedikde -1 gosterir.
		System.out.println("indexOf = " + index_of);
		
		int last_index_of = s.lastIndexOf("a"); //Daxil edilmis string-in verilmis stringde en son necenci yerde islendiyini gosterir.
		System.out.println("lastIndexOf = " + last_index_of);
		
		String replace_ = s.replace("Java", "Hello World! ");// Verilmis stringin icinde xususi stringi verilmis string-le evez edir.
		System.out.println("replace = " + replace_);
		

		

		
	}


}
