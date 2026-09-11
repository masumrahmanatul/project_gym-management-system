package Entity;
public class Administrator extends Person{
	private String role;
	private String adminId;
	
	public Administrator(String name, int age, char gender, String role, String adminId){
		super(name, age, gender);
		setRole(role);
		setAdminId(adminId);
	}
	
	public void setRole(String role){
		this.role = role;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setAdminId(String adminId){
		this.adminId = adminId;
	}
	
	public String getAdminId(){
		return adminId;
	}
	
	public String getAdminAsString(){
		return "-------------------------"+"\n"+
		"ID: "+this.adminId+"\n"+
		"Name: "+super.getName()+"\n"+
		"Age: "+super.getAge()+"\n"+
		"Gender: "+super.getGender()+"\n"+
		"Role: "+this.role+"\n"+
		"-------------------------"+"\n";
	}
}