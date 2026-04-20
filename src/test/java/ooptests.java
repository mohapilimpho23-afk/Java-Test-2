import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the OOP, Encapsulation & Inheritance assessment.
 *
 * Run with Maven:  mvn test
 * All tests should pass once all four questions are correctly solved.
 */
@DisplayName("OOP, Encapsulation & Inheritance Assessment")
class OOPTest {


    // Question 1 — Person encapsulation


    @Test
    @DisplayName("Q1: getName() returns the name passed to the constructor")
    void testPerson_getName() {
        Person p = new Person("Alice", 30);
        assertEquals("Alice", p.getName());
    }

    @Test
    @DisplayName("Q1: getAge() returns the age passed to the constructor")
    void testPerson_getAge() {
        Person p = new Person("Alice", 30);
        assertEquals(30, p.getAge());
    }

    @Test
    @DisplayName("Q1: name field is private (no direct outside access)")
    void testPerson_nameIsPrivate() throws NoSuchFieldException {
        java.lang.reflect.Field field = Person.class.getDeclaredField("name");
        assertTrue(
                java.lang.reflect.Modifier.isPrivate(field.getModifiers()),
                "The 'name' field should be private"
        );
    }

    @Test
    @DisplayName("Q1: different Person objects hold their own names")
    void testPerson_separateInstances() {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        assertNotEquals(p1.getName(), p2.getName());
    }


    // Question 2 — Student inheritance


    @Test
    @DisplayName("Q2: Student getName() returns name (via inherited getter)")
    void testStudent_getName() {
        Student s = new Student("Bob", 20, 88);
        assertEquals("Bob", s.getName());
    }

    @Test
    @DisplayName("Q2: Student getAge() returns age (via inherited getter)")
    void testStudent_getAge() {
        Student s = new Student("Bob", 20, 88);
        assertEquals(20, s.getAge());
    }

    @Test
    @DisplayName("Q2: Student getGrade() returns the correct grade")
    void testStudent_getGrade() {
        Student s = new Student("Bob", 20, 88);
        assertEquals(88, s.getGrade());
    }

    @Test
    @DisplayName("Q2: getDetails() includes name, age, and grade")
    void testStudent_getDetails_containsAllFields() {
        Student s = new Student("Bob", 20, 88);
        String details = s.getDetails();
        assertTrue(details.contains("Bob"),  "getDetails() should contain the name");
        assertTrue(details.contains("20"),   "getDetails() should contain the age");
        assertTrue(details.contains("88"),   "getDetails() should contain the grade");
    }

    @Test
    @DisplayName("Q2: getDetails() matches expected format exactly")
    void testStudent_getDetails_format() {
        Student s = new Student("Bob", 20, 88);
        assertEquals("Name: Bob, Age: 20, Grade: 88", s.getDetails());
    }



    // Question 3 — Person getDetails()


    @Test
    @DisplayName("Q3: Person getDetails() matches expected format")
    void testPerson_getDetails_format() {
        Person p = new Person("Alice", 30);
        assertEquals("Name: Alice, Age: 30", p.getDetails());
    }

    @Test
    @DisplayName("Q3: Person getDetails() works for different values")
    void testPerson_getDetails_differentValues() {
        Person p = new Person("Charlie", 45);
        assertEquals("Name: Charlie, Age: 45", p.getDetails());
    }



    // Question 4 — isHonourStudent()


    @Test
    @DisplayName("Q4: grade of 75 is an honour student (boundary)")
    void testIsHonourStudent_boundary() {
        Student s = new Student("Eve", 19, 75);
        assertTrue(s.isHonourStudent());
    }

    @Test
    @DisplayName("Q4: grade above 75 is an honour student")
    void testIsHonourStudent_above() {
        Student s = new Student("Eve", 19, 90);
        assertTrue(s.isHonourStudent());
    }

    @Test
    @DisplayName("Q4: grade of 74 is NOT an honour student (boundary)")
    void testIsHonourStudent_justBelow() {
        Student s = new Student("Eve", 19, 74);
        assertFalse(s.isHonourStudent());
    }

    @Test
    @DisplayName("Q4: grade of 0 is not an honour student")
    void testIsHonourStudent_zero() {
        Student s = new Student("Eve", 19, 0);
        assertFalse(s.isHonourStudent());
    }

    @Test
    @DisplayName("Q4: grade of 100 is an honour student")
    void testIsHonourStudent_perfect() {
        Student s = new Student("Eve", 19, 100);
        assertTrue(s.isHonourStudent());
    }
}

