package org.example;

// Base Class
public class LibraryItem {
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Item: " + this.title + " by " + this.author + " (" + this.year + ")";
    }

    // Album Subclass
    public static class Album extends LibraryItem {
        protected int trackCount;

        public Album(String title, String author, int year, int trackCount) {
            super(title, author, year);
            this.trackCount = trackCount;
        }

        public int getTrackCount() {
            return trackCount;
        }

        @Override
        public String toString() {
            return "Album: " + this.title + " by " + this.author + " (" + this.year + ") - " + trackCount + " tracks";
        }
    }

    // Movie Subclass
    public static class Movie extends LibraryItem {
        protected int durationInMinutes;

        public Movie(String title, String author, int year, int durationInMinutes) {
            super(title, author, year);
            this.durationInMinutes = durationInMinutes;
        }

        public int getDurationInMinutes() {
            return durationInMinutes;
        }

        @Override
        public String toString() {
            return "Movie: " + title + " by " + author + " (" + this.year + ") - " + durationInMinutes + " minutes";
        }
    }

    // Book Subclass
    public static class Book extends LibraryItem {
        protected int pageCount;

        public Book(String title, String author, int year, int pageCount) {
            super(title, author, year);
            this.pageCount = pageCount;
        }

        public int getPageCount() {
            return pageCount;
        }

        @Override
        public String toString() {
            return "Book: " + title + " by " + author + " (" + this.year + ") - " + pageCount + " pages";
        }

        public void readBook() {
            System.out.println("Reading " + title + " by " + author + "... \nDone!");
        }
    }
}






