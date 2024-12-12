package view;


import javax.swing.JFrame;


public class BookListMenu {
    public BookListMenu(){
        initBook();
    }

    private void initBook(){
        JFrame findFrame = new JFrame("Book List");

        findFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        findFrame.setSize(300, 150);
        findFrame.setLocationRelativeTo(null); 

        
    }
}
