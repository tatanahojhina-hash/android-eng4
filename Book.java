// Book.java 
public class Book { 
    private String title; 
    private int releaseYear; 
    private String author; 
    private int pages; 
 
    public Book(String title, int releaseYear, String author, int pages) { 
        this.title = title; 
        this.releaseYear = releaseYear; 
        this.author = author; 
        this.pages = pages; 
    }

    public boolean isBig() { 
        return pages > 500;
    }

    public boolean matches(String word) { 
        if (word == null) { 
            return false; 
        } 
        String wordLower = word.toLowerCase(); 
        return title.toLowerCase().contains(wordLower) || author.toLowerCase().contains(wordLower); 
    }