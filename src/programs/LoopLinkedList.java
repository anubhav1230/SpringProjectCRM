package programs;

import java.util.*; 

public class LoopLinkedList { 
  
    static Node head; // head of list 
  
    /* Linked list Node*/
     static class Node { 
        int data; 
        Node next; 
        Node(int data) 
        { 
           this.data = data; 
            this.next = null; 
        } 
    } 
  
    
    //if I want to insert the node at last
    
    static public void pusAtLast() {
    	
    }
    
    
    /* Inserts a new Node at front of the list. */
    static public void push(int new_data) 
    
   
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
        
     
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
  
    // Returns true if there is a loop in linked 
    // list else returns false. 
    static boolean detectLoop(Node h) 
    { 
        HashSet<Node> s = new HashSet<Node>(); 
        while (h != null) { 
            // If we have already has this node 
            // in hashmap it means their is a cycle 
            // (Because you we encountering the 
            // node second time). 
            if (s.contains(h)) {
                return true; }
  
            // If we are seeing the node for 
            // the first time, insert it in hash 
            else {
            s.add(h); 
  
            h = h.next;} 
        } 
  
        return false; 
    } 
  
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.println(node.data + " "); 
            node = node.next; 
        } 
    } 
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        LoopLinkedList llist = new LoopLinkedList(); 
  
        LoopLinkedList.push(20); 
        LoopLinkedList.push(4); 
        LoopLinkedList.push(15); 
        LoopLinkedList.push(10);
        llist.printList(head);
  
        /*Create loop for testing */
       LoopLinkedList.head.next.next.next.next = LoopLinkedList.head; 
  
        if (detectLoop(head)) 
            System.out.println("Loop found"); 
        else
            System.out.println("No Loop"); 
    } 
} 