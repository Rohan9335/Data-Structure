package Q;

public class Main {

	public static void main(String[] args) {
		
		StaticQueue q = new StaticQueue(5) ;
		
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		System.out.println("Queue Ellements are");
		q.Display();
		
		int v = q.dequeue();
		v = q.dequeue();
		if(v != -1)		
		System.out.println("deleted element = "+v);
		
	}

}
