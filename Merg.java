package practiceQs;

import java.util.*;

class Node5{
	
	int data ;
	Node5 next ;
	
	Node5( int data ){
		
		this.data = data;
	}
}

class mergList{
	
	Node5 head;
	
	public void insertEnd(int x ) {
		
		Node5 node = new Node5(x);
		
		if( head == null ) {
			
			head = node ;
		
		}
		else {
			
			Node5 temp = head ;
			
			while( temp.next != null )
				temp = temp.next ;
			
			temp.next = node ;
	
		}
	}
	public void display() {
		
		Node5 curr = head;
		
		while( curr != null ) {
			
			System.out.print(curr.data+" ");
			
			curr = curr.next;
		}
		System.out.println();
	}
	public void merg( mergList l1 , mergList l2 , mergList l3 ) {
		
		Node5 n1 = l1.head ;
		Node5 n2 = l2.head ;
		
		while( n1 != null && n2 != null ) {
			
			if( n1.data < n2.data ) {
				
				l3.insertEnd(n1.data);
				n1 = n1.next;
				
			}
			else if ( n2.data < n1.data ) {
				
				l3.insertEnd(n2.data);
				n2 = n2.next;
				
			}else {
				
				l3.insertEnd(n1.data );
				
				l3.insertEnd(n2.data);
				
				n1 = n1.next;
				n2 = n2.next;
			}
		}
		while( n1 != null ) {
			
			l3.insertEnd(n1.data);
			n1 = n1.next;
		}
		while( n2 != null ) {
			
			l3.insertEnd(n2.data);
			n2 = n2.next;
		}
	}
}
public class Merg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		mergList l1 = new mergList();
		
		mergList l2 = new mergList();
		
		mergList l3 = new mergList();
		
		System.out.println("Enter no of elements");
		
		int n1 = sc.nextInt();
		
		for ( int i = 0 ; i < n1 ; i++ ) {
			
			int x = sc.nextInt();
			
		l1.insertEnd(x);
		
		}
		
		System.out.println("Enter no of elements in l2");
		
		int n2 = sc.nextInt();
		
		
		for ( int i = 0 ; i < n2 ; i++ ) {
			
			int x = sc.nextInt();
			
			l2.insertEnd(x);
		
		}
		
		System.out.println("Elements in l1 :");
		
		l1.display();
		
		System.out.println("Elements in l2 :");
		
		l2.display();
		
		l3.merg(l1, l2, l3);
		
		System.out.println("Elements after merged :");
		
		l3.display();
	}

}
