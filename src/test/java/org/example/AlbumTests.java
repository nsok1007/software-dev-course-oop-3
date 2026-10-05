package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTests {
    @Test
    public void testCreateAlbum() {
        LibraryItem.Album album = new LibraryItem.Album("The Dark Side of the Moon", "Pink Floyd", 1973, 10);
        assertEquals("The Dark Side of the Moon", album.getTitle());
        assertEquals("Pink Floyd", album.getAuthor());
        assertEquals(1973, album.getYear());
        assertEquals(10, album.getTrackCount());
    }

    @Test
    public void testAlbumToString() {
        LibraryItem.Album album = new LibraryItem.Album("The Dark Side of the Moon", "Pink Floyd", 1973, 10);
        assertEquals("Album: The Dark Side of the Moon by Pink Floyd (1973) - 10 tracks", album.toString());
    }
}
