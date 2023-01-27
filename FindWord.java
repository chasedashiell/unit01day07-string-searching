import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        // user input
        // find last index String.lastIndexOf();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence that you would like to search: ");
        String sentence = scanner.nextLine();
        String newSentence = " " + sentence + " ";
        System.out.println("Please enter the letter you would like to find the first word its in: ");
        String letter = scanner.nextLine();
        int indexOfLetter = newSentence.indexOf(letter);
        String letterToEnd = newSentence.substring(indexOfLetter);
        int nextIndexOf = letterToEnd.indexOf(" ");
        String begin = newSentence.substring(0, indexOfLetter);
        int indexOfFirstLetter = begin.lastIndexOf(" ");

        String beginWord = newSentence.substring(indexOfFirstLetter, indexOfLetter);

        String endWord = newSentence.substring(indexOfLetter, nextIndexOf);


        System.out.println(beginWord + endWord);
    }
}