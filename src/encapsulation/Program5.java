

package encapsulation;
import java.util.Scanner;
class Dog3{
	// TODO Auto-generated method stub
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
Scanner sc=new Scanner(System.in);
void collectData() {
	System.out.println("enter name :");
	name=sc.nextLine();
	System.out.println("enter color :");
	color=sc.nextLine();
	System.out.println("enter breed :");
	breed=sc.nextLine();
	System.out.println("enter age :");
	age=sc.nextInt();
	System.out.println("enter cost :");
	cost=sc.nextInt();
}
public String getName() {
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
public class Program5 {

	public static void main(String[] args) {
		Dog3 d=new Dog3();
		d.collectData();
		//d.setName("kiran");
		//d.setColor("blue");
		//d.setBreed("pug");
		//d.setCost(3000);
		//d.setAge(21);
         //d.setSc(" ");
        System.out.println("Name :" +d.getName());
		System.out.println("Breed :" +d.getBreed());
		System.out.println("color :" +d.getColor());
		System.out.println("cost :" +d.getCost());
		System.out.println("age :" +d.getAge());
	}
}