public class Employee {
    public static final double MAX_SALARY = 40000.0;
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        if (salary > MAX_SALARY) {
            throw new InvalidEmployeeSalaryException("Maximum salary is : " + MAX_SALARY);
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}
