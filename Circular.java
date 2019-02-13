package CircularLinkList;

import java.util.*;

class mNode{
	
	int data ;
	mNode next , prev ;
	
	mNode( int data ){
		
		this.data = data;
	}
}
class cirList{
	
	mNode head , tail ;
	
	public void insertEnd( int x ) {
		
		
		mNode node = new mNode(x);
		
		if( head == null ) {
			
			node.next = node ;
			node.prev = node ; 
			head = tail = node;
			
		}else {
			
			tail.next = node;
			node.prev = tail;
			node.next = head;
			head.prev = node;
			tail = node;
			
		}
	}
	public void print( int x ) {
		
		if( head == null )
			System.out.println("list is empty");
		
		mNode curr = head ;
		
		int flg = 0 ;
		
		while( curr.next != head ) {
			
			if( curr.data == x ) {
				
				flg = 1 ;
				
				break ;
				
			}
			
			curr = curr.next;
			
		}
		
		if ( flg == 1 ) {
			
			mNode ptr = curr ;
			
			while( ptr.next != curr ) {
				
				System.out.print(ptr.data +" ");
				ptr = ptr.next;
				
			}
			
			System.out.println(ptr.data);
			
		}
		else {
			
			System.out.println(x+"is not present in list");
			
		}
		
	}
	
}
public class Circular {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		cirList l = new cirList();
		
		System.out.println("Enter no of element");
		
		int n = sc.nextInt();
		
		System.out.println("Enter elements");
		
		for ( int i = 0 ; i < n ; i++ ) {
			
			int x = sc.nextInt();
			l.insertEnd(x);
		
		}
		
		System.out.println("enter element to print");
		
		int x = sc.nextInt();
		
		System.out.println("Elements starting with "+ x);
		
		l.print(x);
	}

}
