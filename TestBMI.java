//package chapter10;
package newpackage;
public class TestBMI {
  public static void main(String[] args) {
      
    System.out.println("------------------------------------");
    
    BMI bmi1 = new BMI("Larry David", 45, 185, 75);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " " + "\n Your rating is: " + bmi1.getStatus());
    
    System.out.println("------------------------------------");
    
    BMI bmi2 = new BMI("Daria", 22, 125, 65);
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " " + "\n Your rating is: " + bmi2.getStatus());
    
    System.out.println("------------------------------------");
    
    BMI bmi3 = new BMI("Big John", 13, 275, 67);
    System.out.println("The BMI for " + bmi3.getName() + " is "
      + bmi3.getBMI() + " " + "\n Your rating is: " + bmi3.getStatus());
    
    System.out.println("------------------------------------");
  }
}
