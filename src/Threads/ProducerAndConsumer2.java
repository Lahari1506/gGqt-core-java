package Threads;

class producer1 extends Thread{
	Queue a;
	public producer1(Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.produce(i++);
		}
			
	}
}
class consumer1 extends Thread{
	Queue b;
	public consumer1(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume();
		}
			
	}
}
class Queue1{
	int x;
	boolean val_inside_x=false;
	synchronized public void produce(int i) {
		try {
			if(val_inside_x==false) {
		           x=i;
		           System.out.println("producer has produced the data :"+x);
		           val_inside_x=true;
		           notify();
	}else {
		wait();
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	synchronized public void consume() {
		try {
			if(val_inside_x==true) {
		System.out.println("consumer has consumed the data :"+x);
		val_inside_x=false;
		notify();
	}else {
		wait();
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public class ProducerAndConsumer2 {

	public static void main(String[] args) {
		Queue q=new Queue();
		(new producer(q)).start();
		(new consumer(q)).start();
		//producer p=new producer(q);
		//p.start();
		//consumer c=new consumer(q);
		//q.start();

	}

}
}