import static org.junit.Assert.*;
<<<<<<< HEAD
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-thing.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("./test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testLinkAtBeginning() {
        String contents= "[link title](a.com)";
        List<String> expect = List.of("a.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testSpaceInURL() {
        String contents = "[title](space in-url.com)";
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testSpaceAfterParen() {
        String contents = "[title]( space-in-url.com)";
        List<String> expect = List.of("space-in-url.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSpaceBeforeParen() {
        String contents = "[title]   (should-not-count.com)";
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testNestedParens() throws IOException {
        String contents = Files.readString(Path.of("test-parens-inside-link.md"));
        List<String> expect = List.of("something.com()", "something.com((()))", "something.com", "boring.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testMissingCloseParen() throws IOException {
        String contents = Files.readString(Path.of("test-missing-paren-plus-test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
=======
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


>>>>>>> 6c8ff7e9e145908a3caedc54547225a2867b1b4c
}
