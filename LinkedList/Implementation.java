package LinkedList;

public class Implementation {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static class linkedList{
		Node head=null;
		Node tail=null;
		
		void insertAtEnd(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
				tail=temp;
			}else {
				tail.next=temp;
				tail=temp;
			}
		}
		
		void insertAtHead(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=tail=temp;
			}
			else {
				temp.next=head;
				head=temp;
			}
		}
		
		void insertAt(int idx,int val) {
			Node t=new Node(val);
			Node temp=head;
			if(idx==size()) {
				insertAtEnd(val);
				return;
			}
			else if(idx==0) {
				insertAtHead(val);
				return;
			}
			else if(idx<0){
				System.out.println("Wrong index");
				return;
			}
			else if(idx>size()) {
				System.out.println("Wrong index");
				return;
			}
			for(int i=1;i<=idx-1;i++) {
				temp=temp.next;
			}
				t.next=temp.next;
				temp.next=t;
		}
		
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		int size() {
			int count=0;
			Node temp=head;
			while(temp!=null) {
				count++;
				temp=temp.next;
			}return count;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList ll=new linkedList();
		ll.insertAtEnd(4);//4
		ll.insertAtEnd(5);//4->5
		ll.display();
		System.out.println(ll.size());
		ll.insertAtEnd(12); // 4->5->12
		ll.display();
		ll.insertAtHead(13);//13-> 4->5->12
		ll.display();
		ll.insertAt(2, 10);
		ll.display();
		ll.insertAt(5, 13);
		ll.display();
		System.out.println(ll.tail.data);

	}

}
