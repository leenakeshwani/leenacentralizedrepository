package Assignment1;

public class student {

	int age;
	int roll_no;
	public void display() {
		System.out.println("welcome to all");
			
	}
	public void display1() 
	{
		System.out.println("automation is in demand");
		}
	public static void main(String[] args) {
		student leena=new student();
		leena.age=16;
		leena.roll_no=1;
		leena.display();
		leena.display1();
		System.out.println(leena.age);
		System.out.println(leena.roll_no);
		
	}
		
}
