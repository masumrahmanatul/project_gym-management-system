package EntityList;
import Entity.Member;

public class MemberList{
	private Member members[];
	
	public MemberList(){
		members = new Member[5];
	}
	
	public MemberList(int size){
		members = new Member[size];
	}
	
	public Member getById(String id){
		boolean flag = false;
		Member a = null;
		for(int i = 0; i<members.length; i++){
			if(members[i] != null){
				if(members[i].getMemberId().equals(id)){
					a = members[i];
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("There is an Member with this ID.");
		}
		else{
			System.out.println("No Member found with this ID.");
		}
		return a;
	}
	
	public void insert(Member a){
		boolean flag = false;
		for(int i = 0;i<members.length;i++){
			if(members[i] == null){
				members[i] = a;
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("A new Member has been added!");
		}
		else{
			System.out.println("Member insertion failed.");
		}
	}
	
	public void deleteById(String id){
		boolean flag = false;
		for(int i = 0;i<members.length;i++){
			if(members[i] != null){
				if(members[i].getMemberId().equals(id)){
					members[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Member with the ID: "+id+" was removed.");
		}
		else{
			System.out.println("No Member found with the ID: "+id);
		}
	}
	
	public void showAll(){
		for(int i = 0;i<members.length;i++){
			if(members[i]!=null){
				members[i].getMemberAsString();
			}
		}
	}
	
	public String getAllAsString(){
		String allMembers = "";
		for(int i = 0;i<members.length;i++){
			if(members[i]!=null){
				allMembers += members[i].getMemberAsString()+"\n";
			}
		}
		return allMembers;
	}
}