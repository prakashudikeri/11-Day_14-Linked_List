package com.bridgelabz.linkedlist; //UC2

public class CreateLinkedList_UC2 {
	    public Node head;
	    public Node tail;  
    public static void main(String[] args) {
        CreateLinkedList_UC2 list = new CreateLinkedList_UC2();
	        list.add(56);
	        list.add(30);
	        list.add(70);
	        list.display();
		}  
    static class Node {
	    int data;
	    Node next;
    Node(int d) {
        data = d;
        next = null;
    	}
    }
    public void add(int datas){										    // Adding new Node with data
        Node newNode = new CreateLinkedList_UC2.Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        	}
    	}
    public void display() {												    // Display the Node with value
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        	}
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        	}
    	}   
}
