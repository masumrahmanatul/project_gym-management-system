package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import File.*;

public class LoginPage extends JFrame implements ActionListener{
	Font font35 = new Font("Bernard MT Condensed",Font.BOLD,35);
	Font font30 = new Font("cambria",Font.BOLD,30);
	Font font25 = new Font("MV Boli",Font.BOLD,25);
	Font font15 = new Font("cambria",Font.BOLD,15);
	Font agencyFB20 = new Font("Agency FB",Font.BOLD,20);
	
	JPanel logoPanel, loginPanel;
	JLabel logoLabel, welcomeLabel, title, loginLabel, usernameLabel, passwordLabel;
	JTextField usernameField;
	JPasswordField passwordField;
	JButton loginButton;
	
	public LoginPage(){
		super("Log In");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500, 200);
		this.setSize(920,650);
		this.getContentPane().setBackground(new Color(231, 232, 230));
		this.setLayout(null);
		
		logoLabel = new JLabel();
		logoLabel.setBounds(130, 200, 180, 180);
		ImageIcon logoImage = new ImageIcon("strength_factory.png");
		logoLabel.setIcon(logoImage);
		this.add(logoLabel);
		
		logoPanel = new JPanel();
		logoPanel.setBackground(Color.BLACK);
		logoPanel.setBounds(0, 0, 400, 620);
		this.add(logoPanel);
		
		title = new JLabel("STRENGTH FACTORY GYM");
		title.setBounds(480, 30, 500, 30);
		title.setForeground(Color.BLACK);
		title.setFont(font35);
		this.add(title);
		
		loginLabel = new JLabel("Login");
		loginLabel.setBounds(620, 120, 100, 35);
		loginLabel.setForeground(new Color(231, 232, 230));
		loginLabel.setFont(font30);
		this.add(loginLabel);
		
		usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(510, 230, 100, 30);
		usernameLabel.setForeground(new Color(231, 232, 230));
		usernameLabel.setFont(font15);
		this.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(610, 230, 200, 30);
		this.add(usernameField);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(510, 300, 100, 30);
		passwordLabel.setForeground(new Color(231, 232, 230));
		passwordLabel.setFont(font15);
		this.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(610, 300, 200, 30);
		passwordField.setEchoChar('*');
		this.add(passwordField);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(610, 370, 200, 50);
		loginButton.setForeground(Color.BLACK);
		loginButton.setBackground(Color.ORANGE);
		loginButton.setFont(agencyFB20);
		this.add(loginButton);
		loginButton.addActionListener(this);
		
		loginPanel = new JPanel();
		loginPanel.setBackground(Color.BLACK);
		loginPanel.setBounds(445, 100, 415, 430);
		this.add(loginPanel);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		String uname = usernameField.getText();
		String pass = new String(passwordField.getPassword());
		
		if(FileIO.checkUser(uname, pass)){
			JOptionPane.showMessageDialog(this, "WELCOME!");
			HomePage hmp = new HomePage();
			this.setVisible(false);
		}
		else{
			JOptionPane.showMessageDialog(this, "Invalid Credentials!", "ERROR!!", JOptionPane.ERROR_MESSAGE);
		}
	}
}