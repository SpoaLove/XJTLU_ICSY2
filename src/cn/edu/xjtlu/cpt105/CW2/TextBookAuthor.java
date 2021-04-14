package cn.edu.xjtlu.cpt105.CW2;
/*
 * CW2.2 Lab-Group-05
 */

// The TextBookAuthor class stores information of a textbook
//     including the name of the author
public class TextBookAuthor extends TextBook {
    
    // Do not modify or add the instance variables
    private String author;


    // CW2.2 Lab-Group-05 Question 3
    // Complete the constructor of the class TextBookAuthor
    // It initializes all its instance variables    
    public TextBookAuthor(String title, String edition, String author, double price) {
        super(title, edition, price);
    }


    // CW2.2 Lab-Group-05 Question 4
    // Complete the method newer
    // It returns true iff both textbooks have the same title, the same author,
    //     and this textbook is of newer edition than that of the other textbook
    public boolean newer(TextBookAuthor other) {
       return this.getTitle() == other.getTitle()
               && this.author == other.author
               && this.getEdition().compareTo(other.getEdition()) > 0;
    }
    
    
    // Test Client
    public static void main(String[] args) {
        TextBookAuthor textBook1 = new TextBookAuthor("Intro Java", "2nd edition", "Andrew", 200.0);
        
        TextBookAuthor textBook2 = new TextBookAuthor("Intro Java", "1st edition", "Andrew", 150.0);
        System.out.println(textBook1.newer(textBook2));     // true
        
        TextBookAuthor textBook3 = new TextBookAuthor("Intro Java", "1st edition", "XiaoHui", 150.0);
        System.out.println(textBook1.newer(textBook3));     // false
    }
}
