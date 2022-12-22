package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrate use of the Stream class for filtering data and
 * performing grouping by operations.
 */
public class ProfessorsQueries {

    private static void averageSalaryByDepartment(List<Professor> professors) {
        System.out.println("\nComputing the average salary per department");
        professors
                .stream()
                .collect(Collectors.groupingBy(
                        Professor::getDepartment,
                        Collectors.averagingDouble(Professor::getSalary)))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void numProfessorsByDepartment(List<Professor> professors) {
        System.out.println("\nComputing the number of professors per department");
        professors
                .stream()
                .collect(Collectors.groupingBy(
                        Professor::getDepartment, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void salaryQuery(List<Professor> professors) {
        System.out.println("\nComputing the professors with salary greater than 50000");
        professors.stream()
                .filter(professor -> professor.getSalary() > 50000)
                .forEach(System.out::println);
    }

    private static void salaryNameQuery(List<Professor> professors) {
        System.out.println("\nPrinting the name of the professors with salary greater than 50000");
        professors.stream()
                .filter(professor -> professor.getSalary() > 50000)
                .map(p -> p.getName() + " " + p.getLastName())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Professor> professors = List.of(
                new Professor("Tom", "Dawson", 45000, "Physics"),
                new Professor("Kevin", "Alton", 50000, "Music"),
                new Professor("Lisa", "Smith", 55000, "Biology"),
                new Professor("Amit", "Doe", 58000, "Physics"));

        salaryQuery(professors);
        salaryNameQuery(professors);
        numProfessorsByDepartment(professors);
        averageSalaryByDepartment(professors);
    }
}

class Professor {
    private String name;
    private String lastName;
    private int salary;
    private String department;

    public Professor(String name, String lastName, int salary, String department) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int hashCode() {
        return name.hashCode() +
                lastName.hashCode() + department.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() == o.getClass()) {
            Professor op = (Professor) o;
            return name.equals(op.name) &&
                    lastName.equals(op.lastName)
                    && department.equals(op.department);
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ' ' + lastName + ": " + department;
    }

}
