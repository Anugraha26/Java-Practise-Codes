class Employee {
    int id;
    String name;
    double salary;
    double annualSalary() {
        return salary * 12;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 1;
        e.name = "Sam";
        e.salary = 30000;
        System.out.println("Annual Salary = " + e.annualSalary());
    }
}