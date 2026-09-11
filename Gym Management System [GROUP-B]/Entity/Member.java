package Entity;
public class Member extends Person{
	private String role;
	private String memberId;
	
	public Member(String name, int age, char gender, String role, String memberId){
		super(name, age, gender);
		setRole(role);
		setMemberId(memberId);
	}
	
	public void setRole(String role){
		this.role = role;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setMemberId(String memberId){
		this.memberId = memberId;
	}
	
	public String getMemberId(){
		return memberId;
	}
	
	public String getMemberAsString(){
		return "-------------------------"+"\n"+
		" ID: "+this.memberId+"\n"+
		" Name: "+super.getName()+"\n"+
		" Age: "+super.getAge()+"\n"+
		" Gender: "+super.getGender()+"\n"+
		" Role: "+this.role+"\n"+
		"-------------------------"+"\n";
	}
}