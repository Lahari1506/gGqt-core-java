package collections;
import java.util.LinkedList;
public class LinkedListCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList l=new LinkedList();
         l.add("BMW");
         l.add("ford");
         l.add(23);
         l.add(678);
         l.add(456.45f);
         l.add('f');
         l.add(true);
         System.out.println(l);
         l.addFirst(45);
         System.out.println(l);
         l.addLast("false");
         System.out.println(l);
         l.removeFirst();
         System.out.println(l);
         l.removeLast();
         System.out.println(l);
         Object object = l.get(5);
 		System.out.println(object);
 		object=l.getLast();
 		System.out.println(object);
 		object=l.getFirst();
 		System.out.println(object);
 		
 		LinkedList l1=new LinkedList();
 		l1.add(34);
 		l1.add("KIA");
 		l1.add("Nano");
 		l1.add("volvo");
 		System.out.println(l1);
 		l1.add(2,111);
 		l1.set(3, 3333);
 	//	System.out.println(l1);
 		l.addAll(l1);
 		System.out.println(l);
 		l.addFirst(2223);
 		l.addLast(8888);

		boolean res1 = l.contains(100);
		System.out.println(res1);
		res1 = l.containsAll(l1);
		System.out.println(res1);

		Object object1 = l.get(5);
		System.out.println(object1);
		
		int size = l.size();
		System.out.println(size);
		System.out.println(l.getClass());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		int hashCode = l.hashCode();
		System.out.println(hashCode);
		
		int indexOf = l.indexOf("KIA");
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf("Aishwarya");
		System.out.println(lastIndexOf);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
//		l1.clear();
//		empty = l1.isEmpty();
//		System.out.println(empty);
		
		Object remove = l.remove(0);
		System.out.println(remove);
		System.out.println(l);
		
		Object rm = 2222;
		remove = l.remove(rm);
		System.out.println(remove);
		System.out.println(l);
		
		
		boolean removeAll = l.removeAll(l1);
		System.out.println(removeAll);
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println(l);
 		
 		
	}

}