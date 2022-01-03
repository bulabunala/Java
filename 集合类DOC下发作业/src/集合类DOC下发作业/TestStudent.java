package ������DOC�·���ҵ;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
	    Set<Student> stuSet = saveStudentInfo();
	    outputInfo(stuSet);
	  }
	  private static Set<Student> saveStudentInfo() {
	    Scanner input = new Scanner(System.in);
	    // ����TreeSet����ѧ����Ϣ
	    Set<Student> stuSet = new TreeSet<Student>();
	    while (true){
	  
	      System.out.println("������ѧ����Ϣ��ѧ��#����#���䣩");
	      String inputData = input.nextLine();
	      // �ж��Ƿ��˳�
	      if ("exit".equals(inputData)){
	        break;
	      }
	      //���û������ѧ����Ϣ�ָ�ΪString[]
	      String [] info = inputData.split("#");
	      // ��������Ϣ��װ��Student������
	      Student stu = new Student(Integer.parseInt(info[0]),info[1],
	        Integer.parseInt(info[2]));
	     //��ѧ��������뼯��
	     
	      stuSet.add(stu);
	    }
	    return stuSet;
	  }
	  private static void outputInfo(Set<Student> stuSet){
	    File file = new File("D:/java eclipse/work11/student.txt");
	   //�����ļ����������
	   
	    FileWriter fw = null;
	    try {
	      fw = new FileWriter(file);
	      Iterator<Student> it = stuSet.iterator();
	      while (it.hasNext()){
	        String info = it.next().toString();
	        //���ַ���д����±�
	        fw.write(info);
	        //��ɻ���
	        fw.write("\r\n");
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        fw.close();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	  }
}
