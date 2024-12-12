package model;

public class Books {
    private int id;
    private String author;
    private String title;
    private String genre;
    private int price;

    public Books(int id, String author, String title, String genre, int price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    // @Override
    // public String toString(){
    //     return 
    // }
}
