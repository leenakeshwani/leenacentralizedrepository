package Assignment1;

public class Assignmentday_3
{
	public Assignmentday_3()
	{
		this(1,2,3);
					System.out.println("default parameterized");
	}
		public Assignmentday_3(int leena)
		{   this ();
		System.out.println("first parametrized constructor");
	}
			public Assignmentday_3 (int leena, int teena)
		{ this (11);
		System.out.println("second parameterized constructor");
		
	}
			
				public Assignmentday_3 (int leena,int teena,int meena)
	
		{
		System.out.println("third parametrized constructor");
	}
				
				public static void main(String[] args) {
					Assignmentday_3 output=new Assignmentday_3(1,2);
				}
										
				
}


