package assignments;

public class Ttest {

		 public static void main(String[] args) {
		 A a = new A();
		 a.p(10);
		 a.p(10.0);
		 }
		}
		class B {
		
		 public void p(double i) {
		 System.out.println(i * 2);
		 }
		}
		class A extends B {
			public static void main(String[] args) {
		 // This method overrides the method in B
		 //int i=10;
				 A a = new A();
				 //A a = new A();
				a.p(10.2);
				double i=10.2;
				System.out.println(i * 2);
		 }
		}
		


	


