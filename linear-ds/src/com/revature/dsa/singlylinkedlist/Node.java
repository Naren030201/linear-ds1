package com.revature.dsa.singlylinkedlist;

import com.revature.dsa.singlylinkedlist.Node;

public class Node<T> {
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
	
	public void setNext(Node<T> node) {
		this.next = node;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Node<T> other = (Node<T>) obj;
		if (data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!data.equals(other.data)) {
			return false;
		}
		return true;
	}

	public String toString() {
		return String.format("| %d | -> %s", data, (next == null) ? "NULL\n" : "");
	}

}
