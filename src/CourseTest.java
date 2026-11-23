public class CourseTest {
    public static void main(String[] args) {
        Course course1 = new Course("GST 111", "Communication in English", 2, 80);
        Course course2 = new Course("MTH 1O3", "Elementary Mathematics III", 2, 72);

        course1.setScore(99);
        course1.setUnit(0);

        System.out.println(course1);
        System.out.println(course2);
    }
}
