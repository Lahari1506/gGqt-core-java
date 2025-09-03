 
class Producer extends Thread{
			Queue a;
			public Producer(Queue q) {
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
			class Consumer extends Thread{
				Queue b;
				public Consumer(Queue q) {
					b=q;
				}
				@Override
				public void run() {
					while(true) {
						b.consume();
					}
				}
			}
			class Queue{
				int x;
				boolean value_inside_x=false;
				synchronized public void produce(int i) {
					try {
						if(value_inside_x==false) {
							x=i;
					        System.out.println("Producer has produced the data :" +x);
					        value_inside_x=true;
					        notify();
					}
						else {
							wait();
						}  
				}
					catch(java.lang.Exception e) {
						e.printStackTrace();
					}
				}
				synchronized public void consume() {
					try {
						if(value_inside_x==true) {
							System.out.println("Consumer has consumed the data :" +x);
							value_inside_x=false;
							notify();
						}
						else {
							wait();
						}
					}
					catch(java.lang.Exception e) {
						e.printStackTrace();
					}
					
				}
			}
			public class ProducerAndConsumer3 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		             Queue q=new Queue();
		             (new Producer(q)).start();
		             (new Consumer(q)).start();
			}

		}