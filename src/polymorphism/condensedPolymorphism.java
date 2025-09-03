package polymorphism;

class plane1{
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
class cargoplane1 extends plane1{
	//@ override
	void fly() {
		System.out.println("the cargoplane flys on low range");
	}void carrygoods(){
		System.out.println("the cargoplane carry goods");
		System.out.println("=============================");
	}
}
class passangerplane1 extends plane1{
	//@override
	void fly() {
		System.out.println("the passengerplane flys on medium range");
	}void carryhumans(){
		System.out.println("the passenger plane carry humans");
		System.out.println("=============================");
	}
}

class fighterplane1 extends plane1{
	//@override
	void fly() {
		System.out.println("the fighterplane flys on high range");
	}void carryweapons(){
		System.out.println("the fighter plane carry weapons ");
		System.out.println("=============================");
	}
}
class Airport {
	void permit(plane1 ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}

public class condensedPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane1 cp=new cargoplane1();
		passangerplane1 pp=new passangerplane1();
		fighterplane1 fp=new fighterplane1();
		Airport ap=new Airport();
		ap.permit(cp);
		cp.carrygoods();
		
		ap.permit(pp);
		pp.carryhumans();
		
		ap.permit(fp);
		fp.carryweapons();
	}

}

