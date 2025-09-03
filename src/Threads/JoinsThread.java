package Threads;
class humans1 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"Has enteres the washroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is using the washroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+"Has exited the washroom");
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
public class JoinsThread {
	public static void main(String[] args) throws InterruptedException {
		humans1 h1=new humans1();
		h1.setName("Man");
		humans1 h2=new humans1();
		h2.setName("women");
		humans1 h3=new humans1();
		h3.setName("other");
		//h1.start();
		//h2.start();-
		//h3.start();
         
		h1.start();
		h1.join(5000);
		h2.start();
		h2.join(5000);
		h3.start();
		
	}
}
