

package practiceQs;

import java.util.*;


class Node{
	
	char data ;
	Node next;
	
	Node(char data){
		
		this.data = data ;
	}
}
class Link{
	
	Node head , head1 ;
	
	public void insert(char ch ) {
		
		Node node = new Node(ch);
		
		if( head == null ) {
			
			head = node;
			
		}else {
			
			Node curr = head;
			
			while( curr.next != null )
				curr = curr.next;
			
			curr.next = node;
		}
	}
	public void display() {
		
		Node curr = head;
		
		while( curr != null ) {
			
			System.out.print(curr.data);
			
			curr = curr.next;
		}
	}
	public void split() {
		
		Node s = head , f = head ;
		
		while( f.next != null && f.next.next != null ) {
			
			s = s.next ;
			f = f.next.next;
		}
		head1 = s.next;
		s.next = null ;
	}
	public void reverse() {
		if( head1 == null ) {
			System.out.println("list is empty");
			return ;
		}
		Node curr = head1 , next1 = null , prev = null ;
		while( curr != null ) {
			next1 = curr.next;
			curr.next = prev ;
			prev = curr;
			curr = next1;
		}
		head1 = prev ;
	}
	public boolean pal() {
		
		Node n1 = head , n2 = head1;
		while( n1 != null && n2 != null ) {
			if( n1.data != n2.data )
				return false;
			n1 = n1.next;
			n2= n2.next;
		}
		return true;
	}
}
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		Link l = new Link();
		
		for ( int i = 0 ; i < str.length(); i++ ) {
			
			l.insert(str.charAt(i));
			
		}
		
		l.split();
		
		l.reverse();
		
		//l.display();
		
		if ( l.pal())
			System.out.println("It is paldrome");
		else
			System.out.println("It is not pal ");
		
	}

}
