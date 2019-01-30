
public class Student {
	public static String COLLEGE_NAME = "IIT";
	private String name;
	private int age;
	private int id;
	private int marks;
	public static String getCOLLEGE_NAME() {
		return COLLEGE_NAME;
	}
	public static void setCOLLEGE_NAME(String cOLLEGE_NAME) {
		COLLEGE_NAME = cOLLEGE_NAME;
	}
	//getter is like tap
	public String getName() {
		return name;
	}
	//setter is like cap
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
