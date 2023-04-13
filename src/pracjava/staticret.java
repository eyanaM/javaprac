package pracjava;

public class staticret {

	public static void main(String[] args) {
		staticret.matt(30, 5);
		staticret.eyaana("Next Tech ITC ", "six months");
		staticret.goal();
		
		
	}
	public static int matt(int a, int b) {
		int c = a*b;
		System.out.println(c);
		
		return c ;
		
	}
	
	public static String eyaana(String course, String duration) {
		String major= course+duration;
		System.out.println(major);
		
		return major;
		
	}
	
	public static int goal() {
		int a = 30;
		int b = 50;
		int c = a+b;
		
		System.out.println(c);
		return c;
	}

}
