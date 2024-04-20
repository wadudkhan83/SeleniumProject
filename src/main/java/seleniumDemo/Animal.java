package seleniumDemo;

public class Animal {

	public static void main(String[] args) {
		
	//	Animal obj = new Animal ();
		Human obj = new Human();
		obj.leg();
		obj.eye();
		obj.head();
		obj.body();
		
		System.out.println("Java");
		
	}
	
	public void leg () {
		System.out.println("Animal leg");
	}
		private void eye() {
			System.out.println("Animal eye");
		}
		void head() {
			System.out.println("Animal head");
		}
		protected void body() {
			System.out.println("Animal body");
		}
		//parameterized method
		public int addTwoNum(int a, int b) {
			System.out.println(a+b);
			return a+b;
			
		}
		public String addTwoString(String name, String line) {
			System.out.println(name+line);
			return name + line;
			
		}
		}
	
		

