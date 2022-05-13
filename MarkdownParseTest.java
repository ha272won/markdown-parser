import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Files;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

public class MarkdownParseTest {
    @Test
    public void addition() { 
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testDefaultFile() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("https://something.com");
        expectedOutput.add("some-thing.html");

        assertEquals(expectedOutput, links);
    }

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("maketestfile1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("www.google.com");
        expectedOutput.add("www.youtube.com");
        expectedOutput.add("reddit.com");

        assertEquals(expectedOutput, links);
    }

    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("maketestfile2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("No links found");

        assertEquals(expectedOutput, links);
    }

    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("maketestfile3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("No links found");

        assertEquals(expectedOutput, links);
    }


}
