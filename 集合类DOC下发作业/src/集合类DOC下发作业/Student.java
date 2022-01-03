package ������DOC�·���ҵ;

public class Student implements Comparable<Student> {
	  //˽������:ѧ�ţ�����������
	  private Integer stuId;
	  private String name;
	  private Integer age;
	  //���췽��
	  public Student() {
	  }
	  public Student(Integer stuId, String name, Integer age) {
	    this.stuId = stuId;
	    this.name = name;
	    this.age = age;
	  }
	  /**
	   * getter��setter����
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
