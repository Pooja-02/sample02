
package assignments;

//public class Assign2_1 {

/*	public static void main(String[] args) {
		 {
			 int i,j;
			 int c=0; 

			     for(i=0;i<c;i++)
			        {
			           c++; 
			              for(j=0;j<c;j++)
			              {
			                  System.out.print("a "); 

			              }
			          System.out.print(c);   
			          System.out.println(); 
			        }


			 }

	*/

	/*public static void main(String[] args){
	{
	int x= 0,y=0;
	for (int z = 0; z < 5; z++) {
	if (( ++x > 2 ) && (++y > 2)) {
	x++;
	
	System.out.println(x + " " + y);
	}}}}
}*/

/* class Test {
public static void main(String args[]) {
int x = -4;
System.out.println(x>>1);
int y = 4;
System.out.println(y>>1);
} }*/

public class Test {
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
	 // This method overrides the method in B
	 public void p(double i) {
	 System.out.println(i);
	 }
	}
