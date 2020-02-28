

//Java program to find middle of linked list 
public class LinkedListsDemo 
{ 
	 static Node head; // head of linked list 

	/* Linked list node */
	 class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to print middle of linked list */
	void printMiddle() 
	{ 
	    System.out.println(head);
		Node front = head;
		Node second = head;
		
		if(head !=null) {
			while(front !=null && front.next != null) {
				
				front = front.next.next;
				second =second.next;
				
			}
			
			System.out.println("the middle number is:" + second.data);
			
		}
		System.out.println("null");
	} 

	/* Inserts a new Node at front of the list. */
	public  void push(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	} 

	/* This function prints contents of linked list 
	starting from the given node */
	public void printList() 
	{ 
		Node tnode=head;
		
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+"->"); 
			tnode = tnode.next; 
		} 
		System.out.println("NULL"); 
	} 

	public static void main(String [] args) 
	{ 
		LinkedListsDemo llist = new LinkedListsDemo(); 
		llist.push(11);
		llist.push(15);
		llist.push(19);
		llist.push(21);
		llist.push(25);
		
		llist.printList();
		llist.printMiddle();
	} 
} 
//This code is contributed by Rajat Mishra 
