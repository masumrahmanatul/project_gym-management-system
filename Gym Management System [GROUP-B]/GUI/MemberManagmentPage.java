package GUI;
import Entity.*;
import EntityList.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemberManagmentPage extends JFrame implements ActionListener{
	Font font28 = new Font("Bernard MT Condensed", Font.BOLD, 28);
	Font font24 = new Font("Agency FB", Font.BOLD, 24);
	Font font20 = new Font("Agency FB", Font.BOLD, 20);
	
	MemberList memberList  = new MemberList(100);
	

	JLabel title, subTitle;
	JPanel panel1, panel2, panel3;
	JTextArea screen;
	JLabel idLabel, nameLabel, ageLabel, heightLabel, weightLabel, genderLabel, roleLabel, searchLabel,
	deleteLabel, imageLabel;
	JTextField idField, nameField, ageField, heightField, weightField, genderField, roleField, searchField,
	deleteField;
	JButton addButton, searchButton, deleteButton, showAllButton, clearScreenButton, updateButton;
   
	
	public MemberManagmentPage(){
		super("Member Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500,200);
		this.setSize(920,650);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		
		title = new JLabel("MEMBER");
		title.setBounds(310,10,275,50);
		title.setForeground(Color.WHITE);
		title.setFont(font28);
		this.add(title);
		
		panel1 = new JPanel();
		panel1.setBackground(new Color(37, 38, 38));
		panel1.setBounds(0,0, 1000, 80);
		this.add(panel1);
		
		subTitle = new JLabel(" ");
		subTitle.setBounds(150,70,250,50);
		subTitle.setForeground(Color.WHITE);
		subTitle.setFont(font24);
		this.add(subTitle);
		
		screen = new JTextArea();
		screen.setForeground(Color.WHITE);
		screen.setBackground(Color.BLACK);
		screen.setFont(font24);
		screen.setEditable(false);
		
		JScrollPane jsp = new JScrollPane(screen);
		jsp.setBounds(0,120, 450, 500);
		this.add(jsp);
		
		idLabel = new JLabel("Member ID:");
		idLabel.setBounds(490, 90, 100, 30);
		idLabel.setForeground(Color.WHITE);
		idLabel.setFont(font20);
		this.add(idLabel);
		
		idField = new JTextField();
		idField.setBounds(490, 120, 150, 30);
		idField.setForeground(Color.WHITE);
		idField.setBackground(Color.BLACK);
		idField.setFont(font20);
		this.add(idField);

		
		nameLabel = new JLabel("Member Name:");
		nameLabel.setBounds(490, 160, 100, 30);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(font20);
		this.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(490, 190, 150, 30);
		nameField.setForeground(Color.WHITE);
		nameField.setBackground(Color.BLACK);
		nameField.setFont(font20);
		this.add(nameField);
		
		ageLabel = new JLabel("Age:");
		ageLabel.setBounds(490, 230, 100, 30);
		ageLabel.setForeground(Color.WHITE);
		ageLabel.setFont(font20);
		this.add(ageLabel);
		
		ageField = new JTextField();
		ageField.setBounds(490, 260, 150, 30);
		ageField.setForeground(Color.WHITE);
		ageField.setBackground(Color.BLACK);
		ageField.setFont(font20);
		this.add(ageField);
		
        heightLabel = new JLabel("Height:");
        heightLabel.setBounds(490, 300, 100, 30);
        heightLabel.setForeground(Color.WHITE);
        heightLabel.setFont(font20);
        this.add(heightLabel);
		
        heightField = new JTextField();
        heightField.setBounds(490, 330, 150, 30);
        heightField.setForeground(Color.WHITE);
        heightField.setBackground(Color.BLACK);
        heightField.setFont(font20);
        this.add(heightField);

        weightLabel = new JLabel("Weight:");
        weightLabel.setBounds(490, 370, 100, 30);
        weightLabel.setForeground(Color.WHITE);
        weightLabel.setFont(font20);
        this.add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(490, 400, 150, 30);
        weightField.setForeground(Color.WHITE);
        weightField.setBackground(Color.BLACK);
        weightField.setFont(font20);
        this.add(weightField);

		genderLabel = new JLabel("Gender:");
		genderLabel.setBounds(490, 440, 100, 30);
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setFont(font20);
		this.add(genderLabel);
		
		genderField = new JTextField();
		genderField.setBounds(490, 470, 100, 30);
		genderField.setForeground(Color.WHITE);
		genderField.setBackground(Color.BLACK);
		genderField.setFont(font20);
		this.add(genderField);

		roleLabel = new JLabel("Role:");
		roleLabel.setBounds(490, 510, 100, 30);
		roleLabel.setForeground(Color.WHITE);
		roleLabel.setFont(font20);
		this.add(roleLabel);
		
	    roleField = new JTextField();
		roleField.setBounds(490, 540, 150, 30);
		roleField.setForeground(Color.WHITE);
		roleField.setBackground(Color.BLACK);
		roleField.setFont(font20);
		this.add(roleField);
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(50, 50, 50));
		panel2.setBounds(450, 70, 230, 550);
		this.add(panel2); 
		
		addButton = new JButton("ADD");
		addButton.setBounds(720, 90, 150, 30);
		addButton.setForeground(Color.BLACK);
		addButton.setBackground(Color.GREEN);
		addButton.setFont(font20);
		this.add(addButton);
		addButton.addActionListener(this);
		
		updateButton = new JButton("UPDATE");
		updateButton.setBounds(720, 130, 150, 40);
		updateButton.setForeground(Color.BLACK);
		updateButton.setBackground(new Color(57, 247, 228));
		updateButton.setFont(font20);
		this.add(updateButton);
		updateButton.addActionListener(this);
		
		searchLabel = new JLabel("Search By ID:");
		searchLabel.setBounds(720, 200, 100, 30);
		searchLabel.setForeground(Color.WHITE);
		searchLabel.setFont(font20);
		this.add(searchLabel);
		
		searchField = new JTextField();
		searchField.setBounds(720, 230, 150, 30);
		searchField.setForeground(Color.WHITE);
		searchField.setBackground(Color.BLACK);
		searchField.setFont(font20);
		this.add(searchField);
		
		searchButton = new JButton("SEARCH");
		searchButton.setBounds(720, 270, 150, 40);
		searchButton.setForeground(Color.BLACK);
		searchButton.setBackground(Color.YELLOW);
		searchButton.setFont(font20);
		this.add(searchButton);
		searchButton.addActionListener(this);
		
		deleteLabel = new JLabel("Delete By ID:");
		deleteLabel.setBounds(720, 330, 100, 30);
		deleteLabel.setForeground(Color.WHITE);
		deleteLabel.setFont(font20);
		this.add(deleteLabel);
		
		deleteField = new JTextField();
		deleteField.setBounds(720, 360, 150, 30);
		deleteField.setForeground(Color.WHITE);
		deleteField.setBackground(Color.BLACK);
		deleteField.setFont(font20);
		this.add(deleteField);
		
		deleteButton = new JButton("DELETE");
		deleteButton.setBounds(720, 400, 150, 40);
		deleteButton.setForeground(Color.BLACK);
		deleteButton.setBackground(Color.RED);
		deleteButton.setFont(font20);
		this.add(deleteButton);
		deleteButton.addActionListener(this);
		
		imageLabel = new JLabel();
		imageLabel.setBounds(720, 460, 180, 180);
		ImageIcon image = new ImageIcon("strength_factory.png");
		imageLabel.setIcon(image);
		this.add(imageLabel);
		
		showAllButton = new JButton("SHOW ALL");
		showAllButton.setBounds(720, 510, 150, 40);
		showAllButton.setForeground(Color.BLACK);
		showAllButton.setBackground(Color.ORANGE);
		showAllButton.setFont(font20);
		this.add(showAllButton);
		showAllButton.addActionListener(this);
		
		clearScreenButton = new JButton("CLEAR SCREEN");
		clearScreenButton.setBounds(720, 550, 150, 40);
		clearScreenButton.setForeground(Color.BLACK);
		clearScreenButton.setBackground(Color.WHITE);
		clearScreenButton.setFont(font20);
		this.add(clearScreenButton);
		clearScreenButton.addActionListener(this);
		
		this.setVisible(true);
	}
	
		public void actionPerformed(ActionEvent e){
		if(addButton == e.getSource()){
			System.out.println("You've clicked the Add Button!");
			String id = idField.getText();
			String name = nameField.getText();
			int age = Integer.parseInt(ageField.getText());
			char gender = genderField.getText().charAt(0);
			String role = roleField.getText();
			
			
			Member a = memberList.getById(id);
			if(a == null){
				memberList.insert(new Member(name, age, gender, role, id));
				screen.setText(memberList.getAllAsString());
			}
			else{
				JOptionPane.showMessageDialog(this, "ID already in use", "WARNING", JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(updateButton == e.getSource()){
			System.out.println("You've clicked the Update Button!");
			Member a = memberList.getById(idField.getText());
			if(a != null){
				if(nameField.getText().length()>=2){
					a.setName(nameField.getText());
				}
				else{
                   JOptionPane.showMessageDialog(this, "Please Provide Proper Informations.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}				
				if(!roleField.getText().isEmpty()){
					a.setRole(roleField.getText());
				}
				if(!ageField.getText().isEmpty()){
					a.setAge(Integer.parseInt(ageField.getText()));
				}
				if(genderField.getText().charAt(0)=='M' || genderField.getText().charAt(0)=='F'){
					a.setGender(genderField.getText().charAt(0));
                } else {
                JOptionPane.showMessageDialog(this, "Please select a gender.", "ERROR", JOptionPane.ERROR_MESSAGE);
               
                }
				screen.setText(memberList.getAllAsString());
			}
			else{
				JOptionPane.showMessageDialog(this, " No Member Found with this ID", "WARNING", JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(searchButton == e.getSource()){
			System.out.println("You've clicked the Search Button!");
			Member a = memberList.getById(searchField.getText());
			if(a!= null){
				screen.setText(a.getMemberAsString());
			}
			else{
				JOptionPane.showMessageDialog(this, "No Member Found wih this ID", "WARNING", JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(deleteButton == e.getSource()){
			System.out.println("You've clicked the Delete Button!");
			Member a = memberList.getById(deleteField.getText());
			if(a!= null){
				int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?");
				if(option == JOptionPane.YES_OPTION){
					memberList.deleteById(deleteField.getText());
					screen.setText(memberList.getAllAsString());
				}
				else{
					JOptionPane.showMessageDialog(this, " No Member Found with this ID");
				}
			}
		}
		else if(showAllButton == e.getSource()){
			System.out.println("You've clicked the Show All Button!");
			screen.setText(memberList.getAllAsString());
		}
		else if(clearScreenButton == e.getSource()){
			System.out.println("You've clicked the Clear Screen Button!");
			screen.setText("");
		}
	}
}