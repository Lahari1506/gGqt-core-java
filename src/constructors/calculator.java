package constructors;

class program{
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	float add(int a, float b) {
		return a+b;
	}
	double add(float a, double b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(double a, float b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	double add(int a, double b) {
		return a+b;
	}
	double add(double a, float b , int c) {
		return a+b+c;
	}
	double add(float a, double b , int c) {
		return a+b+c;
	}
	double add(float a, int b , double c) {
		return a+b+c;
	}
	double add(double a, double b , double c) {
		return a+b+c;

}
}
public class calculator {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		float m=10.33f, n=20.33f, o=30.33f;
		double p=100.333,q=200.333,r=300.333;
		
		program p1 =new program();
		System.out.println(p1.add(a, b));
		System.out.println(p1.add(a, p, m));
		System.out.println(p1.add(m, b));
		System.out.println(p1.add(a, n));
	
	}

}
