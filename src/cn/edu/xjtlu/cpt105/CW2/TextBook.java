package cn.edu.xjtlu.cpt105.CW2;
/*
 * CW2.2 Lab-Group-05
 */

// The TextBook class stores information of a textbook
public class TextBook {
    
    // Do not modify or add the instance variables
    private String title;
    // Assume edition can only be 1st, 2nd, 3rd, 4th, ..., 8th edition
    private String edition;
    private double price;
    
    // Do not modify this constructor
    // It initializes the three instance variables
    public TextBook(String title, String edition, double price) {        
        this.title = title;
        this.edition = edition;
        this.price = price;
    }
    
    // Do not modify this method
    // It returns the string representation of a Textbook object
    // in the format "title, edition, RMB price"
    @Override
    public String toString() {
        return title + ", " + edition + ", RMB " + price;
    }
    
    
    // CW2.2 Lab-Group-05 Question 1
    // Complete the method discount
    // It updates the price by reducing it by percentage percent
    public void discount(double percentage) {
        this.price *= 1-percentage;
    }
    
    
    // CW2.2 Lab-Group-05 Question 2
    // Complete the method newer
    // It returns true iff both textbooks have the same title,
    //     and this textbook is of newer edition than that of the other textbook
    public boolean newer(TextBook other) {
        return this.title.equals(other.title) && this.edition.charAt(0) > other.edition.charAt(0);
    }

    public String getTitle() {
        return title;
    }

    public String getEdition() {
        return edition;
    }

    public double getPrice() {
        return price;
    }

    // Test Client
    public static void main(String[] args) {
        TextBook textBook1 = new TextBook("Intro Java", "2nd edition", 200.0);
        System.out.println(textBook1);     // Intro Java, 2nd edition, RMB 200.0
        textBook1.discount(10.0);
        System.out.println(textBook1);     // Intro Java, 2nd edition, RMB 180.0
        
        TextBook textBook2 = new TextBook("Intro Java", "1st edition", 150.0);
        System.out.println(textBook1.newer(textBook2));     // true
        System.out.println(textBook2.newer(textBook1));     // false
    }

}
