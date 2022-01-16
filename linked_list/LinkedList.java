package linked_list;

class Node {
	public int data;
	public Node next;
	
	public void printData()
	{
		System.out.println(data+">>");
	}
}

class SinglyLinkedlist {
	public Node head;
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void insertFirstElement(int d) {
		Node n = new Node();
		
		n.data=d;
		n.next=head;
		head=n;
	}	
	
	public void printElements(){
		Node cur = head;
		while(cur!=null) {
			cur.printData();	
			cur=cur.next;
		}
	}
	
	public void insertLast( int d){
		Node n = new Node();
		
		n.data=d;
		n.next=null;
		if(head==null){
			head= n;
		}
		else{
			Node curr = head;
			while(curr.next!=null){
				curr = curr.next;
			}
			curr.next=n;
		}
	}
}

public class LinkedList {
	public static void main(String args[]) {
		SinglyLinkedlist sl = new SinglyLinkedlist();
		sl.insertFirstElement(10);
		sl.insertFirstElement(20);
		sl.insertFirstElement(30);
		
		sl.printElements();
		System.out.println("========");
		sl.insertLast(5);
		
		sl.printElements();
	}
}
