package learn;


public class Hdfc implements Banking {
	public void savings() {
		System.out.println("available");
	}
	public void status() {
		System.out.println("active");
	}
	public void name() {
		System.out.println("username");
	}
public static void main(String[]args) {
	Hdfc obj= new Hdfc();
	obj.savings();
	obj.status();
	obj.name();
	
}
}
