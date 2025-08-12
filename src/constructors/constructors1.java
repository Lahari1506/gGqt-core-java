package constructors;
class dog{
	private String name;
	private String color;
	private int price;
	private int age;
	private String breed;
	
	// zero parametarized constructor
	
	public dog() {
		super();
		System.out.println(" inside zero parametarized constructor");
		this.name="romu";
		this.color="red";
		this.price=2000;
		this.age=4;
		this.breed="pug";
		
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("==================");
	}
	
	// one parametarized constructor
	
	public dog(String name) {
		this();
		System.out.println("tnside one parameterized constructor");
		
		this.name=name;

		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("==================");
	}
	
	public dog(String name,String color) {
		this("chintu");
		System.out.println("inside two parameterized constructors");
		
		this.name=name;
		this.color=color;
		
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("==================");
	}
	public dog(String name,String color,int price) {
		this("tommy","red");
		System.out.println("inside three parametarized constructors");
		
		this.name=name;
		this.color=color;
		this.price=price;
		
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("==================");
	}
	public dog(String name,String color,int price,int age) {
		this("doddy","brown",9000);
		System.out.println("inside four parametarized constructor");
		
		this.name=name;
		this.color=color;
		this.price=price;
		this.age=age;
		
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("==================");
	}
	public dog(String name,String color,int price,int age , String breed) {
		this("doddy","brown",9000,5);
		System.out.println("inside five parametarized constructor");
		
		this.name=name;
		this.color=color;
		this.price=price;
		this.age=age;
		this.breed=breed;
		
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("==================");
	}
}
public class constructors1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d1=new dog("rockey","white",3000,4,"pug");
		

	}

}
