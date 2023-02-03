// BUG: example 3 fails (looking for 'p' that's not present) because you don't do any error checking for nonexistent tags
import java.util.Scanner;

public class FindTagContents {
    public static void main(String[] args) {
        //gets input from user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the HTML you would like to search: ");
        String HTML = scanner.nextLine();
        System.out.println("Please enter the tag types contents you would like to search for (ex. b): ");
        String tag = scanner.nextLine();

        //finds first instance of the tag and prints where it was found.
        int firstIndexOfTag = HTML.indexOf(tag);
        System.out.println("Found " + tag + " at index " + firstIndexOfTag);

        int endIndexOfTag = HTML.indexOf("/" + tag);
        //finds the rough area
        String sub = HTML.substring(firstIndexOfTag, endIndexOfTag);

        // finishes it off
        String answer = sub.substring(sub.indexOf(">")+1, sub.indexOf("<"));
        System.out.println(answer);

        
    }
}