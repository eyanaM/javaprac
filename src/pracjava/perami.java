package pracjava;

public class perami {

	public static void main(String[] args) {
		
		perami cmg= new perami();
		cmg.para("Matt ", "Gomes");
		cmg.paraint(300, 200);
		
	}
	public void para(String firstname, String lastname) {
		String fullname= firstname+ lastname;
		System.out.println(fullname);
	}
	
	public void paraint(int a, int b) {
		int c = a+b ;
		
		System.out.println(c);
	}

}
