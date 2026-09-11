package EntityList;
import Entity.Staff;

public class StaffList{
	private Staff staffs[];
	
	public StaffList(){
		staffs = new Staff[5];
	}
	
	public StaffList(int size){
		staffs = new Staff[size];
	}
	
	public Staff getById(String id){
		boolean flag = false;
		Staff a = null;
		for(int i = 0; i<staffs.length; i++){
			if(staffs[i] != null){
				if(staffs[i].getStaffId().equals(id)){
					a = staffs[i];
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("There is a Staff with this ID.");
		}
		else{
			System.out.println("No Staff with this ID.");
		}
		return a;
	}
	
	public void insert(Staff a){
		boolean flag = false;
		for(int i = 0;i<staffs.length;i++){
			if(staffs[i] == null){
				staffs[i] = a;
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("new Staff added.");
		}
		else{
			System.out.println("Staff insertion failed.");
		}
	}
	
	public void deleteById(String id){
		boolean flag = false;
		for(int i = 0;i<staffs.length;i++){
			if(staffs[i] != null){
				if(staffs[i].getStaffId().equals(id)){
					staffs[i] = null;
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
		for(int i = 0;i<staffs.length;i++){
			if(staffs[i]!=null){
				staffs[i].getStaffAsString();
			}
		}
	}
		public String getAllAsString(){
		String allStaffs = "";
		for(int i = 0;i<staffs.length;i++){
			if(staffs[i]!=null){
				allStaffs += staffs[i].getStaffAsString()+"\n";
			}
		}
		return allStaffs;
	}
}