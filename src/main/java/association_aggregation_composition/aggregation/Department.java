package association_aggregation_composition.aggregation;

import java.util.List;

public class Department {

    String deptName;
    private List<Student> students;

    Department(String deptName, List<Student> students) {
        this.deptName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
