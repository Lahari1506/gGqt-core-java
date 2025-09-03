package polymorphism;

class plane{
	void takeoff() {
		System.out.println("the plane takeoff");
	}
	void fly(){
		System.out.println("the plane flys");
	}
	void land() {
		System.out.println("the plane lands");
		}
}
class cargoplane extends plane{
	//@ override
	void fly() {
		System.out.println("the cargoplane flys on low range");
	}void carrygoods(){
		System.out.println("the cargoplane carry goods");
		System.out.println("=============================");
	}
}
class passangerplane extends plane{
	//@override
	void fly() {
		System.out.println("the passengerplane flys on medium range");
	}void carryhumans(){
		System.out.println("the passenger plane carry humans");
		System.out.println("=============================");
	}
}
class fighterplane extends plane{
	//@override
	void fly() {
		System.out.println("the fighterplane flys on high range");
	}void carryweapons(){
		System.out.println("the fighter plane carry weapons ");
		System.out.println("=============================");
	}
}

public class planePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane cp=new cargoplane();
		passangerplane pp=new passangerplane();
		fighterplane fp=new fighterplane();
		
		plane ref;
		ref = cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.carrygoods();
		
		ref =pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.carryhumans();
		
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		fp.carryweapons();
	}

}
