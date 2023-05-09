package ak.learn.dsa.linkedlist.singlylinkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		Node n1 = new Node("ahmad", null);
		Node n2 = new Node("omar", null);
		Node n3 = new Node("sami", null);
		Node n4 = new Node("walid", null);
		ls.addFirst(n1);// ahmad
		ls.addFirst(n2);// omar-ahmad
		ls.addLast(n3);// omar-ahmad-sami
		ls.addFirst(n4);// walid-omar-ahmad-sami
		System.out.println("All added: " + ls);
		for (int i = 0; i < 5; i++) {
			ls.removeFirst();
			System.out.println(i + ": " + ls);
		}
		System.out.println("All removed: " + ls);
		// trying atAt
		ls.addFirst(n1);// ahmad
		ls.addFirst(n2);// omar-ahmad
		ls.addLast(n3);// omar-ahmad-sami
		ls.addFirst(n4);// walid-omar-ahmad-sami
		System.out.println("Before: " + ls);
		Node n5 = new Node("hi", null);
		ls.addAt(2, n5);
		System.out.println("After: " + ls);
	}
}
