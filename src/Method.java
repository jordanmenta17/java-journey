import java.util.Scanner;

public class Method {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
        System.out.println("Grade: " + letterGrade(score));
        System.out.println("Grade point: " + gradePoint(score));
    }
    static String letterGrade(int score){
        if(score >= 70){
            return "A";
        }
        else if(score >= 60){
            return "B";
        }
        else if(score >= 50){
            return "C";
        }
        else if(score >= 40){
            return "D";
        }
        else{
            return "F";
        }
    }
    static int gradePoint(int score){
        if(score >= 70){
            return 5;
        }
        else if(score >= 60){
            return 4;
        }
        else if(score >= 50){
            return 3;
        }
        else if(score >= 40){
            return 2;
        }
        else{
            return 0;
        }
    }
}
