/*package EntityList;
import Entity.Book;

public class BookList{
	private Book books[];
	
	public BookList(){
		books = new Book[5];
	}
	
	public BookList(int size){
		books = new Book[size];
	}
	
	public Book getById(String id){
		boolean flag = false;
		Book b = null;
		for(int i = 0;i<books.length;i++){
			if(books[i] != null){
				b = books[i];
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Book found!");
		}
		else{
			System.out.println("No book found with this ID.");
		}
		return b;
	}
	
	public void insert(Book b){
		boolean flag = false;
		for(int i = 0; i<books.length; i++){
			if(books[i] == null){
				books[i] = b;
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("A new book has been added!");
		}
		else{
			System.out.println("Book insertion failed.");
		}
	}
	
	public void deleteById(String id){
		boolean flag = false;
		for(int i = 0;i<books.length; i++){
			if(books[i] != null){
				if(books[i].getBookId().equals(id)){
					books[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Book Deleted Successfully.");
		}
		else{
			System.out.println("Book not found.");
		}
	}
	
	public void showAll(){
		for(int i = 0;i<books.length;i++){
			if(books[i] != null){
				books[i].showBookInfo();
			}
		}
	}
}*/
package EntityList;
import Entity.Book;

public class BookList{
	private Book books[];
	
	public BookList(){
		books = new Book[5];
	}
	
	public BookList(int size){
		books = new Book[size];
	}
	
	public Book getById(String id){
		boolean flag = false;
		Book b = null;
		for(int i = 0;i<books.length;i++){
			if(books[i] != null){
				if(books[i].getBookId().equals(id)){
					b = books[i];
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Book found!");
		}
		else{
			System.out.println("No book found with this ID.");
		}
		return b;
	}
	
	public void insert(Book b){
		boolean flag = false;
		for(int i = 0;i<books.length;i++){
			if(books[i] == null){
				books[i] = b;
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("New Book added to the List!");
		}
		else{
			System.out.println("Book Insertion failed.");
		}
	}
	
	public void deleteById(String id){
		boolean flag = false;
		for(int i = 0;i<books.length;i++){
			if(books[i] != null){
				if(books[i].getBookId().equals(id)){
					books[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Book successfully removed!");
		}
		else{
			System.out.println("No Book found with this ID.");
		}
	}
	
	public void showAll(){
		for(int i = 0;i<books.length;i++){
			if(books[i] != null){
				books[i].getBookAsString();
			}
		}
	}
	
	public String getAllAsString(){
		String allBooks = "";
		for(int i = 0;i<books.length;i++){
			if(books[i]!=null){
				allBooks += books[i].getBookAsString()+"\n";
			}
		}
		return allBooks;
	}
}