package lecture2.prob2A;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(1, "VanNhatLe");
        GradeReport gradeReport = new GradeReport(student);

        System.out.println(student);
        System.out.println(gradeReport);
    }
}
