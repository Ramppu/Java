package matikkaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatikkaaTest {

	@Test
	void sumEquals5() {
		assertEquals(5, Matikkaa.summa(3, 2));
	}
	
	@Test
	void sumEquals15() {
		assertEquals(15, Matikkaa.summa(9, 6));
	}
	
	@Test
	void löytyyköTaulukkoTest() {
		int[] taulu = new int[100];
		taulu[29] = 32;
		assertTrue(Matikkaa.löytyyköLuku(taulu, 32));
	}
	
	@Test
	void testPower() {
		assertEquals(16,Matikkaa.potenssi(4, 2));
	}
	
	@Test
	void secondBiggerThan() {
		assertFalse(Matikkaa.biggerThan(2, 30));
	}
	@Test
	void firstBiggerThan() {
		assertTrue(Matikkaa.biggerThan(10, 5));
	}
	
	@Test
	void firstEqualsTwo() {
		assertFalse(Matikkaa.biggerThan(5, 5));
	}
	
	@Test
	void areaIs0() {
		assertEquals(0,Matikkaa.area(-10, -20));
	}
	
	@Test
	void areaIs20() {
		assertEquals(20,Matikkaa.area(5, 4));
	}
	
	@Test
	void lengthIsMinus() {
		assertEquals(0,Matikkaa.area(-20, 5));
	}
}
