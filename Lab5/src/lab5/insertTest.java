package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class insertTest {

	@Test
	void test() {
		MyImplDLL <Integer> dll0 = new MyImplDLL<Integer> ();
		assertTrue(dll0.isEmpty());
		dll0.insert(10);
		assertFalse(dll0.isEmpty());
		assertEquals(1, dll0.getSize());
		dll0.delete(10);
		assertEquals(0, dll0.getSize());
		dll0.delete(10);
		assertEquals(0, dll0.getSize()); //still returns 0 since there is no object called 10 to remove
		assertTrue(dll0.isEmpty());
		dll0.insert(5);
		dll0.insert(6);
		dll0.insert(7);
		assertEquals(3, dll0.getSize()); //size at this point should be 3
		dll0.delete(5);
		dll0.delete(6);
		assertEquals(1, dll0.getSize()); //size at this point should be 1, 2 removed
	}

}
