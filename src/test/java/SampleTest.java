import static org.junit.Assert.*;

import org.junit.Test;

import mar.jk.cod.Student;

public class SampleTest {

	@Test
	public void simpleTest() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}

	@Test
	public void simpleTest2() {
		int a = 2;
		int b = 2;
		assertTrue(a + b == 4);
	}

	@Test
	public void testSomeFunc() {
		Student s = new Student(2, "diego");
		assertEquals(4, s.someFunc(2));
	}
}
