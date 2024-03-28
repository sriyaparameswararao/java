package learn;

public class Newone {
	public void name(String name) {
		System.out.println(name);
		
	}
	public void name(int age) {
		System.out.println(age);
	}
	public void name(long rollnumber) {
		System.out.println(rollnumber);
	}
	public void name(float attendance ) {
		System.out.println(attendance);
	}
		
	public static void main (String []args) {
		Newone obj= new Newone();
		obj.name("siri");
		obj.name(20);
		obj.name(211420106251l);
		obj.name(29.2f);
	}
		
		
}
