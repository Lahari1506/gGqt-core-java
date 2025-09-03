package HasaRetation;

class brain{
	double size;
	int iq;
	public brain(double size, int iq) {
		super();
		this.size = size;
		this.iq = iq;
	}
	public double getSize() {
		return size;
	}
	public int getIq() {
		return iq;
	}
	
	
}
class heart{
	double weight;
	int valves;
	public heart(double weight, int valves) {
		super();
		this.weight = weight;
		this.valves = valves;
	}
	public double getWeight() {
		return weight;
	}
	public int getValves() {
		return valves;
	}
	
	
}
class Human{
	brain bn =new brain(45.8,7);
	heart h=new heart(70.9,65);
	
}
class book{
	int pages;
	String name;
	public book(int pages, String name) {
		super();
		this.pages = pages;
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public String getName() {
		return name;
	}
	
}
class mobile{
	String company;
	String name;
	public mobile(String company, String name) {
		super();
		this.company = company;
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public String getName() {
		return name;
	}
	
}
class student extends Human{
	void hasbook(book b1) {
		System.out.println(b1.getName());
		System.out.println(b1.getPages());
	}
	void hasmobile(mobile m) {
		System.out.println(m.getCompany());
		System.out.println(m.getName());	
	}
	}
public class CompositeAndAggregation2 {

	public static void main(String[] args) {
		student s=new student();
		book b1=new book(160,"harry potter");
		mobile m=new mobile("apple","iphone16pro");
		
		System.out.println(s.bn.getSize());
		System.out.println(s.bn.getIq());
		System.out.println("=====================");
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getValves());
		System.out.println("=====================");
		s.hasbook(b1);
		s.hasmobile(m);

	}

}
