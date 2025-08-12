 package encapsulation;

class Dog{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	void setData(String name,String color,String breed,int age, int cost) {
		this.name=name;
		this.color=color;// this  this keyword is used to rectify the error occured in previous one
		this.breed=breed;
		this.age=age;
		this.cost=cost;
	}
	void getData() {
		System.out.println("name = "+name);
		System.out.println("color = "+color);
		System.out.println("breed = "+breed);
		System.out.println("age = "+age);
		System.out.println("cost = "+cost);
	}
}
public class Program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.setData("rock", "red", "pug", 20, 30000);
		d.getData();
	}
}
