import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // PART 1
        for(int i = 0; i <= 12; i++){
            System.out.println("7 x " + i + " = " + (7*i));
        }

        // PART 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum: " + sum);
        scanner.close();

        // PART 3
        for(int i = 5; i > 0; i--){
            String grade = "";
            if(i == 5){
                grade = "A";
            }
            else if(i == 4){
                grade = "B";
            }
            else if(i == 3){
                grade = "C";
            }
            else if(i == 2){
                grade = "D";
            }
            else{
                grade = "F";
            }
            System.out.println("Score: " + i + " is " + grade);
        }
    }
}
