import java.util.*;

class Node2{
	int data ;
	Node2 next , prev ;
	Node2(int data){
		this.data = data ;
	}
}
class list{
	Node2 head , tail ;
	static int count ;
	public void insertEnd( int x ) {
		
		Node2 node = new Node2(x);
		
		if( tail == null )
			tail = head = node;
		else {
				tail.next = node;
				node.prev = tail;
				tail = node ;
		}
		count++;
	}
		public void transverse() {
			if( head == null ) 
				System.out.println("list is empty");
			else {
				Node2 curr = head ;
				while( curr != null ) {
					System.out.print(curr.data+" ");
					curr = curr.next;
				}
				System.out.println();
			}
		}
		public void insertSp( int x , int pos ) {
			if( pos > count+1 || pos <= 0 ) {
				System.out.println("invalid position");
			}else {
				Node2 node = new Node2(x);
				if( pos == 1 ) {
					node.next = head;
					head.prev = node ;
					head = node;
				}else {
					int c = 1 ;
					Node2 t1 = head , t2 = null ;
					while( c < pos  ) {
						t2 = t1 ;
						t1 = t1.next ;
						c++;
					}
					t2.next = node;
					node.prev = t2;
					if( t1 != null ) {
					node.next = t1;
					t1.prev = node;
					}
					else
						node.next = null ;
				}
			}
		}
		public void deleteSp(int pos ) {
			if( pos > count || pos <= 0 ) {
				System.out.println("invalid position");
			}else {
				if( pos == 1 ) {
					Node2 p = head ;
					head = head.next;
					head.prev = null ;
					p.next = null ;
				}else {
					int c = 1 ;
					Node2 p1 = head , p2 = null ;
					while( c < pos ) {
						p2 = p1;
						p1 = p1.next;
						c++;
					}
					p2.next = p1.next ;
					p1.next.prev = p2;
					p1.next = null ;
					p1.prev = null ;
				}
			}
		}
}
public class doubleLinkQs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		list l = new list();
		for ( int i = 0 ; i < n ; i++ ) {
			int x = sc.nextInt();
			l.insertEnd(x);
		}
		l.transverse();
		l.insertSp(10, 3);
		l.transverse();
		l.deleteSp(4);
		l.transverse();
	}

}
