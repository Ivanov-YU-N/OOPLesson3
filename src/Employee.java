public abstract class Employee implements Comparable<Employee>  {

    protected String surName;

    protected String name;
    protected Integer age;

    protected double salary;

    public abstract double calculateSalary();

    public Employee(String surName, String name, int age, double salary) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", surName, name, age);
    }

    @Override
    public int compareTo(Employee o) {
        int res = age.compareTo(o.age);
        if (res == 0){
            return surName.compareTo(o.surName);
        }
        return res;
    }

}
