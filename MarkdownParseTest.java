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
    public void file1() throws IOException{
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("maketestfile1.md");
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        
        ArrayList<String> links = parse.getLinks(content);
            assertEquals(links.size(), 1);
            assertEquals(links.get(0), "https://something.com");
    }

    @Test
    public void file2() throws IOException{
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("maketestfile2.md");
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expectedLinks = new ArrayList<String>();

        ArrayList<String> links = parse.getLinks(content);
            assertEquals(links.size(), 2);
            assertEquals(links.get(0), "https://something.com");
            assertEquals(links.get(1), "some-thing.html");
    }

    @Test
    public void file3() throws IOException{
        MarkdownParse parse = new MarkdownParse();
        Path fileName = Path.of("maketestfile3.md");
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expectedLinks = new ArrayList<String>();
        
        ArrayList<String> links = parse.getLinks(content);
            assertEquals(links.size(), 1);
            assertEquals(links.get(0), "some-thing.html");
    }

}
