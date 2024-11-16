import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        triangularWords();
    }

    public static void triangularWords() {
        System.out.print("Enter a word: ");
        String word = stdin.nextLine();
        //String word = "SNOWFLAKES";
        //System.out.println(word);

        int row_length = 1;
        int start_index = 0;

        //String subStr = word.substring(0, 1);
        //System.out.println(subStr);

        while (start_index < word.length()) {
            int end_index = start_index + row_length;
            if (end_index <= word.length()) {
                String sub = word.substring(start_index, end_index);
                System.out.println(sub);
                start_index = end_index;
            } else {
                String sub = word.substring(start_index);
                System.out.println(sub);
                break;
            }
            row_length++;
        }
    }

}