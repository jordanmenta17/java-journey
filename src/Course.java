public class Course {

        private String code;
        private String title;
        private int unit;
        private int score;

    public Course(String code, String title, int unit, int score){
        this.code = code;
        this.title = title;
        setUnit(unit);
        setScore(score);
    }
    @Override
    public String toString(){
        return "Course code: " + this.code + " Course title: " + this.title + ", " + this.unit + " units" + " Your score: "  + this.score;
    }

    public String getCode(){
        return this.code;
    }
    public String getTitle(){
        return this.title;
    }
    public int getUnit(){
        return this.unit;
    }
    public int getScore(){
        return this.score;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setUnit(int unit){
        if(unit < 1){
            throw new IllegalArgumentException("Units must not be less than 1");
        }
        this.unit = unit;
    }
    public void setScore(int score){
        if(score < 0 || score > 100){
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        this.score = score;
    }
}
