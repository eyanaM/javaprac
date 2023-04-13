package pracjava;

public class returntynonpem {

	public static void main(String[] args) {
		
		returntynonpem objret = new returntynonpem();
		
		objret.my_retun();
		
		objret.minestringret();
	}
	
	public int my_retun() {
		int a = 40;
		int b = 60;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public String minestringret() {
		String my = "person_is ";
		String favorite = "my_mom";
		String love = my+favorite;
		
		System.out.println(love);
		return love;
	}

}
