package Entity;
public class Person{
	private String name;
	private int age;
	private char gender;
	
	public Person(){}
	
	public Person(String name, int age, char gender){
		setName(name);
		setAge(age);
		setGender(gender);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public char getGender(){
		return gender;
	}
	
	public void showPersonInfo(){
		System.out.println("-------------------------");
		System.out.println("Person Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("-------------------------");
	}
}