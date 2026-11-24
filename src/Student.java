public class Student extends Person{
    private String matricNo;

    public Student(String name, String matricNo){
        super(name);
        this.matricNo = matricNo;
    }
    public String getMatricNo(){
        return matricNo;
    }
    @Override
    public String toString(){
        return getName() + "(" + matricNo + ")";
    }
}
