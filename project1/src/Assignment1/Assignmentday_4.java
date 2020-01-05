package Assignment1;

public class Assignmentday_4
{ 
	public void method1()
	{
		this.method4();
		System.out.println("input default method ");
	}
			public void method2()
		{ this.method1();
		
				System.out.println("input first parametrized method ");
		}
			public void method3()
		{ this.method2();
		
						System.out.println("input second parametrized method ");
						
			}
		public void method4()
		{ 
		System.out.println("input third parametrized method ");
		
		}
		public static void main(String[] args) {
			Assignmentday_4 leena= new Assignmentday_4();
			leena.method3();
			}
}
