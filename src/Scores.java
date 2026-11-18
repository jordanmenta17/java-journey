import java.util.Arrays;

public class Scores {
    public static void main(String[] args){
        // PART 1
        int[] scores = {80, 67, 70, 78, 72};
        for(int i=0; i < scores.length; i++){
            System.out.println(scores[i]);
        }
        //PART 2
        int highest = scores[0];
        int total = 0;

        for(int n : scores){
            if(n > scores[0]){
                highest = n;
            }
            total += n;
        }
        double average = total/scores.length;
        System.out.println("Highest: " + highest);
        System.out.println("Average: " + average);
    }
}
