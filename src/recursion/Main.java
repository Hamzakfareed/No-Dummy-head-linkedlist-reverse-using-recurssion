package recursion;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		System.out.println(list.toReverseString());
		System.out.println(list.toString());
	}
}
