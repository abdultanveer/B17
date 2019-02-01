/**
 * This represents a student object pojo
 * @author Admin
 *
 */
public class Student {
	public static String COLLEGE_NAME = "IIT";
	 String name;
	private int age;
	private int id;
	private int marks;
	private String dob;
	public Student(String string) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
	/*private String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

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
	*//**
	 * this will get you the students name
	 * this is like a tap in the water bottle
	 * @return name of student
	 *//*
	public String getName() {
		//this.getAge();
		return name;
	}
	//setter is like cap
	public void setName(String name) {
		this.name = name;
	}
	*//**
	 * this will get the age 
	 * @return
	 *//*
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		// calculate the age from dob
		//this.age = age;
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
	
	*//**
	 * other classes can also invoke this method without
	 * creating an object of this class
	 * @param a
	 * @param b
	 * @return
	 *//*
	public static int getAverage(int a, int b) {
		return (a+b)/2;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		//this method will be called before the student object is garbage collected
		String value = "10";
		int a = Integer.parseInt(value);
		
		System.out.println("this method will be called before the student object is garbage collected\r\n" );
		System.out.println("close files,db and net connections before this object is thrashed");
	
	}*/
	
	
	
	

}
