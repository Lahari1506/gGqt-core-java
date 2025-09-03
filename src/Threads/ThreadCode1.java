package Threads;
public class ThreadCode1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t1=new Thread();
		System.out.println(t1);
		t1.setName("Samantha");
		t1.setPriority(2);
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());

	}

}
// output: [#1 (thread numbber) thread name priority method
// thread priority is from 1 -10
// thread default vale of priority is 5