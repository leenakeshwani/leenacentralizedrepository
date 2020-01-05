package Assignment1;

public class Assignmentday_2{
	public int add (int a , int b)
	{
		int c=a+b;
		return c;
			}
		public int sub (int a1, int b1)
		{
		int c=a1-b1;
			return c;
					}
			public int mul (int a2, int b2)
			{
				int c = a2*b2;
				return c;
							}
	public void div (int a3 , int b3) 
	{
		int c =a3/b3;
	System.out.println("final result:" + c);	
			}
	public static void main(String[] args) {
		Assignmentday_2 result=new Assignmentday_2();
		int sum = result.add(10,2);
		int sum1 = result.add(sum,2);
		int sum2 = result.sub(sum1,2);
		int sum3 = result.mul(sum2,2);
		System.out.println("Final result of equation :(((((10+2)+2)-2)*2)/2)");	
		result.div(sum3,2);
				
		
	}
}
