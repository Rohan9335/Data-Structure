package Link;

public class LinkedList {

		Node head , tail  ;
		
		public LinkedList() {
			this.head = null;
			this.tail = null;
			
		}

		public Node getHead() {
			return head;
		}

		public void setHead(Node head) {
			this.head = head;
		}

		public Node getTail() {
			return tail;
		}

		public void setTail(Node tail) {
			this.tail = tail;
		}
		
		
	public boolean insertatBeg(int v) {
		
		Node nn = new Node(v);
		
		if(nn == null) {
			return false;
		}
		if(head == null) {
			head = tail = nn ;
		}
		else {
			
			nn.setNext(head.getNext());
			head.setNext(nn);
			
		}
		return true ;
	}	
		
		
		
		public void Display() {
			
			Node temp = head;
			
			while(temp.getNext() != head ) {
				
				System.out.print(" "+temp.getData());
				temp = temp.getNext();
			}
			temp.getData();
			System.out.println();
		}
	}
		
		
		

