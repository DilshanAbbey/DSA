import java.util.HashSet;
import java.util.Set;

class Ex{
	public Ex()
	{
		Set<Integer> set = new HashSet();
		set.add(5);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(2);
		set.remove(3);
		System.out.println(set);
	}
	
	public static void main(String[] args)
	{
		new Ex();
	}
}