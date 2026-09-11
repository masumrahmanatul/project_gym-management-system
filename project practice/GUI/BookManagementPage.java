package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;
import EntityList.*;

public class BookManagementPage extends JFrame implements ActionListener{
	Font font20 = new Font("cambria",Font.BOLD,20);
	Font font15 = new Font("cambria",Font.BOLD,15);
	
	JLabel title, subTitle, idLabel, nameLabel, authorLabel, typeLabel, copyLabel, 
	searchLabel, deleteLabel;
	JTextField idField, nameField, authorField, typeField, copyField, searchField,
	deleteField;
	JButton addbtn, updatebtn, searchbtn, delbtn, showAllbtn, clearScreenbtn;
	JTextArea screen;
	
	BookList bookList = new BookList(1000);
	
	public BookManagementPage(){
		super("Book Management Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,550);
		this.setLocation(650,250);
		this.getContentPane().setBackground(new Color(235, 237, 237));
		this.setLayout(null);
		
		title = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		title.setBounds(140,10,350,50);
		title.setForeground(Color.BLACK);
		title.setFont(font20);
		this.add(title);
		
		subTitle = new JLabel("BOOK INFORMATIONS");
		subTitle.setBounds(210,60,250,30);
		subTitle.setForeground(Color.BLACK);
		subTitle.setFont(font15);
		this.add(subTitle);
		
		idLabel = new JLabel("Book ID");
		idLabel.setBounds(10,60,100,30);
		idLabel.setForeground(Color.BLACK);
		idLabel.setFont(font15);
		this.add(idLabel);
		
		idField = new JTextField();
		idField.setBounds(10,90,140,30);
		idField.setForeground(Color.BLACK);
		idField.setBackground(Color.WHITE);
		idField.setFont(font15);
		this.add(idField);
		
		nameLabel = new JLabel("Book Name");
		nameLabel.setBounds(10,130,100,30);
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(font15);
		this.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(10,160,140,30);
		nameField.setForeground(Color.BLACK);
		nameField.setFont(font15);
		this.add(nameField);
		
		authorLabel = new JLabel("Author Name");
		authorLabel.setBounds(10,200,100,30);
		authorLabel.setForeground(Color.BLACK);
		authorLabel.setFont(font15);
		this.add(authorLabel);
		
		authorField = new JTextField();
		authorField.setBounds(10,230,140,30);
		authorField.setForeground(Color.BLACK);
		authorField.setFont(font15);
		this.add(authorField);
		
		typeLabel = new JLabel("Book Type");
		typeLabel.setBounds(10,270,100,30);
		typeLabel.setForeground(Color.BLACK);
		typeLabel.setFont(font15);
		this.add(typeLabel);
		
		typeField = new JTextField();
		typeField.setBounds(10,300,140,30);
		typeField.setForeground(Color.BLACK);
		typeField.setFont(font15);
		this.add(typeField);
		
		copyLabel = new JLabel("Book Copy");
		copyLabel.setBounds(10,340,100,30);
		copyLabel.setForeground(Color.BLACK);
		copyLabel.setFont(font15);
		this.add(copyLabel);
		
		copyField = new JTextField();
		copyField.setBounds(10,370,140,30);
		copyField.setForeground(Color.BLACK);
		copyField.setFont(font15);
		this.add(copyField);
		
		searchLabel = new JLabel("Search Book By ID");
		searchLabel.setBounds(430,60,150,30);
		searchLabel.setForeground(Color.BLACK);
		searchLabel.setFont(font15);
		this.add(searchLabel);
		
		searchField = new JTextField();
		searchField.setBounds(430,90,140,30);
		searchField.setForeground(Color.BLACK);
		searchField.setFont(font15);
		this.add(searchField);
		
		deleteLabel = new JLabel("Delete Book By ID");
		deleteLabel.setBounds(430,160,150,30);
		deleteLabel.setForeground(Color.BLACK);
		deleteLabel.setFont(font15);
		this.add(deleteLabel);
		
		deleteField = new JTextField();
		deleteField.setBounds(430,190,140,30);
		deleteField.setForeground(Color.BLACK);
		deleteField.setFont(font15);
		this.add(deleteField);
		
		addbtn = new JButton("ADD");
		addbtn.setBounds(10,425,140,30);
		addbtn.setForeground(Color.BLACK);
		addbtn.setBackground(Color.GREEN);
		addbtn.setFont(font15);
		this.add(addbtn);
		addbtn.addActionListener(this);
		
		updatebtn = new JButton("UPDATE");
		updatebtn.setBounds(10,465,140,30);
		updatebtn.setForeground(Color.WHITE);
		updatebtn.setBackground(Color.BLUE);
		updatebtn.setFont(font15);
		this.add(updatebtn);
		updatebtn.addActionListener(this);
		
		searchbtn = new JButton("SEARCH");
		searchbtn.setBounds(430,125,140,30);
		searchbtn.setForeground(Color.BLACK);
		searchbtn.setBackground(Color.YELLOW);
		searchbtn.setFont(font15);
		this.add(searchbtn);
		searchbtn.addActionListener(this);
		
		delbtn = new JButton("DELETE");
		delbtn.setBounds(430,225,140,30);
		delbtn.setForeground(Color.BLACK);
		delbtn.setBackground(Color.RED);
		delbtn.setFont(font15);
		this.add(delbtn);
		delbtn.addActionListener(this);
		
		showAllbtn = new JButton("SHOW ALL");
		showAllbtn.setBounds(430,425,140,30);
		showAllbtn.setForeground(Color.BLACK);
		showAllbtn.setBackground(Color.PINK);
		showAllbtn.setFont(font15);
		this.add(showAllbtn);
		showAllbtn.addActionListener(this);
		
		clearScreenbtn = new JButton("CLEAR SCREEN");
		clearScreenbtn.setBounds(430,465,140,30);
		clearScreenbtn.setForeground(Color.WHITE);
		clearScreenbtn.setBackground(Color.BLACK);
		clearScreenbtn.setFont(font15);
		this.add(clearScreenbtn);
		clearScreenbtn.addActionListener(this);
		
		screen = new JTextArea();
		screen.setForeground(Color.BLACK);
		screen.setBackground(Color.WHITE);
		screen.setFont(font15);
		screen.setEditable(false);
		
		JScrollPane jsp = new JScrollPane(screen);
		jsp.setBounds(160,90,260,375);
		this.add(jsp);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(addbtn == e.getSource()){
			System.out.println("You've clicked Add Button.");
			String id = idField.getText();
			String name = nameField.getText();
			String author = authorField.getText();
			String type = typeField.getText();
			int copy = Integer.parseInt(copyField.getText());
			
			Book b = bookList.getById(id);
			if(b==null){
				bookList.insert(new Book(id, name, author, type, copy));
				screen.setText(bookList.getAllAsString());
			}
			else{
				JOptionPane.showMessageDialog(this, "Book ID already Used", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(updatebtn == e.getSource()){
			System.out.println("You've clicked Update Button.");
			Book b = bookList.getById(idField.getText());
			if(b!=null){
				if(nameField.getText().length()>=2){
					b.setBookName(nameField.getText());
				}
				if(!authorField.getText().isEmpty()){
					b.setBookAuthor(authorField.getText());
				}
				if(!typeField.getText().isEmpty()){
					b.setBookType(typeField.getText());
				}
				if(!copyField.getText().isEmpty()){
					b.setBookCopy(Integer.parseInt(copyField.getText()));
				}
				screen.setText(bookList.getAllAsString());
			}
			else{
				JOptionPane.showMessageDialog(this, "No Book Found With This ID", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(searchbtn == e.getSource()){
			System.out.println("You've clicked Search Button.");
			Book b = bookList.getById(searchField.getText());
			if(b!=null){
				screen.setText(b.getBookAsString());
			}
			else{
				JOptionPane.showMessageDialog(this,"No Book Found With This ID", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(delbtn == e.getSource()){
			System.out.println("You've clicked Delete Button.");
			Book b = bookList.getById(deleteField.getText());
			if(b!=null){
				int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?");
				if(option == JOptionPane.YES_OPTION){
					bookList.deleteById(deleteField.getText());
					screen.setText(bookList.getAllAsString());
					JOptionPane.showMessageDialog(this,"Book Deleted");
				}
			}
			else{
				JOptionPane.showMessageDialog(this, "No Book Found with this ID", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(showAllbtn == e.getSource()){
			System.out.println("You've clicked The Show All Button.");
			screen.setText(bookList.getAllAsString());
		}
		else if(clearScreenbtn == e.getSource()){
			System.out.println("You've clicked the Clear Screen Button.");
			screen.setText("");
		}
	}
}