package LinkedList;

public class Basicsll {
	public static class Node{
		int data; //value
		Node next; //address of next node
		Node(int data){
			this.data=data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node x=new Node();
//		System.out.println(x.data);
		Node a=new Node(5);
//		System.out.println(a.next);//null
		Node b=new Node(3);
		Node c=new Node(9);
		Node d=new Node(8);
		Node e=new Node(16);
		
		//5-> 3-> 9-> 8-> 16
		a.next=b;//5->3
//		System.out.println(a);//@2c7b84de
//		System.out.println(a.next);//@3fee733d
//		System.out.println(b);//@3fee733d
		
//		System.out.println(a.data);//5
//		System.out.println(a.next.data);//3
//		System.out.println(b.data);//3
		
		b.next=c;//5-> 3-> 9
		c.next=d;//5-> 3-> 9-> 8
		d.next=e;//5-> 3-> 9-> 8-> 16 

	}

}
