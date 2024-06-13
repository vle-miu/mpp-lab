package lecture2.prob2A;

public class GradeReport {

    private Integer Id;

    private Float grade;

    private Student student;

    GradeReport(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public Float getGrade() {
        return grade;
    }
}
