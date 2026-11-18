import java.util.Scanner;

public class StringTools {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversed = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        System.out.println("Reversed: " + reversed);

        if(word.equals(reversed)){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
        scanner.close();
    }
}