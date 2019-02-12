import java.util.*;

class Node1{
	int data ;
	Node1 next;
	Node1( int x ){
		this.data = x ;
	}
}
class linkList{
	
	Node1 head ;
	static int count = 0 ;
	
	public void insertEnd(int x ) {
		Node1 node = new Node1(x);
		if( head == null )
			head = node ;
		else {
			Node1 temp = head ;
			while( temp.next != null )
				temp = temp.next ;
			temp.next = node ;
		}
		count++;
	}
	public void display() {
		if ( head == null ) {
			System.out.println("list is empty");
			return ;
		}
		Node1 temp = head ;
		while( temp != null ) {
			System.out.print(temp.data+" ");
			temp = temp.next ;
		}
		System.out.println();
	}
	public void insertAtSpecificPos( int d , int pos ) {
		if( ( pos >  count+1 )|| pos <= 0 ) {
			System.out.println("invalid position");
			return ;
		}
		Node1 temp = head , temp1=null;
		if( pos == 1 ) {
			Node1 node = new Node1(d);
			node.next = head;
			head = node;
			return ;
		}
			int c = 1 ;
		while(c < pos ) {
			temp1 = temp;
			temp = temp.next;
			c++;
		}
		Node1 node = new Node1(d);
		temp1.next = node ;
		node.next = temp;
	}
	public void deleteSp( int pos ) {
		if( pos > count || pos <= 0 ) {
			System.out.println("invalid position");
		}else {
			if ( pos == 1 ) {
				Node1 ptr = head ;
				head = head.next ;
				ptr.next = null ;
				return ;
			}
			int c = 1 ;
			Node1  curr = head ;
			Node1 p = null;
			while( c < pos ) {
				c++;
				p= curr;
				curr = curr.next;
			}
			p.next = curr.next;
			curr.next = null ;
		}
	}
}
public class SingleLinkQs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		linkList l = new  linkList();
		for ( int i = 0 ; i < n ; i++ ) {
			int x = sc.nextInt();
			l.insertEnd(x);
		}
		l.display();
		l.insertAtSpecificPos(10, 3);
		l.display();
		l.deleteSp(1);
		l.display();
	}

}
