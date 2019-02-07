package JavaCourse_Section_9_Interfaces_Challenge;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
