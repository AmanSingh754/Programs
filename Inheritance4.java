import java.util.*;

// Parent class
class Parent {
    Parent() {
        System.out.println("I am the Parent class");
    }
    
    void showParent() {
        System.out.println("Parent class method");
    }
}

// First Child class
class Child1 extends Parent {
    Child1() {
        System.out.println("I am Child1");
    }

    void showChild1() {
        System.out.println("Child1 class method");
    }
}

// Second Child class
class Child2 extends Parent {
    Child2() {
        System.out.println("I am Child2");
    }

    void showChild2() {
        System.out.println("Child2 class method");
    }
}

// Main class
public class Inheritance4 {
    public static void main(String[] args) {
        // Creating an object of Child1
        Child1 obj1 = new Child1();
        obj1.showParent();  // Calling method from Parent
        obj1.showChild1();  // Calling method from Child1
        System.out.println("--------------------");

        // Creating an object of Child2
        Child2 obj2 = new Child2();
        obj2.showParent();  // Calling method from Parent
        obj2.showChild2();  // Calling method from Child2
    }
}
 
