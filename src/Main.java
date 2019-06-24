import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		DLinkedList<String> list = new DLinkedList<String>();
		list.addLast("a");
		list.addLast("n");
		list.addLast("c");
		list.addLast("d");
		list.add(4,"z");
		System.out.println("first: "+list.getFirst());
		System.out.println("last: "+list.getLast());
		System.out.println("4: "+list.get(4));
		System.out.println(Arrays.toString(list.toArray()));
	}
}