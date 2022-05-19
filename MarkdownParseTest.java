import static org.junit.Assert.*;
import org.junit.*;
<<<<<<< HEAD
import java.util.*;
import java.io.IOException;
import java.nio.file.*;
/**
 * This file is intended to test the functionalities of MarkDownParse.
 */
public class MarkdownParseTest {
    @Test
    public void addition() {
=======

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class MarkdownParseTest {
    @Test
    public void addition(){
>>>>>>> 367ed90edc6f0ee7a757a15d9ac96823049a2a45
        assertEquals(2, 1 + 1);
    }

    @Test
<<<<<<< HEAD
    public void testGetLinksForTestFile1() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("https://something.com",
        "some-page.html");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksForTestFile2() throws IOException {
        Path fileName = Path.of("testfile2.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("www.myspace.com",
        "www.facebook.com");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }
    @Test
    public void testGetLinksForTestFile3() throws IOException {
        Path fileName = Path.of("testfile3.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("www.speedrunners.com",
        "www.google.com");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksForTestFile4() throws IOException {
        Path fileName = Path.of("try-break.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of(
            "https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }
    @Test 
    public void testIfActualLink() throws IOException {
        Path fileName = Path.of("testfarlink.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
=======
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
>>>>>>> 367ed90edc6f0ee7a757a15d9ac96823049a2a45
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
<<<<<<< HEAD
    public void aFailingTestNowSuccessful() {
        assertEquals("https://www.youtube.com/watch?v=dQw4w9WgXcQ",
            "https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }

    @Test
    public void oneNewFailureInducingInput() throws IOException {
        Path fileName = Path.of("One-more-failure.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
        List<String> unexpected = List.of("Bruh");
        assertNotEquals(unexpected,MarkdownParse.getLinks(content));
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    //added test at review
    @Test
    public void testReviewTestFile1() throws IOException {
        Path fileName = Path.of("review-test-file1");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
=======
    public void testMyFile2() throws IOException{
        Path fileName = Path.of("mytest-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
>>>>>>> 367ed90edc6f0ee7a757a15d9ac96823049a2a45
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
<<<<<<< HEAD
    public void testReviewTestFile2() throws IOException {
        Path fileName = Path.of("review-test-file2");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    //lab report 4

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
=======
    public void testMyFile3() throws IOException{
        Path fileName = Path.of("mytest-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("somelink.com"));
>>>>>>> 367ed90edc6f0ee7a757a15d9ac96823049a2a45
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
<<<<<<< HEAD
    public void testSnippet2() throws IOException {
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
=======
    public void testMyFile4() throws IOException{
        Path fileName = Path.of("mytest-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
>>>>>>> 367ed90edc6f0ee7a757a15d9ac96823049a2a45
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
<<<<<<< HEAD
    public void testSnippet3() throws IOException {
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

=======
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
>>>>>>> 367ed90edc6f0ee7a757a15d9ac96823049a2a45
}
