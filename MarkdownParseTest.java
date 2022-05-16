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

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expectedList = List.of("https://something.com", "some-thing.html");
        assertEquals(expectedOutput, links);
    }

    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expectedList = List.of("https://something.com", "some-thing.html");
        assertEquals(expectedOutput, links);
    }

    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expectedList = List.of("https://something.com", "some-thing.html");
        assertEquals(expectedOutput, links);
    }
    
    
    @Test
    public void test4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expectedList = List.of("https://something.com", "some-thing.html");
        assertEquals(expectedOutput, links);
    }


}
