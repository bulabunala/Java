package 第11章课后练习;

class Person{
	private String name;
	private String address;
	private String number;
	private String Email;
	protected Person() {
	}

	protected Person(String name, String address, String number, String Email) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.Email = Email;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	protected String getNumber() {
		return number;
	}

	protected void setNumber(String number) {
		this.number = number;
	}

	protected String getEmail() {
		return Email;
	}

	protected void setEmail(String Email) {
		this.Email = Email;
	}

	@Override
	public String toString() {
		return "ObejectByPerson" + "Name:" + getName();
	}
}
class Student extends Person{
	public final static String ONE = "Freshman";
	public final static String TWO = "Sophomore";
	public final static String THREE = "Junior";
	public final static String FOUR = "Senior";
	private String StudentState;

	public Student() {
		StudentState = ONE;
	}

	public Student(String StudentState, String name, String address, String number, String Email) {
		super(name, address, number, Email);
		this.StudentState = StudentState;
	}

	public String getStudentState() {
		return StudentState;
	}

	public void setStudentState(String StudentState) {
		this.StudentState = StudentState;
	}

	public String toStringOfAllInforation() {
		return "Student is inforation:Grade:" + getStudentState() + "\tName:" + getName() + "\tAddress:" + getAddress()
				+ "\tNumber:" + getNumber() + "\tEmail:" + getEmail();
	}

	@Override
	public String toString() {
		return "ObjectByStudent-->" + "Name:" + getName();
	}
}
class Employee extends Person{
	private String Office;
	private double salary;

	protected Employee() {
	}

	protected Employee(String Office, double salary, String name, String address, String number, String Email) {
		super(name, address, number, Email);
		this.Office = Office;
		this.salary = salary;
	}

	protected String getOffice() {
		return Office;
	}

	protected void setOffice(String Office) {
		this.Office = Office;
	}

	protected double getSalary() {
		return salary;
	}

	protected void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ObjectByEmployee-->" + "Name:" + getName();
	}
}
class Faculty extends Employee{
	private String OfficeTime;
	private String PostGrade;
	public Faculty() {

	}

	public Faculty(String Office, double salary, String OfficeTime, String PostGrade, String name, String address,
			String number, String Email) {
		super(Office, salary, name, address, number, Email);
		this.OfficeTime = OfficeTime;
		this.PostGrade = PostGrade;
	}

	public String getOfficeTime() {
		return OfficeTime;
	}

	public void setOfficeTime(String OfficeTime) {
		this.OfficeTime = OfficeTime;
	}

	public String getPostGrade() {
		return PostGrade;
	}

	public void setPostGrade(String PostGrade) {
		this.PostGrade = PostGrade;
	}

	public String toStringOfAllInforation() {
		return "Faculty is inforation:PostGrade:" + getPostGrade() + "\tOfficeTime:" + getOfficeTime() + "\tSalary:"
				+ getSalary() + "Office:" + getOffice() + "\tName:" + getName() + "\tAddress:" + getAddress()
				+ "\tNumber:" + getNumber() + "\tEmail:" + getEmail();
	}

	@Override
	public String toString() {
		return "ObjectByFaculty-->" + "Name:" + getName();
	}
}
class Staff extends Employee{
	private String Post;
	public Staff() {
	}

	public Staff(String Office, double salary, String Post, String name, String address, String number, String Email) {
		super(Office, salary, name, address, number, Email);
		this.Post = Post;
	}

	public String getPost() {
		return Post;
	}

	public void setPost(String Post) {
		this.Post = Post;
	}

	public String toStringOfAllInforation() {
		return "Staff is inforation:Post:" + getPost() + "\tSalary:" + getSalary() + "Office:" + getOffice() + "\tName:"
				+ getName() + "\tAddress:" + getAddress() + "\tNumber:" + getNumber() + "\tEmail:" + getEmail();
	}

	@Override
	public String toString() {
		return "ObjectByStaff-->" + "Name:" + getName();
	}
}

public class Person11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(Student.ONE,"老刘","上海","123456789","13456@email");
		Employee e = new Employee("程序员",2300.0,"老张","北京","123456789","145662@email");
		Faculty f = new Faculty("程序员2",2300.0,"time","grade","老李","北京","123456789","145662@email");
		Staff sta = new Staff("程序员3",2300.0,"post","老周","北京","123456789","145662@email");
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(sta.toString());
	
	}

}