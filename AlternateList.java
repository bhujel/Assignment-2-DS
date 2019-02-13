package practiceQs;

import java.util.Scanner;

class Node4{
	
	int data ;
	Node4 next , prev;
	
	Node4(int data ){
		
		this.data = data ;
	}
}

class linkList{
	
	Node4 head , tail ;
	
	public void insertEnd( int x ) {
		
		Node4 node = new Node4(x);
		
		if( head == null )
			tail = head = node;
		else {
				tail.next = node;
				node.prev = tail;
				tail = node ;
			}
		}
	public void transverse() {
	if( head == null ) 
		System.out.println("list is empty");
	else {
		
		Node4 curr = head ;
		
		while( curr != null ) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			}
		
		System.out.println();
		}
	}
	public void deleteAlt() {
		
		if( head == null || head.next == null )
			return ;
		
		Node4 curr = head , ptr = head.next ;
		
		while( curr != null && curr.next != null ) {
			
			ptr = curr.next;
			
			if( ptr.next != null )
			ptr.next.prev = curr ;
			
			curr.next = curr.next.next;
			
			
			ptr.next = ptr.prev = null;
			
			curr = curr.next;
		}
	}
}

public class AlternateList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of element");
		
		int n = sc.nextInt();
		
		linkList l = new linkList();
		
		System.out.println("enter elements");
		
		for ( int i = 0 ; i < n ; i++ ) {
			
			int x = sc.nextInt();
			
			l.insertEnd(x);
		}
		
		l.transverse();
		
		l.deleteAlt();
		
		l.transverse();
	}

}
