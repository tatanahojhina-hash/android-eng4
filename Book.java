
public class Book { 
    private final String title; 
    private final int releaseYear; 
    private final String author; 
    private final int pages; 
 
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

    public int estimatePrice() { 
        int price = pages * 3; 
        return price < 250 ? 250 : price; 
    }

    @Override 
    public String toString() { 
        return "Book{" + 
                "title='" + title + '\'' + 
                ", releaseYear=" + releaseYear + 
                ", author='" + author + '\'' + 
                ", pages=" + pages + 
                '}'; 
    } 
}