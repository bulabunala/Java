package 集合类DOC下发作业;

public class Student implements Comparable<Student> {
	  //私有属性:学号，姓名，年龄
	  private Integer stuId;
	  private String name;
	  private Integer age;
	  //构造方法
	  public Student() {
	  }
	  public Student(Integer stuId, String name, Integer age) {
	    this.stuId = stuId;
	    this.name = name;
	    this.age = age;
	  }
	  /**
	   * getter和setter方法
	   */
	  public Integer getStuId() {
	    return stuId;
	  }
	  public void setStuId(Integer stuId) {
	    this.stuId = stuId;
	  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public Integer getAge() {
	    return age;
	  }
	  public void setAge(Integer age) {
	    this.age = age;
	  }
	  @Override
	  public int compareTo(Student stu) {
	    return this.age - stu.age;
	  }
	  public String toString(){
	    return "Student [age = " + age + ",name = " + name +",stuId = " + stuId + "]";
	  }
	}
