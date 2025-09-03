package Threads;
class humans extends Thread{
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
public class Threads4 {
	public static void main(String[] args) {
		humans h1=new humans();
		h1.setName("Man");
		humans h2=new humans();
		h2.setName("women");
		humans h3=new humans();
		h3.setName("other");
		h1.start();
		h2.start();
		h3.start();
         
	}
}
