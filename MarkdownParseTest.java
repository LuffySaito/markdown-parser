import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://something.com","some-thing.html"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testMyFile1() throws IOException{
        Path fileName = Path.of("mytest-file1.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://test1.com", "https://test2.com","https://test3.com","https://some-thing.html"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testMyFile2() throws IOException{
        Path fileName = Path.of("mytest-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testMyFile3() throws IOException{
        Path fileName = Path.of("mytest-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://something.com","some-page.html"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("page.com"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("page.com"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a link on the first line"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

}
