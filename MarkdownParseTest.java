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
    public void markdownTestFile1() throws IOException{
        MarkdownParse parse = new MarkdownParse();
        ArrayList<String> links;
        
    links = parse.getLinks(Files.readString(Path.of("maketestfile1.md")));
        assertEquals(links.size(), 1);
        assertEquals(links.get(0), "https://something.com");
    }

    @Test
    public void markdownTestFile2() throws IOException{
        MarkdownParse parse = new MarkdownParse();
        ArrayList<String> links;
        
    links = parse.getLinks(Files.readString(Path.of("maketestfile2.md")));
        assertEquals(links.size(), 2);
        assertEquals(links.get(0), "https://something.com");
        assertEquals(links.get(1), "some-thing.html");
    }

    @Test
    public void markdownTestFile3() throws IOException{
        MarkdownParse parse = new MarkdownParse();
        ArrayList<String> links;
        
        links = parse.getLinks(Files.readString(Path.of("maketestfile3.md")));
        assertEquals(links.size(), 1);
        assertEquals(links.get(0), "some-thing.html");
    }

}