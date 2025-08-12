package encapsulation;

class lion{
	private String name;
	private String color;
	private String country;
	private int age;
	
	void setData1() {
		name="kiran";
		color="yellow";
		country="india";
		age=9;	
	}
	void getData() {
		System.out.println("name = "+name);
		System.out.println("color = "+color);
		System.out.println("country = "+country);
		System.out.println("age = "+age);
	}
	void setData2(String a,String b,String c,int d) {//generic setters and getters
		name=a;
		color=b;
		country=c;
		age=d;
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion l=new lion();
	//l.name="hari";//private members cannot be accessed outside the class
	//	l.age=90;//private members cannot be accessed outside the class
		l.setData1();
		l.getData();
	    System.out.println("===========================");
		l.setData2("hari","white","afriaca",10);
		l.getData();
	}
}
