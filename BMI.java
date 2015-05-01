//package chapter10;
package newpackage;
public class BMI {
  private String name;
  private int age;
  private int weight; // in pounds
  private int height; // in inches
  
  
  public BMI(String name, int age, int weight, int height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }
  
  public BMI(String name, int weight, int height) {
    this(name, 20, weight, height);
  }
  
  public double getBMI() {
    double bmi = weight / Math.pow(height, 2) * 703;
    return bmi;
  }
  
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Time to Lose Weight";
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public double getWeight() {
    return weight;
  }
  
  public double getHeight() {
    return height;
  }
}
