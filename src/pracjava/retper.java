package pracjava;

public class retper {

	public static void main(String[] args) {
		retper.mypara(900, 100);
		retper.myparastring("Panjora Girls High School, ", "Dhaka City College");
		
		
		

	}
	public static int mypara(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
		return c;
		
	}
	public static String myparastring( String school, String college) {
		String education=school+college;
		
		System.out.println("i graduate from " +education);
		
		return education;
		
	}

}
