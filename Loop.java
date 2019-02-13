package practiceQs;

import java.util.Scanner;


class Node3{
	
	int data;
	Node3 next ;
	
	Node3(int data ){
		this.data = data;
	}
}
class link1{
	
	Node3 head , tail ;
	
	public void insertEnd(int x ) {
		
		Node3 node = new Node3(x);
		
		if( head == null ) {
			
			head = node ;
		
			tail = node ;	
		}
		else {
			
			Node3 temp = head ;
			
			while( temp.next != null )
				temp = temp.next ;
			
			temp.next = node ;
			tail = node ;
		}
	}
	public boolean checkLoop() {
		
		if( head == null || head.next == null || head.next.next == null )
			return false;
		
		Node3 s = head , f = head.next;
		
		while( f.next != null && f.next.next != null && s != f ) {
			
			s = s.next;
			f = f.next.next;
		}
		if( s == f )
			return true;
		else
			return false;
	}
	public void mkLoop() {
		tail.next = head.next;
	}
}
public class Loop {

	public static void main(String[] args) {
		
link1 l = new link1();
		
		Scanner sc = new Scanner( System.in);
		
		int n = sc.nextInt();
		
		for ( int i = 0 ; i < n ; i++ ) {
		
			int x = sc.nextInt();
			
			l.insertEnd(x);
		}
		//l.mkLoop();
		if ( l.checkLoop() )
			System.out.println("Loop detected");
		else
			System.out.println("loop not detected");
		
	}

}
