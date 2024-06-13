package lecture5.prob3.data;

import java.util.HashMap;

public class AliceData implements Data {
    static HashMap<String, String> grades = new HashMap<>();
    static HashMap<String, String> remarks = new HashMap<>();

    static {
        grades.put("Chemistry", "A");
        grades.put("Math", "B+");
        grades.put("Language", "A-");
    }

    static {
        remarks.put("Ms Lane", "Alice was my best student this year.");
        remarks.put("Mr Thompson", "Alice tries very hard.");
        remarks.put("Ms Stevens", "Alice has a real feeling for languages.");
    }

    public HashMap<String, String> getGrades() {
        return grades;
    }

    public HashMap<String, String> getTeacherRemarks() {
        return remarks;
    }
}
