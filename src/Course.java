public class Course {

        String code;
        String title;
        int unit;
        int score;

    public Course(String a, String b, int c, int d){
        this.code = a;
        this.title = b;
        this.unit = c;
        this.score = d;
    }
    @Override
    public String toString(){
        return "Course code: " + this.code + " Course title: " + this.title + ", " + this.unit + " units" + " Your score: "  + this.score;
    }
}
