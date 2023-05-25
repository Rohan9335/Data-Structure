package DLL;

public class Main {

	public static void main(String[] args) {
		
		DoublyLL l = new DoublyLL();
		
		l.insertAtBeg();
		l.insertAtBeg();
		l.insertAtBeg();
 System.out.println("Added at beginning");
		l.Display();
		System.out.println("insert AT POS");
		l.insertAtPos(3);
		l.Display();
		
//		l.Search("rohan");
//		System.out.println("backward Display is");
//		l.BackwardDisplay();
//		l.insertAtLast();
//		l.insertAtLast();
//		System.out.println("inserted At last");
//		l.Display();
	}
	
}
