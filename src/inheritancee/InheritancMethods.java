package inheritancee;
class plane{
	void takeoff() {
		System.out.println("the plane takeoff");
	}
	void fly(){
		System.out.println("the plane flys");
	}
	void land() {
		System.out.println("the plane lands");
		//System.out.println("=============================");
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
public class InheritancMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane cp=new cargoplane();
		passangerplane pp=new passangerplane();
		fighterplane fp=new fighterplane();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carrygoods();
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryhumans();
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryweapons();

	}

}
