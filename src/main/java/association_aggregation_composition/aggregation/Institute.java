package association_aggregation_composition.aggregation;

import java.util.List;

public class Institute {

    String instituteName;
    private List<Department> departments;

    Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInInstitute() {
        int numberOfStudents = 0;
        List<Student> students;
        for (Department dept : departments) {
            students = dept.getStudents();
            for (Student s : students) {
                numberOfStudents++;
            }
        }
        return numberOfStudents;
    }
}
