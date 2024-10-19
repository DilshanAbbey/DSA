import java.util.LinkedList;
import java.util.Collection;

class CollectionPractical1{
	public CollectionPractical1()
	{
		Collection <Integer> c = new LinkedList();
		c.add(1);
		c.add(2);
		c.add(5);
		c.add(7);
		c.add(9);
		System.out.println(c);
		System.out.println("Is the specific element(2) available? " + c.contains(2));
		System.out.println("Removing the specific element!");
		c.remove(2);
		System.out.println(c);
		System.out.println("The size is : "+ c.size());
		System.out.println("Empty or not : "+ c.isEmpty());
	}
	
	public static void main(String[] args)
	{
		new CollectionPractical1();
	}
}