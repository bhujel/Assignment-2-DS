import java.util.*;
class Node{
	int data;
	Node next , prev ;
	Node(int data){
		this.data = data;
	}
}
class List{
	Node head , tail ;
	public void insert(int x ) {
		Node node = new Node(x);
		node.next = null ;
		if( head == null )
			head = tail = node ;
		else {
			tail.next = node ;
			node.prev = tail;
			tail = node;
		}
	}
	public void display() {
		if( head == null ) {
			System.out.println("list is empty");
			return ;
		}
		Node curr = head;
		while( curr != null ) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	public void calcel() {
		Node temp1 = head ;
		while( temp1 != null ) {
			int f = 0 ;
			Node temp2 = temp1.next;
			while( temp2 != null ) {
				if( temp1.data + temp2.data == 0 ) {
					Node ptr1 = temp2.prev;
					Node ptr2 = temp2.next;
					ptr1.next = ptr2 ;
					if( temp2.next != null )
					ptr2.prev = ptr1 ;
					temp2.prev = null ;
					temp2.next = null ;
					f = 1 ;
					break;
				}
				temp2 = temp2.next;
			}
			if( f == 1 ) {
				if( temp1.prev == null ) {
					Node ptr1 = temp1;
					if( temp1.next == null ) {
						head = temp1 = null ;
					}else {
					temp1 = temp1.next;
					temp1.prev = null ;
					head = temp1;
					ptr1.next = null ;
					}
				}else {
					Node ptr1 = temp1.prev;
					Node ptr2 = temp1.next;
					ptr1.next = ptr2 ;
					ptr2.prev = ptr1;
					temp1.next = null ;
					temp1.prev = null ;
					temp1 = ptr2;
				}
			}
			else
				temp1 = temp1.next;
		}
	}
}
public class InterviewQS {

	public static void main(String[] args) {
		int n , x ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		List l = new List();
		for ( int i = 0 ; i < n ; i++ ) {
			x = sc.nextInt();
			l.insert(x);
		}
		l.calcel();
		l.display();
	}

}
