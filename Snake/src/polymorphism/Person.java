package polymorphism;
class Person{  
	int id;  
	String name; 

	Person(int id,String name){  //smith
		this.id=id;  
		this.name=name;  
	} 


}  
//---------------------------------
class Emp extends Person{  
	float salary;  


	Emp(int id,String name,float salary){  //dong constructor
		super(id,name);//dong: hey smith could you plz create a person box for me   
		this.salary=salary;  
	}  
	void display(){
		System.out.println(id+" "+name+" "+salary);
	}  
}  
class TestSuper5{  
	public static void main(String[] args){  
		Emp e1=new Emp(1,"ankit",45000f);  
		e1.display();  
	}}