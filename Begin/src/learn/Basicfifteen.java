package learn;
import java.util.Scanner;
public class Basicfifteen {
	public static void main(String[]args) {
	Scanner obj= new Scanner (System.in);
		System.out.println("enter ur details");
		String name=obj.nextLine();
		System.out.println("user name:" + name);
		int age =obj.nextInt();
		System.out.println("user age :" + age);
		long salary=obj.nextLong();
		System.out.println("user salary:"+ salary);
		
	
	}

}
