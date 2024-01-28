
class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class linkedlist1{
	Node head;
	public linkedlist1() {
		this.head=null;
	}

  //method for insert a new node end of the list
  public void append(int data)
  {
	Node newNode=new Node(data);
	if(head==null)
	{
		head=newNode;
		return;
	}
	Node last=head;
	while(last.next !=null) {
		last=last.next;
	}
	last.next=newNode;
  }
	public void display()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
}

//in sub class create an node and then create linkedlist for node
//linkedlist1 is an sub class,linkedlist is an main class
public class linkedlist {
        public static void main(String [] args) {
        	linkedlist1 linkedlist=new linkedlist1();
        	linkedlist.append(1);
        	linkedlist.append(2);
        	linkedlist.append(3);
        	linkedlist.append(4);
        	linkedlist.append(5);
        	System.out.println("LinkedList value: ");
        	linkedlist.display();
        	
        }
}

