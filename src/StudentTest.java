import static org.junit.Assert.*;

import org.junit.Test;


public class StudentTest {

	public Student s;
	public Student s1;
	public Student s2;
	
	@Test (expected = NullPointerException.class)
	public void nameNotNullTest() {
		s = new Student(null, 5);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void numberNotLessThanZero(){
		s = new Student("Joe", -999);
	}
	
	@Test
	public void studentNameGetter(){
		s = new Student("James", 12);
		assertEquals("James", s.getName());
	}

	@Test
	public void studentNumberGetter(){
		s = new Student("James", 12);
		assertEquals(12, s.getFavoriteNumber());
	}
	
	@Test
	public void equalsSymmetryTest(){
		s = new Student("James", 12);
		s1 = new Student("James", 12);
		assertTrue(s.equals(s1));
		assertTrue(s1.equals(s));
		
		s1 = new Student("James", 13);
		assertFalse(s.equals(s1));
		assertFalse(s1.equals(s));
	}
	
	@Test
	public void equalsReflexivityTest(){
		s = new Student("James", 12);
		s1 = new Student("James", 12);
		assertTrue(s.equals(s1));
	}
	
	@Test
	public void equalsTransitivityTest(){
		s = new Student("James", 13);
		s1 = new Student("James", 13);
		s2 = new Student("James", 13);
		assertTrue(s.equals(s1));
		assertTrue(s1.equals(s2));
		assertTrue(s.equals(s2));
	}
}
