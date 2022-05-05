package com.revature.dsa.singlylinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSinglyLinkedList {
	public SinglyLinkedList<Integer> listWithFiveItems() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		return list;
	}

	@Test
	void testSize1() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		assertEquals(0, list.getSize());
	}
	
	@Test
	void testSize2() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(5, list.getSize());
	}
	
	@Test
	void testContains1() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		assertTrue(list.contains(30));
	}

	@Test
	void testContains2() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		assertFalse(list.contains(90));
	}
	
	@Test
	void testToString() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		assertEquals("| 10 | -> | 20 | -> | 30 | -> | 40 | -> | 50 | -> NULL\n", list.toString());
	}
	
	@Test
	void testInsert1() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		list.insert(0, 10);
		assertEquals("| 10 | -> NULL\n", list.toString());
	}
	
	@Test
	void testInsert2() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		list.insert(2, 25);
		assertEquals("| 10 | -> | 20 | -> | 25 | -> | 30 | -> | 40 | -> | 50 | -> NULL\n", list.toString());
	}

	@Test
	void testInsert3() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		list.insert(5, 55);
		assertEquals("| 10 | -> | 20 | -> | 30 | -> | 40 | -> | 50 | -> | 55 | -> NULL\n", list.toString());
	}

	@Test
	void testInsert4() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.insert(6, 55);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	@Test
	void testInsert5() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.insert(-1, 55);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testDelete1() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		list.delete(0);
		assertEquals("| 20 | -> | 30 | -> | 40 | -> | 50 | -> NULL\n", list.toString());
	}

	@Test
	void testDelete2() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		list.delete(2);
		assertEquals("| 10 | -> | 20 | -> | 40 | -> | 50 | -> NULL\n", list.toString());
	}

	@Test
	void testDelete3() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		list.delete(4);
		assertEquals("| 10 | -> | 20 | -> | 30 | -> | 40 | -> NULL\n", list.toString());
	}

	@Test
	void testDelete4() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.delete(-1);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	@Test
	void testDelete5() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.delete(5);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testGet1() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(10, list.get(0));
	}
	
	@Test
	void testGet2() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(40, list.get(3));
	}
	
	@Test
	void testGet3() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(50, list.get(4));
	}
	
	@Test
	void testGet4() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.get(-1);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testGet5() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.get(5);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	@Test
	void testUpdate1() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		list.update(3, 90);
		assertEquals("| 10 | -> | 20 | -> | 30 | -> | 90 | -> | 50 | -> NULL\n", list.toString());
	}

	@Test
	void testUpdate2() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.update(-1, 90);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testUpdate3() {
		SinglyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.update(5, 90);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

}
