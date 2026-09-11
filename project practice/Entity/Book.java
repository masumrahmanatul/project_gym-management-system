package Entity;
public class Book{
	private String bookId;
	private String bookName;
	private String bookAuthor;
	private String bookType;
	private int bookCopy;
	
	private static int bookCounter = 0;
	
	public Book(){
		bookCounter++;
	}
	
	public Book(String bookId, String bookName, String bookAuthor, String bookType, int bookCopy){
		setBookId(bookId);
		setBookName(bookName);
		setBookAuthor(bookAuthor);
		setBookType(bookType);
		setBookCopy(bookCopy);
	}
	
	public void setBookId(String bookId){
		this.bookId = bookId;
	}
	
	public String getBookId(){
		return bookId;
	}
	
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
	public String getBookName(){
		return bookName;
	}
	
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookAuthor(){
		return bookAuthor;
	}
	
	public void setBookType(String bookType){
		this.bookType = bookType;
	}
	
	public String getBookType(){
		return bookType;
	}
	
	public void setBookCopy(int bookCopy){
		this.bookCopy = bookCopy;
	}
	
	public int getBookCopy(){
		return bookCopy;
	}
	
	public String getBookAsString(){
		return "-------------------------"+"\n"+
		"Book Name : "+bookName+"\n"+
		"Book Author : "+bookAuthor+"\n"+
		"Book Id : "+bookId+"\n"+
		"Book Type : "+bookType+"\n"+
		"Number of Book Copy : "+bookCopy+"\n"+
		"-------------------------"+"\n";
	}
	
	public void addBookCopy(int x){
		if(x>0){
			bookCopy += x;
		}
	}
	
	public static void totalNumberOfUniqueBooks(){
		System.out.println("Total Number Of Unique Books : " + bookCounter);
	}
}