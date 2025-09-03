package Threads;
class warrior extends Thread{
	String r1="AK-1";
	String r2="9mm";
	String r3 ="SMG";
	@Override
	public void run() {
	if(Thread.currentThread().getName().equals("karthi")) {
		karthiAcq();
	}else {
		maheshAcq();
	}
}
	private void karthiAcq() {
		try {
			Synchronized(r1);{
				System.out.println("karthi has aquired : "+ r1);
				Thread.sleep(4000);
				Synchronized(r2);{
					System.out.println("karthi has aquired : "+ r2);
					Thread.sleep(4000);	
					Synchronized(r3);{
						System.out.println("karthi has aquired : "+ r3);
						Thread.sleep(4000);	
				}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void Synchronized(String r12) {
		// TODO Auto-generated method stub
		
	}
	private void maheshAcq() {
		try {
			Synchronized(r1);{
				System.out.println("karthi has aquired : "+ r1);
				Thread.sleep(4000);
				Synchronized(r2);{
					System.out.println("karthi has aquired : "+ r2);
					Thread.sleep(4000);	
					Synchronized(r3);{
						System.out.println("karthi has aquired : "+ r3);
						Thread.sleep(4000);	
				}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	try {
		Synchronized(r1);{
			System.out.println("karthi has aquired : "+ r1);
			Thread.sleep(4000);
			Synchronized(r2);{
				System.out.println("karthi has aquired : "+ r2);
				Thread.sleep(4000);	
				Synchronized(r3);{
					System.out.println("karthi has aquired : "+ r3);
					Thread.sleep(4000);	
			}
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
public class Deadlock {
	public static void name() {
		
	}
}
