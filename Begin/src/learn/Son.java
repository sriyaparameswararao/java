package learn;

public class Son extends Father {
	public void education(){
		System.out.println("final year");
	}
	public static void main(String []args) {
		Son obj=new Son();
		obj.property();
		obj.education();
	}

}
