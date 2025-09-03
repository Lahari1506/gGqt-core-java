package Abstarction;

abstract class test{
	
	void land() {
		System.out.println("the plane lands");
		}
}
abstract class plane1{
abstract void takeoff() ;
abstract void fly();
void land() {
	System.out.println("landed");
}
}
class cargoplane1 extends plane1{
	@ Override
     void takeoff() {
		System.out.println("small runway");
	}
	//@ override
	void fly() {
		System.out.println("the cargoplane flys on low range");
	}void carrygoods(){
		System.out.println("the cargoplane carry goods");
		System.out.println("=============================");
	}
}
class passangerplane1 extends plane1{
	@ Override
    void takeoff() {
		System.out.println("medium runway");
	}
	//@override
	void fly() {
		System.out.println("the passengerplane flys on medium range");
	}void carryhumans(){
		System.out.println("the passenger plane carry humans");
		System.out.println("=============================");
	}
}

class fighterplane1 extends plane1{
	@ Override
    void takeoff() {
		System.out.println("large runway");
	}
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


public class PlaneAbstraction {

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
		
		plane1 p1=new plane1() {

			@Override
			void takeoff() {
				// TODO Auto-generated method stub
				System.out.println("takeoff");
				
			}

			@Override
			void fly() {
				// TODO Auto-generated method stub
				System.out.println("fly");
			}
		};
	}
		


}


