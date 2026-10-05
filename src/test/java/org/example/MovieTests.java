package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTests {
    @Test
    public void testCreateMovie() {
        LibraryItem.Movie movie = new LibraryItem.Movie("The Dark Knight", "Christopher Nolan", 2008, 152);
        assertEquals("The Dark Knight", movie.getTitle());
        assertEquals("Christopher Nolan", movie.getAuthor());
        assertEquals(2008, movie.getYear());
        assertEquals(152, movie.getDurationInMinutes());
    }

    @Test
    public void testMovieToString() {
        LibraryItem.Movie movie = new LibraryItem.Movie("The Dark Knight", "Christopher Nolan", 2008, 152);
        assertEquals("Movie: The Dark Knight by Christopher Nolan (2008) - 152 minutes", movie.toString());
    }
}
