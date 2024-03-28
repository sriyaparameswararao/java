package learn;
import java.util.ArrayList;
public class Advone {
	public static void main(String[]args) {
		ArrayList<Integer> obj =new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(7);
		obj.remove(1);
		obj.add(77);
		obj.set(1,20);
		
		
		System.out.println(obj.get(2));
		System.out.println(obj);
		 
		
		
	}

}
