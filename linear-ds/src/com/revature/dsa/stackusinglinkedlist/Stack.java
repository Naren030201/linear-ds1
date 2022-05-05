package com.revature.dsa.stackusinglinkedlist;

import java.util.EmptyStackException;

import com.revature.dsa.singlylinkedlist.Node;
import com.revature.dsa.singlylinkedlist.SinglyLinkedList;

public class Stack {
	private SinglyLinkedList<Integer> list;
	private int top;
	
	public Stack() {
		this.list = new SinglyLinkedList<>();
		this.top=-1;
	}
	
	public int size() {
		return top+1;
	}

	public void push(int data) {
		top++;
		list.add(data);
	}
	
	public int peek() {
		if(top==-1) {
			throw new EmptyStackException();
		}
		return list.get(top);
	}
	
	public int pop() {
		if(top==-1) {
			throw new EmptyStackException();
		}
		top--;
		
		return list.get(top+1);
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		if (list.getHead() == null) {
			return "Stack is Empty";
		}
		String result = "";
		Node<Integer> pointer = list.getHead();
		while (pointer != null) {
			if (pointer == list.getTail()) {
				result += "Top -> " + pointer.getData() + "\n";
			} else {
				result += "       " + pointer.getData() + "\n";
			}
			pointer = pointer.getNext();
		}
		return result;
	}
}
