package practiceQs;

import java.util.Scanner;

class newNode{
	
	int data ;
	newNode next , prev ;
	
	newNode(int data ){
		
		this.data = data;
		
	}
}
class link{
	
	newNode head , tail ;
	
public void insertEnd( int x ) {
		
		newNode newNode = new newNode(x);
		
		if( tail == null )
			tail = head = newNode;
		else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode ;
		}
	}
public void transverse() {
	if( head == null ) 
		System.out.println("list is empty");
	else {
		newNode curr = head ;
		while( curr != null ) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
		}
	}
	public void sort() {
		
		newNode curr = head , temp = null ;
		while( curr.next != null ) {
			
			temp = curr.next ;
			
			while( temp != null ) {
				
				if ( curr.data > temp.data ) {
					
					int t = curr.data ;
					curr.data = temp.data;
					temp.data = t ;
				}
				temp = temp.next;
			}
			curr = curr.next; 
		}
	}
}
public class sortDoubleList {

	public static void main(String[] args) {
		
		link l = new link();
		
		Scanner sc = new Scanner( System.in);
		
		int n = sc.nextInt();
		
		for ( int i = 0 ; i < n ; i++ ) {
		
			int x = sc.nextInt();
			
			l.insertEnd(x);
		}
		
		l.sort();
		
		l.transverse();
	}

}
