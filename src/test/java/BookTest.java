
import com.wangpeng.bms.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testPaperBook() {
        BookFactory bookFactory = new BookFactory();
        BookInfo bookInfo = new BookInfo();
        bookInfo.setMaterial("paper");
        bookInfo.setPageCount(100);
        Book book = bookFactory.createBook(bookInfo);
        assertEquals("paper", book.getMaterial());
        assertTrue(book instanceof PaperBook);
        PaperBook paperBook = (PaperBook) book;
        assertEquals(100, paperBook.getPageCount());
        assertEquals("paper", paperBook.getMaterial());
    }

    @Test
    public void testEBook() {
        BookFactory bookFactory = new BookFactory();
        BookInfo bookInfo = new BookInfo();
        bookInfo.setMaterial("digital");
        bookInfo.setFileSize(100);
        Book book = bookFactory.createBook(bookInfo);
        assertEquals("digital", book.getMaterial());
        assertTrue(book instanceof EBook);
        EBook eBook = (EBook) book;
        assertEquals(100, eBook.getFileSize());
        assertEquals("digital", eBook.getMaterial());
    }

    @Test
    public void testAudioBook() {
        BookFactory bookFactory = new BookFactory();
        BookInfo bookInfo = new BookInfo();
        bookInfo.setMaterial("audio");
        bookInfo.setNarrator("narrator");
        bookInfo.setDuration(100);
        Book book = bookFactory.createBook(bookInfo);
        assertEquals("audio", book.getMaterial());
        assertTrue(book instanceof AudioBook);
        AudioBook audioBook = (AudioBook) book;
        assertEquals("narrator", audioBook.getNarrator());
        assertEquals(100, audioBook.getDuration());
        assertEquals("audio", audioBook.getMaterial());
    }

}
