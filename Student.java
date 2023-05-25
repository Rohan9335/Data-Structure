package DLL;

public class Student {
		
		private int roll ;
		private String name ;
		
		
		public Student() {
			roll = 1 ;
			name = "Rohan";
		}
		
		public Student (int r , String n) {
			
			roll = r;
			name = n;
		}
		
		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String toString() {
			
			return "roll no=  "+roll+"  name=  "+name+"\n"  ;
		}
		
		
}
