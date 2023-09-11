import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();


    /**
     * TODO: Переработать метод generateEmployee, метод должен генерировать
     *   случайного сотрудника типа Worker или Freelancer
     * @return
     */

    static int x = 0;


    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int[] age = new int[]{25, 33, 45, 58, 36, 42,21};
        int salaryIndexW = random.nextInt(500, 900);
        int salaryIndexF = random.nextInt(100, 130);

            if ( x == random.nextInt(0, 2)) {
                return new Worker(surnames[random.nextInt(surnames.length)],
                        names[random.nextInt(names.length)],
                        age[random.nextInt(age.length)], salaryIndexW * 100);

            } else {
                return new Freelancer(surnames[random.nextInt(surnames.length)],
                        names[random.nextInt(names.length)],
                        age[random.nextInt(age.length)], salaryIndexF *100);
            }
        }

    public static Employee[] generateEmployees(int counter) {

        Employee[] employees = new Employee[counter];

        for (int i = 0; i < employees.length; ++i) {
                employees[i] = generateEmployee();
            }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees);

        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
