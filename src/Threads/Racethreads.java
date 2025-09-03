package Threads;
class MicrosoftWord extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("Checking")){
				checking();
	}
		else {
			saving();
		}
}

public void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Typing in Progress....");
				Thread.sleep(2000);
			}
		}
		catch(java.lang.Exception e) {
			e.printStackTrace();
		}
		
	}
public void checking() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("Checking in Progress....");
			Thread.sleep(2000);
		}
	}
	catch(java.lang.Exception e) {
		e.printStackTrace();
	}
	
}
public void saving() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("Saving in Progress....");
			Thread.sleep(2000);
		}
	}
	catch(java.lang.Exception e) {
		e.printStackTrace();
	}
	
}
	
}
	

public class Racethreads {
	public static void main(String[] args) {
		MicrosoftWord m1=new MicrosoftWord();
		m1.setName("typing");
		MicrosoftWord m2=new MicrosoftWord();
		m2.setName("Checking");
		MicrosoftWord m3=new MicrosoftWord();
		m3.setName("Saving");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		m1.start();
		m2.start();
		m3.start();
         
	}

}