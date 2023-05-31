package Dynstack;

public class DynStack {

		Node top;
		
		public DynStack()
		{
			this.top = null ;
		}
		
		
		public void push(int v)
		{
			
			Node nn = new Node(v);
			
//			if(nn == null)
//				return;
//			
//			if(top == null)
			
			if(isEmpty()) {
				
				top = nn ;
				return;
			}
			
			nn.setPrev(top);	
			top = nn;
		}
		
		public boolean isEmpty()
		{
			if(top == null)
			
				return true;
				
				return false;
			
		}
		
		public void Display()
		{
			
			if(isEmpty()) {
				System.out.println("Stack is Empty");
			 return;
			}
			System.out.println("elements are");
			for(Node i=top; i!=null; i = i.getPrev()) {
				
				System.out.println(i.getData());
			}
			
			
		}
		
		
}



















