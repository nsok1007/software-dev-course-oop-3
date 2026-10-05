package org.example;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTests {
    @Test
    public void testBuildLibrary() {
        List<LibraryItem> library = new ArrayList<>();
        library.add(new LibraryItem.Book("The Catcher in the Rye", "J.D. Salinger", 1951, 234));
        library.add(new LibraryItem.Album("The Dark Side of the Moon", "Pink Floyd", 1973, 10));
        library.add(new LibraryItem.Movie("The Dark Knight", "Christopher Nolan", 2008, 152));

        assertEquals(3, library.size());
        assertEquals("Book: The Catcher in the Rye by J.D. Salinger (1951) - 234 pages", library.get(0).toString());
        assertEquals("Album: The Dark Side of the Moon by Pink Floyd (1973) - 10 tracks", library.get(1).toString());
        assertEquals("Movie: The Dark Knight by Christopher Nolan (2008) - 152 minutes", library.get(2).toString());
    }
}
