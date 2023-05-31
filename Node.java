package Dynstack;

public class Node {


	int data;
	Node prev;
	
		public Node(int v)
		{
			this.data = v ;
			this.prev = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
}
