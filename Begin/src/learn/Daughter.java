package learn;

public class Daughter extends Father{
	public void standrad () {
		System.out.println("fifth");
	}
	public static void main(String[]args) {
		Daughter obj = new Daughter();
		obj.property();
		obj.standrad();
		
		
	}

}
