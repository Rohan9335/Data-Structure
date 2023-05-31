package Statck;

public class Static_Stack {
		
		int data[];
		int top ;
	
		public Static_Stack(int size)
		{
			data =new int[size];
			top = -1;
			
		}
		
		public void push(int v)
		{
			if(isFull())
			{
				System.out.println("Stack is full");
				return ;
			}
			data [++top] = v;
		}
		
		
		
		
		public void Display()
		{
			if(isFull())
			{
				System.out.println("Stackis full");
			}
			
			System.out.println("Stack elements are ");
				
			for(int i=top; i>=0; i--)
			{
				System.out.println(data[i]);
			}
			
		}
		
		public boolean isFull()
		{
			if(top == data.length-1)
				return true;
			return false;
		}
		
		public boolean isEmpty()
		{
			if(top == -1)
				return true;
			return false;
		}
		
		public int pop()
		{
			if(isEmpty()) {
				System.out.println("Stack is Empty");
				return -1;
			}
			return data[top--];
		}
		
		public int peak()
		{
			if(isEmpty())
			{
				System.out.println("Stack underflow");
				return -1;	
			}
			return data [top];
		}
		
	
		
}
