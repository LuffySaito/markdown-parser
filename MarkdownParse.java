//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/* Random change to test git commit and push on ieng6 */
public class MarkdownParse {
    static final int nonexistent = -1;

    /** 
    *   This method takes in a String and returns all the links within the 
        String.
    */
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            if(openBracket == nonexistent) {
                break;
            }
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            String inParen = markdown.substring(openParen + 1, closeParen);
            if(inParen.toLowerCase().endsWith(".jpg") || 
                inParen.toLowerCase().endsWith(".png") ||
                inParen.toLowerCase().endsWith(".pdf") ||
                ! inParen.contains(".") || 
                inParen.indexOf(".") == inParen.length()-1 
                ) {}
            else {
                toReturn.add(inParen);
            }
            currentIndex = closeParen + 1;
        }
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
        System.out.println("Next File");
    }
}
