//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class MarkdownParse {
	public static ArrayList<String> getLinks(String markdown) {
		ArrayList<String> returnValue = new ArrayList<>();
		int currentIndex = 0;
           
        	while(currentIndex < markdown.length()) {
			int openBracket = markdown.indexOf("[", currentIndex);
			int openParen = markdown.indexOf("(", closeBracket);
			int closeBracket = markdown.indexOf("]", openBracket);
			int closeParen = markdown.indexOf(")", openParen);
			
		}
        	return returnValue;	
	}

	public static void main(String[] args) throws IOException {
        	Path fileName = Path.of(args[0]);
        	String content = Files.readString(fileName);
        	ArrayList<String> links = getLinks(content);
	    	System.out.println(links);
    	}
}
