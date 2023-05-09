package ak.learn.dsa.linkedlist.singlylinkedlist;

public class LinkedList {
	private Node head, tail;
	private long size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		size = 0;
	}

	public void addFirst(Node n) {
		n.setNext(head);// point new node to the head of the linked list
		setHead(n);// update the head of the linked list to become the new node
		// size == 0 -> means that we're adding our first node so head is also tail
		if (size == 0) {
			setTail(n);// this happens only when head and tail are null at first insertion
		}
		size++;
	}

	public void addLast(Node n) {
		n.setNext(null);// point new node to null
		// size == 0 -> means that we're adding out first node so tail is also head
		if (size == 0) {
			setHead(n);
		}
		// size != 0 -> means tail is not null and we should
		else {
			tail.setNext(n);// point the tail of the linkedlist to the new node
		}
		setTail(n);// update the tail of the linked list to become the new node
		size++;
	}
	
	public void addAt(int index, Node n) {
		if (index == 0) {
			addFirst(n);
		} else if (index == size - 1) {
			addLast(n);
		} else if (index > 0 && index < size - 1) {
			Node next = head;
			int i = 0;
			while (next != null) {
				if (i == index - 1) {
					n.setNext(next.getNext());
					next.setNext(n);
					break;
				}
				next = next.getNext();
				i++;
			}
		} else {
			// do nothing
		}
	}

	public void removeFirst() {
		// first case if list has more than 1 node
		if (size > 1) {
			Node oldHead = head;// get old head
			setHead(head.getNext());// set head of list to old head's next node
			oldHead.setNext(null);// detach the old head from the list
			size--;// update size
		}
		// second case if we're deleting the last element
		else if (size == 1) {
			setHead(null);// head is null
			setTail(null);// tail is null
			size--;// update size
		} else {
			// size == 0 and we do nothing but you can make it throw an error or something
		}

	}

	public void removeLast() {
		// it can be implemented but operating time will be a lot
		// simply go while until next.next == null so 'next' is the last and it should
		// be removed
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node next = head;
		while (next != null) {
			builder.append(next.getElement() + " -> ");
			next = next.getNext();
		}
		return builder.toString();
	}

}
