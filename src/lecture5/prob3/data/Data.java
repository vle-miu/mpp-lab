package lecture5.prob3.data;

import java.util.HashMap;

public interface Data {
    static HashMap<String, Data> dataMap = new HashMap<String, Data>() {
        final static long serialVersionUID = 1L;

        {
            put("Alice", new AliceData());
            put("Joe", new JoeData());
        }
    };

    HashMap<String, String> getGrades();

    HashMap<String, String> getTeacherRemarks();
}
