package inheritance;
 class a{
	 void walk() {
		 System.out.println("animals can walk");
	 }
	 void eat() {
		 System.out.println("animals can eat");
	 }
	 void run() {
		 System.out.println("animals can run");
	 }
 }
 class dog extends a{
	 void eat() {
		 System.out.println("dog eats non-veg ");
	 }
	 void runs() {
		 System.out.println("dog runs very fast");
	 }
 }
 class e extends a{
	 void eat() {
		 System.out.println("elephant eats sugarcane very well");
	 }
	 void wight() {
		 System.out.println("elephant has tons of wight");
	 }
 }
 class lion extends a{
	 void eat() {
		 System.out.println("lion eats animals");
	 }
	 void sounds() {
		 System.out.println("lion sounds very loud");
	 }
 }
public class animalmethodsInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		e e=new e();
		lion l=new lion();
		
		d.walk();
		d.eat();
		d.run();
		d.runs();
		e.walk();
		e.run();
		e.eat();
		e.wight();
		l.walk();
		l.run();
		l.eat();
		l.sounds();
		

	}

}
