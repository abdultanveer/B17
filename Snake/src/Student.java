
public class Student {
	public static String COLLEGE_NAME = "IIT";
	 String name;
	private int age;
	private int id;
	private int marks;
	
	public Student(){} // default constructor --- smith
	
	public Student(String name) { //Dong constructor
		this.name = name;
	}
	
	public Student(String sName, int age ) { //sang constructor
	this("ansari");
	//name = sName;
	this.age = age;
	}
	
	
	//getter is like tap
	public String getName() {
		//this.getAge();
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
	
	/**
	 * other classes can also invoke this method without
	 * creating an object of this class
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getAverage(int a, int b) {
		return (a+b)/2;
	}
	

}
