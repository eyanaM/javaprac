package set_ex1;

import java.util.HashSet;

public class demoSet {

	public static void main(String[] args) {
		HashSet <String> HS= new HashSet<String>();
		HS.add("java");
		HS.add("Selenium");
		HS.add("cucumber");
		HS.add("maven");
		
		System.out.println(HS);
		System.out.println(HS.size());
		
		HS.remove("java");
		System.out.println(HS);
		
		
		for(String a:HS) {
			System.out.println(a);
			
		}
		System.out.println(HS.size());
		

	}

}
