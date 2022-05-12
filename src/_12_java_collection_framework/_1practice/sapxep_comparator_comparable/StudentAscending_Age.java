package _12_java_collection_framework._1practice.sapxep_comparator_comparable;

import java.util.Comparator;

public class StudentAscending_Age implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        double reuslt = o1.getAge() - o2.getAge();

        if (reuslt > 0) {
            return 1;
        } else if (reuslt < 0) {
            return -1;
        }
        return 0;
    }
}

