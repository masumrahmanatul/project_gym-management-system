import java.util.Scanner;
import Entity.Administrator;
import EntityList.AdministratorList;

public class Start{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		Scanner cinLine = new Scanner(System.in);
		AdministratorList administratorList = new AdministratorList(100);
		
		while(true){
			System.out.println("1. Insert new Admin.");
			System.out.println("2. Delete an Admin by ID.");
			System.out.println("3. Show all Admins.");
			System.out.println("4. Show an Admin by ID.");
			System.out.println("0. Exit.");
			
			System.out.print("Enter a option: ");
			int option = cin.nextInt();
			
			if(option == 1){
				System.out.print("Admin ID: ");
				String id = cinLine.nextLine();
				System.out.print("Name: ");
				String name = cinLine.nextLine();
				System.out.print("Age: ");
				int age = cin.nextInt();
				System.out.print("Gender: ");
				char gender = cin.next().charAt(0);
				System.out.print("Role: ");
				String role = cinLine.nextLine();
				
				administratorList.insert(new Administrator(name, age, gender, role, id));
			}
			
			else if(option == 2){
				System.out.print("Enter an Admin ID to delete: ");
				String id = cinLine.nextLine();
				administratorList.deleteById(id);
			}
			
			else if(option == 3){
				administratorList.showAll();
			}
			
			else if(option == 4){
				System.out.print("Enter an ID: ");
				String id = cinLine.nextLine();
				Administrator a = administratorList.getById(id);
				if(a != null){
					a.showAdminInfo();
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