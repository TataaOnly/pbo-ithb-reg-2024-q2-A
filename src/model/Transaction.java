package model;

public class Transaction extends Users {
    int user_id;
    int book_id;
    
    public Transaction(int id, String name, String email, String password, int user_id, int book_id) {
        super(id, name, email, password);
        this.user_id = user_id;
        this.book_id = book_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    
    // @Override
    // public String toString(){

    // }
}
