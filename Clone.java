package practiceQs;

import java.util.*;

class cNode{
	
	int data ;
	cNode next , prev ;
	
	cNode( int data ){
		
		this.data = data;
	}
}

class cloneList{
	
	cNode head , tail ;
	
	public void insertEnd( int x ) {
		
		cNode node = new cNode(x);
		
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
		
		cNode curr = head ;
		
		while( curr != null ) {
			
			System.out.print(curr.data+" ");
			curr = curr.next;
			}
		
		System.out.println();
		}
	}
	public void clone(cloneList l , cloneList l1 ) {
		
		cNode curr = l.head ;
		
		while( curr != null ) {
			
			l1.insertEnd(curr.data);
			
			curr = curr.next ;
			
		}
	}
}

public class Clone {
    
	
	public static void main(String[] args) {
		
		System.out.println("enter no of elements: ");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		cloneList l = new cloneList();
		
		cloneList l1 = new cloneList();
		
		System.out.println("enter elements");
		
		for ( int i = 0 ; i < n ; i++ ) {
			
			int x = sc.nextInt();
			
			l.insertEnd(x);
		}
        
		l1.clone( l , l1 );
		
		l1.transverse();
		
	}

}
