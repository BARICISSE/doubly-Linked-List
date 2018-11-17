import java.util.*;
public class DoublyLinkedList {
		
		 Node dummyHead;
		 Node dummyTail;
		 int size;
		public DoublyLinkedList(){
			
			dummyHead = new Node();
			dummyTail = new Node();
			dummyHead.next = dummyTail;
			dummyHead.pre = null;
			dummyTail.next = null;
			dummyTail.pre = dummyHead;
			size = 0;
			
		}
		
		public void addFirst(Node node) {
			
			node.next = dummyHead.next;
			dummyTail.pre = node;
			node.pre = dummyHead;
			dummyHead.next = node;
			
			/**
			 * 
			 *  node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
			 */
			size++;
			
		}
		public void addLast(Node node) {
			node.next = dummyTail;
			node.pre = dummyTail.pre;
			dummyTail.pre.next = node;
			dummyTail.pre = node;
			size++;
		}
		public void removeNode(int key) {
			Node temp = dummyHead.next;
			while(temp.list.get(0)!=key) {
				temp = temp.next;
			}
			temp.pre.next = temp.next;
			temp.next.pre = temp.pre;
			size--;
		}
		
		public List<Integer> get(int i){
			List<List<Integer>> list = new ArrayList<>();
			
			Node temp = i<size/2 ? dummyHead.next : dummyTail.pre;
			 if(i<size/2) {
				
				for(int k=0; k<i; k++) {
					temp = temp.next;	
				}
			}
			 else if(i>=size/2 && i<size){
				
				 for(int k = size-1; k>size-i-1; k--) {
						temp = temp.next;
					}
			
			}
			list.add(temp.list);
			
			return list.get(0);
			
		}
		public List<List<Integer>> printToConsole() {
			List<List<Integer>> myList = new ArrayList<>();
			List<Integer> list = new ArrayList<>();
			Node temp = dummyHead.next;
			while(temp!=dummyTail) {
					myList.add(temp.list);
					temp = temp.next;
			}
			
			
			return myList;
		}
		
}
