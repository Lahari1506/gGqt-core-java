package Threads;

class producer extends Thread{
	Queue a;
	public producer(Queue q) {
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
class consumer extends Thread{
	Queue b;
	public consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			b.consume();
		}	
	}
}
class Queue{
	int x;
	public void produce(int i) {
		x=i;
		System.out.println("producer has produced the data :"+x);
	}
	public void consume() {
		System.out.println("consumer has consumed the data :"+x);
	}
}
public class ProducerAndConsumer {

	public static void main(String[] args) {
		Queue q=new Queue();
		(new producer(q)).start();
		(new consumer(q)).start();
	}

}
