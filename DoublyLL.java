package DLL;

import java.util.Scanner;

public class DoublyLL {
	
		
		Node head , tail ;
		Scanner sc ;
		
			public DoublyLL() {
				this.head = null;
				this.tail = null;
				sc = new Scanner(System.in);
			}
			
			
		public boolean insertAtBeg()
		{
			System.out.println("Enter a roll number, and Student name");
			
			Student s = new Student(sc.nextInt(),sc.next());
			
			Node nn = new Node(s);
			
			if(nn == null)
				return false;
			
			if (head == null) {
				head = tail = nn ;
			}
			else {
				nn.setNext(head);
				head.setPrev(nn);
				head = nn ;
			}
			return true ; 
		
		}
		 public boolean insertAtLast() {
			 
			 System.out.println("enter roll no and student name");
			 
			 Student s = new Student(sc.nextInt(),sc.next());
			 
			 Node nn = new Node(s);
			 
			 if(nn == null)
				 return false;
			 
			 if(head == null) {
				 head = tail =nn;
			 }
  		 else {
				 
//				 Node temp = head;
//				 
//				 while(temp.getNext().getNext()!=tail ) {
//					 temp = temp.getNext();
//				 }
//				 nn.setPrev(temp.getNext());
//				 temp.getNext().setNext(nn);;
//				 nn.setNext(head);
//				 tail = nn ;
  			  nn.setPrev(tail);
  			  tail.setNext(nn);
  			  tail = nn ;
  			 
  			 
			 }
			 return true ;
			 
		 }
		 
		 public void Search(String v) {
			 
			 Node temp = head;
			 int count = 0 ;
			 
			 while(temp != null) {
				 count++;
				 if(v.equals(temp.getData().getName())) {
					 System.out.println("name  "+v+" found at  "+count);
				 }
				 
				 temp = temp.getNext();
			 }
		 }
		 
		 public boolean insertAtPos(int pos) {
			 
			 System.out.println("enter Roll no. And Name");
			 
			 Student s = new Student(sc.nextInt(),sc.next());
			 
			Node nn = new Node(s);
			
			if(pos == 1)
				insertAtBeg();
			
			if(pos < 1) {
				System.out.println("Invalid position");
				return false;
			}
			
			if(nn == null)
				return false;
			
	    if(head == null) {
				head = tail = nn ;
			}
		else {
			Node temp = head;
			int count =1 ;
			
		    while(temp != null && count < pos-1 ) { 
			   count++;
			   temp = temp.getNext();
	         }
		      if(temp!=null) {
		    	nn.setNext(temp.getNext());
		    	nn.setPrev(temp);
		    	temp.setNext(nn);
		      }
		      else {
		    	  System.out.println("invalid position");
		      }
		    }
	          return true;
		 }
		 
		 
		
		public void Display() {
			
			Node temp = head;
			
			while(temp != null) {
				
				System.out.print(temp.getData());
				temp = temp.getNext();
			}
		}
		
		public void BackwardDisplay() {
			Node temp = tail;
			while(temp!= null) {
				System.out.println(temp.getData());
				temp = temp.getPrev();
			}
			
		}
}
