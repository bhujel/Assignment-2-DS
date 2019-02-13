package practiceQs;

import java.util.Scanner;

class nNode{
	
	int data ;
	nNode next ;
	
	nNode( int data ){
		this.data = data ;
	}
}

class rmDup{
	
	nNode head;
	
	public void insertEnd(int x ) {
		
		nNode node = new nNode(x);
		
		if( head == null ) {
			
			head = node ;
		
		}
		else {
			
			nNode temp = head ;
			
			while( temp.next != null )
				temp = temp.next ;
			
			temp.next = node ;
	
		}
	}
	public void display() {
		
		nNode curr = head;
		
		while( curr != null ) {
			
			System.out.print(curr.data+" ");
			
			curr = curr.next;
		}
		System.out.println();
	}
	public void removeDup() {
		
		if ( head == null )
			return ;
		
		nNode curr = head;
		
		while( curr.next != null ) {
			
			if( curr.data == curr.next.data ) {
				
				nNode ptr = curr.next;
				curr.next = curr.next.next ;
				
				ptr = null ;
			}
			else
				curr = curr.next;
		}
	}
}

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		rmDup r = new rmDup();
		
		System.out.println("Enter no of elements ");
		
		int n1 = sc.nextInt();
		
		for ( int i = 0 ; i < n1 ; i++ ) {
			
			int x = sc.nextInt();
			
		r.insertEnd(x);
		
		}
		
		r.removeDup();
		
		r.display();
		
	}

}
