// KCT 2015
// This program is a demo to show how dynamic binding works.

package newPackage;
public class DynamicBindingDemo {
  public static void main(String[] args) {
	// implicit casting
  Object o = new ManagementEmployee(); 
	
	Object o1 = new Object();
	
	if (o1 instanceof ManagementEmployee) {
	  System.out.println("Never got here");
    // explicit casting
	  ManagementEmployee me = (ManagementEmployee)o1; 
	}
	
    m(o);
    m(new Employee());
    m(new Person());
    m(new Object());
  }

  public static void m(Object x) {
    System.out.println(x.toString());
  }
}

class ManagementEmployee extends Employee {
}

class Employee extends Person {
  public String toString() {
    return "Employee";
  }
}

class Person extends Object {
  public String toString() {
    return "Person";
  }
}
