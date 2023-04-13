package arrayprac;

import java.util.ArrayList;

public class genericArylist {

	public static void main(String[] args) {
		ArrayList<String> great= new ArrayList<String>();
		
		great.add("eyana");
		great.add("evens");
		great.add("elen");
		great.add("nitu");
		great.add("yean");
		great.add("emon");
		
		
		System.out.println(great.size());
		System.out.println(great.get(3));
		
		
		for(String a:great) {//advance or enhance for loop,
			System.out.println(a);
		}
		
		
		

	}

}
