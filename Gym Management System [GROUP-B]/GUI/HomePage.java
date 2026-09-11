package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener{
	Font go = new Font("Bauhaus 93", Font.BOLD, 40);
	Font or = new Font("Bernard MT Condensed", Font.BOLD, 45);
	Font buttonFont = new Font("Agency FB", Font.BOLD, 23);
	
	JPanel mottoPanel;
	JLabel imageLabel, motto_go1, motto_or, motto_go2;
	JButton ampButton, smpButton, tmpButton, mmpButton, backButton;
	
	public HomePage(){
		super("Home Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500,200);
		this.setSize(920,650);
		this.getContentPane().setBackground(new Color(61, 61, 61));
		this.setLayout(null);
		
		/*imageLabel = new JLabel();
		imageLabel.setBounds(100, 100, 100, 100);
		ImageIcon image = new ImageIcon("download.png");
		imageLabel.setIcon(image);
		this.add(imageLabel);*/
		
		backButton = new JButton("Back");
		backButton.setBounds(50, 50, 100, 30);
		backButton.setBackground(Color.ORANGE);
		backButton.setFont(buttonFont);
		this.add(backButton);
		backButton.addActionListener(this);
		
		ampButton = new JButton("Admin Page");
		ampButton.setBounds(325, 170, 250, 30);
		ampButton.setBackground(Color.ORANGE);
		ampButton.setFont(buttonFont);
		this.add(ampButton);
		ampButton.addActionListener(this);
		
		smpButton = new JButton("Staff Page");
		smpButton.setBounds(325, 220, 250, 30);
		smpButton.setBackground(Color.ORANGE);
		smpButton.setFont(buttonFont);
		this.add(smpButton);
		smpButton.addActionListener(this);
		
		tmpButton = new JButton("Trainer Page");
		tmpButton.setBounds(325, 270, 250, 30);
		tmpButton.setBackground(Color.ORANGE);
		tmpButton.setFont(buttonFont);
		this.add(tmpButton);
		tmpButton.addActionListener(this);
		
		mmpButton = new JButton("Member Page");
		mmpButton.setBounds(325, 320, 250, 30);
		mmpButton.setBackground(Color.ORANGE);
		mmpButton.setFont(buttonFont);
		this.add(mmpButton);
		mmpButton.addActionListener(this);
		
		motto_go1 = new JLabel("'GO HARD");
		motto_go1.setBounds(230, 499, 250, 40);
		motto_go1.setForeground(new Color(231, 232, 230));
		motto_go1.setFont(go);
		this.add(motto_go1);
		
		motto_or = new JLabel("OR");
		motto_or.setBounds(430, 490, 200, 40);
		motto_or.setForeground(new Color(231, 232, 230));
		motto_or.setFont(or);
		this.add(motto_or);
		
		motto_go2 = new JLabel("GO HOME'");
		motto_go2.setBounds(500, 499, 250, 40);
		motto_go2.setForeground(new Color(231, 232, 230));
		motto_go2.setFont(go);
		this.add(motto_go2);
		
		mottoPanel = new JPanel();
		mottoPanel.setBackground(Color.BLACK);
		mottoPanel.setBounds(0, 450, 910, 160);
		this.add(mottoPanel);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(ampButton == e.getSource()){
			System.out.println("You've clicked the Admin Page button.");
			AdminManagementPage amp = new AdminManagementPage();
			this.setVisible(false);
		}
		else if(smpButton == e.getSource()){
			System.out.println("You've clicked the Staff Page button.");
			StaffManagementPage smp = new StaffManagementPage();
			this.setVisible(false);
		}
		else if(tmpButton == e.getSource()){
			System.out.println("You've clicked the Trainer Page button.");
			TrainerManagementPage mmp = new TrainerManagementPage();
			this.setVisible(false);
		}
		else if(mmpButton == e.getSource()){
			System.out.println("You've clicked the Member Page button.");
			MemberManagmentPage mmp = new MemberManagmentPage();
			this.setVisible(false);
		}
		else if(backButton == e.getSource()){
			System.out.println("You've clicked the Back button.");
			new LoginPage();
			this.setVisible(false);
		}
	}
}