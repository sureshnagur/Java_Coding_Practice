package variablesanddatatypes;

public class StaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * What is a static keyword in Java? Can we create static classes?
 * 
 * 1. Static Variables Definition: A static variable (or class variable) belongs
 * to the class rather than to any specific instance of the class. It is shared
 * among all instances of the class. Usage: Static variables are used to store
 * data or constants that should be common to all instances of a class. Example:
 * 
 * public class Example { // Static variable static int counter = 0;
 * 
 * public Example() { counter++; }
 * 
 * public static void main(String[] args) { Example e1 = new Example(); Example
 * e2 = new Example(); System.out.println("Counter: " + Example.counter); //
 * Output: Counter: 2 } } 2. Static Methods Definition: A static method belongs
 * to the class rather than to any specific instance of the class. It can be
 * called without creating an instance of the class. Usage: Static methods are
 * used for operations that are not dependent on instance data. They can only
 * access static variables and call other static methods directly. Example:
 * 
 * public class Example { 
 * // Static method static void display() 
 * {
 * System.out.println("Static method called.");
 *  }
 * 
 * public static void main(String[] args) {
 *  Example.display(); 
 *  // Calling static method } } 
 *  
 *  3. Static Blocks Definition: Static blocks are used for static
 * initialization of a class. They are executed only once when the class is
 * first loaded. Usage: Static blocks are useful for initializing static
 * variables or performing setup tasks. Example:
 * 
 * public class Example { static int value;
 * 
 * static { value = 10; 
 * System.out.println("Static block executed.");
 *  }
 * 
 * public static void main(String[] args) { System.out.println("Value: " +
 * Example.value); // Output: Value: 10 } } 4. Static Classes In Java, top-level
 * classes cannot be declared as static. However, nested classes can be declared
 * as static. A static nested class is associated with its outer class and does
 * not have access to the instance variables and methods of the outer class.
 * 
 * Static Nested Class: Definition: A static nested class is a nested class that
 * is declared with the static keyword. It can access the static members of the
 * outer class but cannot access the non-static members directly. Usage: Static
 * nested classes are used when the nested class does not need access to the
 * instance variables or methods of the outer class. Example:
 * 
 * public class OuterClass { static int outerStaticVar = 10;
 * 
 * // Static nested class static class StaticNestedClass { void display() {
 * System.out.println("Outer static variable: " + outerStaticVar); } }
 * 
 * public static void main(String[] args) { // Create an instance of the static
 * nested class StaticNestedClass nested = new StaticNestedClass();
 * nested.display(); } }
 */
