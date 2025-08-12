package basiccodes;
import java.util.Scanner;
public class Farmer {
 double p;
 double t;
 static double r;
 double si;
 
 static {
	 r=3;
 }
   
 void collectdata() {
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("Enter the principle");
	 p=Sc.nextDouble();
	 System.out.println("Enter the Time");
	 t=Sc.nextDouble();
	
 }
 void calculatedata() {
	 si=(p*t*r)/100;
 }
	void display(){
		 System.out.println("Simple interest="+si);
	}
}

class mainapp{
	public static void main(String[] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		 System.out.println("Farmer Details 1");
		 f2.collectdata();
		 f2.calculatedata();
		 f2.display();
		 System.out.println("Farmer Details 2");
		 f1.collectdata();
		 f1.calculatedata();
		 f1.display();
		 System.out.println("Farmer Details 3");
		 f3.collectdata();
		 f3.calculatedata();
		 f3.display();
		
}
	
		
}
