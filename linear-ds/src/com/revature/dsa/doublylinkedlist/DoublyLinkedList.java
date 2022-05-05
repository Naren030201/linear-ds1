package com.revature.dsa.doublylinkedlist;

public class DoublyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
			tail = node;
		}
		size++;
	}

	public T get(int index) {
		if (index >= size) {
			return null;
		}
		Node<T> pointer = head;
		for (int i = 0; i < index; i++) {
			pointer = pointer.getNext();
		}
		return pointer.getData();
	}

	public boolean contains(T data) {
		Node<T> pointer = head;
		for (int i = 0; i < size; i++) {
			if (pointer.getData().equals(data)) {
				return true;
			}
			pointer = pointer.getNext();
		}
		return false;
	}

	public void insert(int index, T data) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		} else if (index == 0) {
			newNode.setNext(head);
			head.setPrevious(newNode);
			head = newNode;
		} else if (index == size) {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
		} else {
			Node<T> pointer = head;
			for (int i = 0; i < index - 1; i++) {
				pointer = pointer.getNext();
			}
			Node<T> nextNode = pointer.getNext();
			pointer.setNext(newNode);
			newNode.setNext(nextNode);
			newNode.setPrevious(pointer);
			nextNode.setPrevious(newNode);
		}
		size++;
	}

	public void update(int index, T data) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> pointer = head;
		for (int i = 0; i < index; i++) {
			pointer = pointer.getNext();
		}
		pointer.setData(data);
	}

	public void delete(int index) {
		Node<T> pointer = head;
		Node<T> newHead = head;
		Node<T> pointertail=tail;
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}  if (index == 0) {
			head = pointer.getNext();
			head.setPrevious(null);
		} else if (index == size-1) {
			tail = pointertail.getPrevious();
			tail.setNext(null);
		}else {
		for (int i = 0; i < index - 1; i++) {
			pointer = pointer.getNext();
			newHead = newHead.getNext();
		}
		 Node<T>newH = newHead.getNext().getNext();
		pointer.setNext(newH);
		newH.setPrevious(pointer);
		
	}
		size--;
	}
	public String toString() {
		Node<T> pointer = head;
		String list = "";
		while (pointer != null) {
			list += pointer;
			pointer = pointer.getNext();
		}
		return list + "\n";
	}

	public static void main(String args[]) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
	}
}
