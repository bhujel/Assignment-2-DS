package practiceQs;

import java.util.*;

class iNode{
	
	int data ;
	iNode next ;
	
	iNode( int data ){
		
		this.data = data;
		
	}
	
}

class instLink{
	
	iNode head , tail ;
	
	public void insertEnd(int x ) {
		
		iNode node = new iNode(x);
		
		if( head == null ) {
			
			head = node ;
		
			tail = node ;	
		}
		else {
			
			iNode temp = head ;
			
			while( temp.next != null )
				temp = temp.next ;
			
			temp.next = node ;
			tail = node ;
		}
	}
	public void display() {
		
		iNode curr = head;
		
		while( curr != null ) {
			
			System.out.print(curr.data+" ");
			
			curr = curr.next;
		}
		System.out.println();
	}
	public void interst( instLink l1 , instLink l2 , instLink l3 ) {
		
		iNode n1 = l1.head;
		iNode n2 = l2.head;
		
		while( n1 != null && n2 != null ) {
			
			if( n1.data == n2.data ) {
				
				l3.insertEnd(n1.data);
				
				n1 = n1.next ;
				n2 = n2.next;
				
			}
			else if ( n1.data < n2.data ) 
				n1 = n1.next ;
			else
				n2 = n2.next ;
		}
	}
}


public class Intersection {

	public static void main(String[] args) {
		
		instLink l1 = new instLink();
		
		instLink l2 = new instLink() ;
		
		instLink l3 = new instLink();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of element l1");
		
		int n = sc.nextInt();
		
		System.out.println("Enter elements");
		
		for ( int i = 0 ; i < n ; i++ ) {
			
			int x = sc.nextInt();
			l1.insertEnd(x);
		
		}
		
		System.out.println("Enter no of element l2 ");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter elements");
		
		for ( int i = 0 ; i < n1 ; i++ ) {
			
			int x = sc.nextInt();
			l2.insertEnd(x);
		
		}
		
		 l3.interst(l1, l2, l3);
		 
		 System.out.println("intersection of l1 & l2 ");
		 
		 l3.display();
	}

}
