public class Person {


    // Question 1 — Fix the encapsulation errors

    //
    // This class must:
    //   - Keep its fields private (no direct outside access)
    //   - Correctly initialise both fields in the constructor
    //   - Return the correct field from getName()
    //
    // The code below contains:
    //   - One access modifier error     (field visibility)
    //   - One missing keyword in the constructor
    //   - One wrong return value in a getter
    // Fix all three errors.

    public String name;     // fix: wrong access modifier
    private int age;

    public Person(String name, int age) {
        name = name;        // fix: field is never actually set
        this.age = age;
    }

    public String getName() {
        return "";          // fix: wrong return value
    }

    public int getAge() {
        return this.age;
    }

    // Question 3 — Complete getDetails()

    // This method must return a single String in this exact format:
    //   "Name: Alice, Age: 30"
    // Fill in the return statement. Use the existing getters.

    public String getDetails() {
        return          ;   // fill: build and return the formatted string
    }

}
