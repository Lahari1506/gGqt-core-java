package inheritancee;
class animal{
	public animal() {
		super();//by default in the first line of constructor super method will be there.
		System.out.println("Animal zero parametarized construcato");
	}
	public animal(String message) {
		super();
		System.out.println("animal parametarized constructor is invoked");
		System.out.println("the animal constructor has recieved the messag e as :"+message);
	}
}
class elephant extends animal{
	String name;
	double weight;
	public elephant() {
		super("hello from elephant");
		System.out.println("hii from elephant cinstructor");
	}
	public elephant(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}
public class ConstructorIncaseOfInheritance {
public static void main(String args[]) {
	elephant e=new elephant();
	System.out.println("================================");
	
elephant e1= new elephant("arjuna",5600);
}
}
