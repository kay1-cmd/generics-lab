import java.util.ArrayList;

public class myListTest {
	public static void main(String[] args) {
		
		
		ArrayList<Number> numList = new ArrayList<Number>();
		myList<Number> list = new myList<Number>(numList);
		
	
		Integer five = 5;
		Double twenty = 21.3;
		
		list.add(five);
		list.add(twenty);
		
		System.out.println( "The smallest number in the list is as follows: ");
		System.out.println(list.smallest());
		System.out.println("The largest number in the list is as follows: ");
		System.out.println(list.largest());

		
		
	}
}
