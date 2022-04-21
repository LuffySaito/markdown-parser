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
        assertEquals(2, 1+1);
    }

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://something.com","some-thing.html"));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
}
