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
        Path fileName = Path.of("maketestfile1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(expectedOutput, links);
    }

    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("maketestfile2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(expectedOutput, links);
    }

    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("maketestfile3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);


        assertEquals(expectedOutput, links);
    }


}
