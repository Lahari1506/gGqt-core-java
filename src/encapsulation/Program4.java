package encapsulation;
class Dog1{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	public String getName() {// these are the specific stters and getters
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog1 d=new Dog1();
d.setName("kiran");
d.setColor("blue");
d.setBreed("pug");
d.setCost(3000);
d.setAge(21);

System.out.println(d.getName());
System.out.println(d.getBreed());
System.out.println(d.getColor());
System.out.println(d.getCost());
System.out.println(d.getAge());

	}

}
