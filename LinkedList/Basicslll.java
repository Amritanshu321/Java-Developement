package LinkedList;

public class Basicslll {
	
	public static int length(Node head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	public static void DisplayReverse(Node head) {
		if(head==null)return;
		DisplayReverse(head.next);
		System.out.print(head.data+" ");
	}
	
	public static void displayr(Node head) {
		if(head==null)return;
		System.out.print(head.data+" ");
		displayr(head.next);
	}
	
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(5);
		Node b=new Node(3);
		Node c=new Node(9);
		Node d=new Node(8);
		Node e=new Node(16);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		//Display a linked list
		
//		System.out.println(a.data);
//		System.out.println(a.next.data);
//		System.out.println(a.next.next.data);
//		System.out.println(a.next.next.next.data);
//		System.out.println(a.next.next.next.next.data);
		
		Node temp=a;
//		for(int i=1;i<=5;i++) {
//			System.out.println(temp.data);
//			temp=temp.next;
//		}
//		while(temp!=null) {
//			System.out.println(temp.data);
//			temp=temp.next;
//		}
//		display(a);
//		System.out.println();
//		displayr(a);
//		System.out.println();
//		DisplayReverse(a);
//		System.out.println();
		System.out.println("length of list ="+length(a));

	}

}
