package com.revature.dsa.stackusinglinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

class TestStack {

	@Test
	void testStackCreation() {
		Stack stack = new Stack();
		assertEquals(0, stack.size());
	}
	
	@Test
	void testPush_CheckSize() {
		Stack stack = new Stack();
		stack.push(10);
		assertEquals(1, stack.size());
	}

	@Test
	void testPush_CheckTop() {
		Stack stack = new Stack();
		stack.push(10);
		assertEquals(10, stack.peek());
	}

	@Test
	void testPush_MultipleItemsCheckSize() {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		assertEquals(5, stack.size());
	}

	@Test
	void testPush_MultipleItemsCheckTop() {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		assertEquals(50, stack.peek());
	}
	
	@Test
	void testPeek_EmptyStack() {
		Stack stack = new Stack();
		try {
			stack.peek();
		} catch (EmptyStackException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testPeek_SingleItem() {
		Stack stack = new Stack();
		stack.push(10);
		assertEquals(10, stack.peek());
	}
	
	@Test
	void testPeek_MultipleItems() {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		assertEquals(50, stack.peek());
	}
	
	@Test
	void testPop_EmptyStack() {
		Stack stack = new Stack();
		try {
			stack.pop();
		} catch (EmptyStackException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testPop_SingleItemDataCheck() {
		Stack stack = new Stack();
		stack.push(10);
		assertEquals(10, stack.pop());
	}
	
	@Test
	void testPop_SingleItemSizeCheck() {
		Stack stack = new Stack();
		stack.push(10);
		stack.pop();
		assertEquals(0, stack.size());
	}
	
	@Test
	void testPop_MultipleItemDataCheck() {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		assertEquals(40, stack.pop());
	}
	
	@Test
	void testPop_MultipleItemSizeCheck() {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.pop();
		assertEquals(3, stack.size());
	}
	
}
