package learn;

public class Union extends Bank {
	public void status() {
		System.out.println("active");
	}
	public void savings() {
		System.out.println("amount");
	}
	public static void main(String []args) {
	
		Union obj= new Union();
		obj.savings();
		obj.salary();
		obj.status();

	}

}
