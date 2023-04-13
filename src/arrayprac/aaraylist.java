package arrayprac;

import java.util.ArrayList;

public class aaraylist {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		
		ar.add("mother");
		ar.add(20);
		ar.add("newyork");
		ar.add(25.40);
		
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		
		for(int i =0; i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			
			
		}
		
		

	}

}
