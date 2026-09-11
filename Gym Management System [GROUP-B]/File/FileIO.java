package File;
import java.io.*;
import java.util.Scanner;
import Entity.*;
import EntityList.*;

public class FileIO{
	public static boolean checkUser(String uname, String pass){
		try{
			Scanner fileSc = new Scanner(new File("./File/data/users.txt"));
			while(fileSc.hasNextLine()){
				String line = fileSc.nextLine();
				String data[] = line.split(";");
				if(data[0].equals(uname) && data[1].equals(pass)){
					return true;
				}
			}
			fileSc.close();
		}
		catch(Exception e){
			System.out.println("Cannot Read File.");
		}
		return false;
	}
	
	public static void saveAdmin(Administrator a){
		try{
			File file = new File("./File/data/admins.txt");
			FileWriter writer = new FileWriter(file,true);
			String line = a.getName()+";"+a.getAge()+";"+a.getGender()+";"+a.getRole()+";"+a.getAdminId() +"\n";
			
			writer.write(line);
			writer.flush();
			
			writer.close();
		}
		catch(Exception e){
			System.out.println("Cannot Write on file.");
		}
	}
	
	public static void loadAdminFromFile(AdministratorList administratorList){
		try{
			Scanner fileSc = new Scanner(new File("./File/data/admins.txt"));
			while(fileSc.hasNextLine()){
				String line = fileSc.nextLine();
				String data[] = line.split(";");
				
				Administrator a = new Administrator(data[0], Integer.parseInt(data[1]), data[2].charAt(0), data[3], data[4]);
				administratorList.insert(a);
			}
			fileSc.close();
		}
		catch(Exception e){
			System.out.println("Cannot read file");
		}
	}
	
	public static void saveStaff(Staff a){
		try{
			File file = new File("./File/data/staffs.txt");
			FileWriter writer = new FileWriter(file,true);
			String line = a.getName()+";"+a.getAge()+";"+a.getGender()+";"+a.getRole()+";"+a.getStaffId() +"\n";
			
			writer.write(line);
			writer.flush();
			
			writer.close();
		}
		catch(Exception e){
			System.out.println("Cannot Write on file.");
		}
	}
	
	public static void loadStaffFromFile(StaffList staffList){
		try{
			Scanner fileSc = new Scanner(new File("./File/data/staffs.txt"));
			while(fileSc.hasNextLine()){
				String line = fileSc.nextLine();
				String data[] = line.split(";");
				
				Staff a = new Staff(data[0], Integer.parseInt(data[1]), data[2].charAt(0), data[3], data[4]);
				staffList.insert(a);
			}
			fileSc.close();
		}
		catch(Exception e){
			System.out.println("Cannot read file");
		}
	}
}