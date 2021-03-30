package association_aggregation_composition.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationApplication {

    public static void main(String[] args) {
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("John", 2, "CSE");
        Student s3 = new Student("Dan", 1, "EE");
        Student s4 = new Student("Ana", 2, "EE");
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
        List<Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department cse = new Department("CSE", cse_students);
        Department ee = new Department("EE", ee_students);
        List<Department> departments = new ArrayList<Department>();
        departments.add(cse);
        departments.add(ee);

        Institute institute = new Institute("BIT", departments);
        System.out.print("Total students in institute: ");
        System.out.println(institute.getTotalStudentsInInstitute());

    }
}
