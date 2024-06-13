package lecture2.prob2A;

public class Student {

    private Integer studentId;

    private String name;

    private GradeReport gradeReport;

    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
