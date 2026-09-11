/*import java.util.Scanner;
import Entity.*;
import EntityList.*;

public class Start{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		Scanner cinLine = new Scanner(System.in);
		BookList bookList = new BookList(100);
		
		while(true){
			System.out.println("1. Insert a new Book.");
			System.out.println("2. Delete a book by ID.");
			System.out.println("3. Update book stock by ID.");
			System.out.println("4. Show All Books.");
			System.out.println("5. Show a Book by ID.");
			System.out.println("0. Exit.");
			
			System.out.print("Enter an option: ");
			int option = cin.nextInt();
			
			if(option == 1){
				System.out.println("Data entry for new Book-");
				System.out.print("Enter Book ID: ");
				String id = cinLine.nextLine();
				System.out.print("Enter Book name: ");
				String name = cinLine.nextLine();
				System.out.print("Enter Book author name: ");
				String authorName = cinLine.nextLine();
				System.out.print("Enter Book Type: ");
				String bookType = cinLine.nextLine();
				System.out.print("Enter Book copy: ");
				int bookCopy = cin.nextInt();
				
				bookList.insert(new Book(id,name,authorName,bookType,bookCopy));
			}
			
			else if(option == 2){
				System.out.print("Enter Book ID to delete: ");
				String id = cinLine.nextLine();
				bookList.deleteById(id);
			}
			
			else if(option == 3){
				System.out.print("Enter Book ID to update: ");
				String id = cinLine.nextLine();
				Book b = bookList.getById(id);
				if(b!=null){
					System.out.print("Enter New Stock: ");
					int amount = cin.nextInt();
					b.addBookCopy(amount);
					System.out.println("Book Stock Updated ");
					b.showBookInfo();
				}
			}
			
			else if(option == 4){
				bookList.showAll();
			}
			
			else if(option == 5){
				System.out.print("Enter Book ID to search: ");
				String id = cinLine.nextLine();
				Book b = bookList.getById(id);
				if(b != null){
					b.showBookInfo();
				}
			}
			
			else if(option == 0){
				break;
			}
			
			else{
				System.out.println("Please Enter a valid option!");
			}
		}
	}
}*/
import java.util.Scanner;
import Entity.Book;
import EntityList.BookList;

public class Start{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		Scanner cinLine = new Scanner(System.in);
		BookList bookList = new BookList(100);
		
		while(true){
			System.out.println("1. Insert a Book.");
			System.out.println("2. Delete a Book by ID.");
			System.out.println("3. Update Book Stock by ID.");
			System.out.println("4. Show all Books.");
			System.out.println("5. Show a Book by ID.");
			System.out.println("0. Exit.");
			
			System.out.print("Enter a option: ");
			int option = cin.nextInt();
			
			if(option == 1){
				System.out.print("Enter Book ID: ");
				String id = cinLine.nextLine();
				System.out.print("Enter Book name: ");
				String name = cinLine.nextLine();
				System.out.print("Enter Author Name: ");
				String author = cinLine.nextLine();
				System.out.print("Enter Book Type: ");
				String type = cinLine.nextLine();
				System.out.print("Enter Book Copy: ");
				int copy = cin.nextInt();
				
				bookList.insert(new Book(id, name, author, type, copy));
			}
			
			else if(option == 2){
				System.out.print("Enter a Book ID to delete: ");
				String id = cinLine.nextLine();
				bookList.deleteById(id);
			}
			
			else if(option == 3){
				System.out.print("Enter a Book ID to update: ");
				String id = cinLine.nextLine();
				Book b = bookList.getById(id);
				if(b!=null){
					System.out.print("Enter new Stock: ");
					int amount = cin.nextInt();
					b.addBookCopy(amount);
					System.out.println("Book stock updated!");
					b.showBookInfo();
				}
			}
			
			else if(option == 4){
				bookList.showAll();
			}
			
			else if(option == 5){
				System.out.print("Enter a Book ID: ");
				String id = cinLine.nextLine();
				Book b = bookList.getById(id);
				if(b != null){
					b.showBookInfo();
				}
			}
			
			else if(option == 0){
				break;
			}
			
			else{
				System.out.println("Please Enter a Valid Option Number.");
			}
		}
	}
}