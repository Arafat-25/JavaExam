// 1. Using empty string literal (most common and efficient)
String bookTitle = "";

// 2. Using String constructor (creates new object in heap)
String authorName = new String();

// Contextual example in book record initialization
public class BookRecord {
    private String title = "";       // First way
    private String author = new String();  // Second way
    
    // Constructor using first way
    public BookRecord() {
        this.title = "";
    }
}