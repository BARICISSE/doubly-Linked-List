import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list  = new ArrayList<>();
		
		//Node node = new Node(2,2);
		//Node tail = new Node(1, 1);
		//DoublyLinkedList linkedlist2  = new DoublyLinkedList(tail);
		
		DoublyLinkedList linkedlist  = new DoublyLinkedList();
		Node node = new Node(2,2);
		linkedlist.addLast(node);
		linkedlist.addLast(new Node(3, 3));
		linkedlist.addLast(new Node(4, 4));
		linkedlist.addFirst(new Node(5, 5));
		
		
		System.out.println(linkedlist.printToConsole() + " " + linkedlist.size);
		
		//linkedlist.removeNode(5);
		
		System.out.println(linkedlist.printToConsole() + " " + linkedlist.size);
		//Node tail = new Node(1, 1);
		
		System.out.print(linkedlist.get(0));
		
		
		
	}

}
