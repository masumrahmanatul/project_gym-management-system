package Entity;
public class Staff extends Person{
	private String staffId;
	private String role;
	
	public Staff(String name, int age, char gender, String role, String staffId){
		super(name, age, gender);
		setStaffId(staffId);
		setRole(role);
	}
	
	public void setStaffId(String staffId){
		this.staffId = staffId;
	}
	public String getStaffId(){
		return staffId;
	}
	
	public void setRole(String role){
		this.role = role;
	}
	public String getRole(){
		return role;
	}
	
		public String getStaffAsString(){
		return "-------------------------"+"\n"+
		"ID: "+this.staffId+"\n"+
		"Name: "+super.getName()+"\n"+
		"Age: "+super.getAge()+"\n"+
		"Gender: "+super.getGender()+"\n"+
		"Role: "+this.role+"\n"+
		"-------------------------"+"\n";
	}
}
