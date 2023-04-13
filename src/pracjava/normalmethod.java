package pracjava;

public class normalmethod {

	public static void main(String[] args) {
		
		normalmethod emg= new normalmethod();
		emg.white1();
		emg.white2();
		emg.white3();
		emg.white4();
		emg.blue();

	}
	
	public void white1 (){
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println(c);
		
	}
	
	
	public void white2 () {
		
		int a = 2000;
		int b = 1400;
		int c = a-b;
		
		System.out.println(c);
		
	}
	
	public void white3 () {
		int a = 20;
		int b = 30;
		int c = a*b;
		
		System.out.println(c);
		
	}
	public void white4 () {
		int a = 120;
		int b = 12;
		int c = a/b;
		
		System.out.println(c);
		
	}
	public void blue() {
		String my = "love";
		String name = " is";
		String eyana = " Matt";
		String fullthing = my + name + eyana ;
		System.out.println("my dear " +  fullthing);
		
		
	}

}
