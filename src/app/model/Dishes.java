package app.model;

import java.util.ArrayList;
import java.util.List;

public class Dishes {
    public List<Starter>items;
    public List<MainCourse>mainCourses;
    public List<Desert>deserts;


    @Override
    public String toString() {
        return "Dishes{" +
                "items=" + items +
                ", mainCourses=" + mainCourses +
                ", deserts=" + deserts +
                '}';
    }
}
