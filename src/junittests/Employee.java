package junittests;

public class Employee {

   private String name;
   private double salary;
   private int age;
   
   /**
   * @return the name
   */
   public String getName() {
      return name;
   }
   /**
   * @param name the name to set
   */
   public void setName(String name) {
      this.name = name;
   }
   /**
   * @return the monthlySalary
   */
   public double getSalary() {
      return salary;
   }
   /**
   * @param monthlySalary the monthlySalary to set
   */
   public void setSalary(double s) {
      this.salary = s;
   }
   /**
   * @return the age
   */
   public int getAge() {
      return age;
   }
   /**
   * @param age the age to set
   */
   public void setAge(int age) {
   this.age = age;
   }
}

class EmpBusinessLogic {
   // Calculate the yearly salary of employee
   public double calculateYearlySalary(Employee employee){
      double yearlySalary=0;
      yearlySalary = employee.getSalary() * 12;
      return yearlySalary;
   }
}
