# OOP, Encapsulation & Inheritance Assessment

## Test Scope

**Learning Outcomes assessed:**

* Object-Oriented Programming (OOP)
* Encapsulation
* Inheritance

---

## README

### Question 1 — Fix the encapsulation errors in `Person.java` 

This class must:

* Keep its fields private so they cannot be accessed directly from outside the class
* Correctly initialise both fields inside the constructor
* Return the correct field value from `getName()`

The code contains a wrong access modifier on a field, a missing keyword in the constructor that means the field is never actually set, and a getter that returns the wrong value. Fix all three errors.

```java
public class Person {
    public String name;  // ...
    private int age;

    public Person(String name, int age) { ... }

    public String getName() { ... }
    public int getAge() { ... }
}
```

---

### Question 2 — Fix the inheritance errors in `Student.java` 

This class must:

* Call the parent constructor so that `name` and `age` are correctly initialised
* Override `getDetails()` so that it builds on `Person`'s version and appends the student's grade

The code is missing the parent constructor call, and the `getDetails()` override returns a hardcoded string instead of using the parent's output. Fix both errors.

Expected format for `getDetails()`:
```
"Name: Bob, Age: 20, Grade: 88"
```

```java
public class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) { ... }

    @Override
    public String getDetails() { ... }
}
```

---

### Question 3 — `getDetails()` in `Person.java` 

Complete the method body so that it returns a single `String` in this exact format:

```
"Name: Alice, Age: 30"
```

Use the existing getters — do not access the fields directly.

```java
public String getDetails() {}
```

---

### Question 4 — `isHonourStudent()` in `Student.java` 

Complete the method body so that it:

* Returns `true` if the student's grade is 75 or above
* Returns `false` otherwise

No starter code is provided — write the full method body.

```java
public boolean isHonourStudent() {}
```

---

## Comprehension Question Section

Please answer these in `answers.txt`. Do not remove the comments and do not change the format.

---

### Comprehension Question 1 — Encapsulation (5 Points)

A teammate on your project has written a `BankAccount` class where the `balance` field is `public`. You notice that other parts of the program are changing the balance directly — sometimes setting it to a negative number — and it is causing bugs everywhere.

Your tech lead asks you to explain to your teammate why this is a problem and how encapsulation fixes it.

Write that explanation. Cover what encapsulation is, why fields should be `private`, and how getters and setters give controlled access — including the ability to add validation.

---

### Comprehension Question 2 — Inheritance (5 Points)

Your team is building a school system. A classmate has written a `Teacher` class and a `Student` class, and you notice they have copied the same `name`, `age`, `getName()`, and `getAge()` code into both classes word for word.

Explain to your classmate how inheritance would solve this. Cover what inheritance is and what `extends` means, what a subclass gets from its parent, and why avoiding this kind of code duplication matters.

---

### Comprehension Question 3 — Access Modifiers (10 Points)

You are reviewing code for a new team member who has used `public` on every field and method in every class. Your tech lead asks you to write a short internal guide for the team on access modifiers — specifically for the context of writing well-designed Java classes.

Write that guide. It should cover what access modifiers are and why they matter, the difference between `public` and `private`, what `protected` does and when it is appropriate (especially in a parent-child class relationship), and a practical rule of thumb the team can follow when deciding which to use.

---

### Comprehension Question 4 — Method Overriding (5 Points)

A classmate has a `Person` class with a `getDetails()` method. They wrote a `Student` subclass and added a `getDetails()` method to it as well — but they are confused about why their version is being called instead of the parent's, and whether this is intentional.

Explain method overriding to your classmate. Cover what overriding means and when it happens, what the `@Override` annotation does and why it is good practice to include it, and how `super.getDetails()` can be used to extend the parent's behaviour rather than completely replace it.

---

### Comprehension Question 5 — OOP Design (10 Points)

Your team is building a system for a veterinary clinic. A teammate has suggested using a separate array for each animal attribute — one for names, one for species, one for ages, one for whether the animal has been vaccinated — and just using the index to link them together.

Using the veterinary clinic as your example throughout, argue for an OOP approach instead. Your answer should cover what a class is and how it acts as a blueprint (use an `Animal` class as your example), what an object and an instance are with a concrete example, and how inheritance could be used if the clinic needed to distinguish between different types of animals (such as `Dog` and `Cat`) that share common attributes but also have their own.
