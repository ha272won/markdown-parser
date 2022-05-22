import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() throws IOException {
        Path testFile = Path.of("test-file.md");
	    String readFile = Files.readString(testFile);
        ArrayList<String> newList = MarkdownParse.getLinks(readFile);
        List<String> expectedList = List.of("https://something.com","some-page.html");
        assertEquals(expectedList,newList);
    }

    @Test
    public void test2() throws IOException {
        Path testFile = Path.of("test-file2.md");
	    String readFile = Files.readString(testFile);
        ArrayList<String> newList = MarkdownParse.getLinks(readFile);
        List<String> expectedList = List.of("https://something.com","some-page.html");
        assertEquals(expectedList,newList);
    }

    @Test
    public void test3() throws IOException {
        Path testFile = Path.of("test-file3.md");
	    String readFile = Files.readString(testFile);
        ArrayList<String> newList = MarkdownParse.getLinks(readFile);
        List<String> expectedList = List.of();
        assertEquals(expectedList,newList);
    }

    @Test
    public void test4() throws IOException {
        Path testFile = Path.of("test-file4.md");
	    String readFile = Files.readString(testFile);
        ArrayList<String> newList = MarkdownParse.getLinks(readFile);
        List<String> expectedList = List.of();
        assertEquals(expectedList,newList);
    }
	
    @Test
    public void testSnippet1() {
        List<String> expected = List.of("`google.com", "google.com", "ucsd.edu");
	List<String> actual = MarkdownParse.getLinks("Snippet1.md");
        assertEquals(expected, actual);
    }
	
    @Test
    public void testSnippet2() {
        List<String> expected = List.of("`a.com", "a.com(())", "example.com");
	List<String> actual = MarkdownParse.getLinks("Snippet2.md");
        assertEquals(expected, actual);
    }
	
    @Test
    public void testSnippet3() {
        List<String> expected = List.of("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/");
	List<String> actual = MarkdownParse.getLinks("Snippet3.md");
        assertEquals(expected, actual);
    }


}
