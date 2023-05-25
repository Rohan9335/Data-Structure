package Q;

public class StaticQueue {
	
	private int data[];
	private int rear , front ;
	
	public StaticQueue(int size)
	{
		data = new int[size];
		rear = front = -1 ;		
	}
	
	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	
	public void enqueue(int _data)
	{
		if(isFull()) {
			System.out.println("Queue is Full");
		    return;
		}
		
		if(rear == -1)
			front = 0 ;
		
		
		data[++rear]=_data;
		
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		int v = data[front++];
		
		return v;
	}
	
	
	public boolean isFull()
	{
		if(rear == data.length-1)
			return true;
		return false;
	}
	public boolean isEmpty()
	{
		if(rear == -1)
			return true;
		return false;
	}
	
	public void Display()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return;
		}
		
		for(int i=front; i<=rear; i++)
		{
			System.out.println(" "+data[i]);
		}
	}

}
