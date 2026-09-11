package EntityList;
import Entity.Administrator;

public class AdministratorList{
	private Administrator administrators[];
	
	public AdministratorList(){
		administrators = new Administrator[5];
	}
	
	public AdministratorList(int size){
		administrators = new Administrator[size];
	}
	
	public Administrator getById(String id){
		boolean flag = false;
		Administrator a = null;
		for(int i = 0; i<administrators.length; i++){
			if(administrators[i] != null){
				if(administrators[i].getAdminId().equals(id)){
					a = administrators[i];
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("There is an Admin with this ID.");
		}
		else{
			System.out.println("No Admin found with this ID.");
		}
		return a;
	}
	
	public void insert(Administrator a){
		boolean flag = false;
		for(int i = 0;i<administrators.length;i++){
			if(administrators[i] == null){
				administrators[i] = a;
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("A new Admin has been added!");
		}
		else{
			System.out.println("Admin insertion failed.");
		}
	}
	
	public void deleteById(String id){
		boolean flag = false;
		for(int i = 0;i<administrators.length;i++){
			if(administrators[i] != null){
				if(administrators[i].getAdminId().equals(id)){
					administrators[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Admin with the ID: "+id+" was removed.");
		}
		else{
			System.out.println("No admin found with the ID: "+id);
		}
	}
	
	public void showAll(){
		for(int i = 0;i<administrators.length;i++){
			if(administrators[i]!=null){
				administrators[i].getAdminAsString();
			}
		}
	}
	
	public String getAllAsString(){
		String allAdmins = "";
		for(int i = 0;i<administrators.length;i++){
			if(administrators[i]!=null){
				allAdmins += administrators[i].getAdminAsString()+"\n";
			}
		}
		return allAdmins;
	}
}