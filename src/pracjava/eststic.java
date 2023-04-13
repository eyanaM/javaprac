package pracjava;

public class eststic {

	public static void main(String[] args) {
		eststic.gstatic();
		eststic.eint();
		eststic.epara(500, 600);
		eststic.eparasting("USA, ", "New York");

	}
	
	public static void gstatic() {
		String name= "eyana";
		String is = " rozario";
		String myname= name+is;
		
		System.out.println(myname);
	}
	
	public static void eparasting( String country, String city) {
		String adress = country+city;
		System.out.println("i live in " + adress);
		
	}

	public static void eint() {
		int a = 50;
		int b = 50;
		int c = a+b;
		System.out.println(c);
	}
	public static void epara(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}
	
}
