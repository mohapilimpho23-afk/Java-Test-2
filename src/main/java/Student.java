public class Student extends Person {


    // Question 2 — Fix the inheritance errors

    // This class must:
    //   - Correctly initialise the Person fields via the parent constructor
    //   - Override getDetails() to include the student's grade
    //
    // The code below contains:
    //   - One missing parent constructor call
    //   - One incorrect override (does not use the parent's getDetails())
    // Fix both errors.

    private int grade;

    public Student(String name, int age, int grade) {
        super(name , age);
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }



    @Override
    public String getDetails() {
        return super.getDetails() + ", Grade: " + grade ;   // fix: should build on Person's getDetails()
        // expected format: "Name: Alice, Age: 20, Grade: 88"
    }

    // Question 4 — Complete isHonourStudent()

    // Complete the method body so that it:
    //   - Returns true if the student's grade is 75 or above
    //   - Returns false otherwise
    // No starter logic is provided — write the full method body.

    public boolean isHonourStudent() {
        if ( grade >= 75 ) return true ;
        return false     ;
    }

}
