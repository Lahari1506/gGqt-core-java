package ExceptionHandling;
class MicrosoftWord1 extends Thread{
	public void run() {
			if(Thread.currentThread().getName().equals("typing")) {
				typing();
			}
			else if(Thread.currentThread().getName().equals("checking")) {
				checking();
			}
			else {
				saving();
			}
	}
			
		
// primary function
	private void typing() {
		try{for(int i=0;i<=5;i++) {
			System.out.println("typing in progress");
			Thread.sleep(2000);
	}
}catch(Exception e) {
		e.printStackTrace();
		
	}
}
// secondary function
	private void checking() {
		try{for(int i=0;i<=5;i++) {
				System.out.println("Checking in progress");
				Thread.sleep(2000);
		}
	}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

	void saving() {
		try{for(int i=0;i<=5;i++) {
			System.out.println("saving in progress");
			Thread.sleep(2000);
	}
}catch(Exception e) {
		e.printStackTrace();
		
	}
}
}

public class DaemonEthreading {

	public static void main(String[] args) {
		MicrosoftWord1 ms1=new MicrosoftWord1();
		ms1.setName("typing");
		MicrosoftWord1 ms2=new MicrosoftWord1();
		ms2.setName("checking");
		ms2.setPriority(8);
		MicrosoftWord1 ms3=new MicrosoftWord1();
		ms3.setName("saving");
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		ms1.start();
		ms2.start();
		ms3.start();

	}

}
