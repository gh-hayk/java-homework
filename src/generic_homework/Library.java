package generic_homework;

import java.util.ArrayList;
import java.util.List;
/*
6.Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
Provide one version of the class that uses generics and one that does not. Feel free to use any additional APIs for storing and retrieving the media.
 */
class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}

class Book extends Media {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + " / " + author;
    }
}

class Video extends Media {
    private int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Video: " + title + " (" + duration + " min)";
    }
}

class Newspaper extends Media {
    private String date;

    public Newspaper(String title, String date) {
        super(title);
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspaper: " + title + " [" + date + "]";
    }
}

class Library<T extends Media> {
    private List<T> collection = new ArrayList<>();

    public void add(T item) {
        collection.add(item);
    }

    public T get(int index) {
        return collection.get(index);
    }

    public int size() {
        return collection.size();
    }

    public void printAll() {
        for (T item : collection)
            System.out.println(item);
    }

    static class LibraryNoGenerics {
        private List<Object> collection = new ArrayList<>();

        public void add(Object item) {
            collection.add(item);
        }

        public Object get(int index) {
            return collection.get(index);
        }

        public void printAll() {
            for (Object item : collection)
                System.out.println(item);
        }
    }


    public static void main(String[] args) {
        System.out.println("With Generic");
        Library<Book> bookLab = new Library<>();
        bookLab.add(new Book("Harry Potter", "J.K. Rowling"));
        bookLab.printAll();

        Library<Video> videoLab = new Library<>();
        videoLab.add(new Video("Inception", 148));
        videoLab.printAll();

        Library<Newspaper> newslab = new Library<>();
        newslab.add(new Newspaper("Azg", "2024-01-01"));
        newslab.printAll();

        System.out.println();

        System.out.println("Not generic");
        LibraryNoGenerics mixedLib = new LibraryNoGenerics();
        mixedLib.add(new Book("1984", "Orwell"));
        mixedLib.add(new Video("Interstellar", 169));
        mixedLib.add(new Newspaper("Azg", "2024-01-01"));
        mixedLib.printAll();
    }


}


