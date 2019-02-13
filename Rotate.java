package practiceQs;

import java.util.Scanner;

class rNode{
	
	int data ;
	rNode next , prev ;
	
	rNode( int data ){
		
		this.data = data ;
		
	}
	
}

class rotateList{
	
	rNode head , tail ;
	
	static int count ;
	
	public void insertEnd( int x ) {
		
		count++;
		
		rNode node = new rNode(x);
		
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
		
		rNode curr = head ;
		
		while( curr != null ) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			
			}
		
		System.out.println();
		}
	}
	public void rotate( int n ) {
		
		if ( head == null || n <= 0 || n >= count ) {
			
			System.out.println("cannot roate ");
			return ;
		
		}
		 
		int c = 0 ;
		
		rNode curr = head;
		
		 while(  c < n ) {
			 
			 curr = curr.next ;
			 
			 c++;
			 
		 }
		 
		 tail.next = head ;
		 curr.prev.next = null ;
		 curr.prev = null ;
		 head = curr ;
	}
	
}

public class Rotate {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of element");
		
		int n = sc.nextInt();
		
		rotateList l = new rotateList();
		
		System.out.println("enter elements");
		
		for ( int i = 0 ; i < n ; i++ ) {
			
			int x = sc.nextInt();
			
			l.insertEnd(x);
		}
		
		l.transverse();
		
		System.out.println("enter value to roate");
		
		int r = sc.nextInt();
		
		l.rotate(r);
		
		System.out.println("Elements after rotation");
		
		l.transverse();
	}

}
