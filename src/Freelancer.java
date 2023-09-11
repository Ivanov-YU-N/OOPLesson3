public class Freelancer extends Employee {

    public Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 24;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d; Специалист; Заработная плата: %.2f",
                surName, name, age, calculateSalary());
    }
}
