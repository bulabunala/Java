package ������DOC�·���ҵ;
import java.util.*;

public class collection {

	    public static void main(String[] args) {
	        //����Books����
	        Books books1 = new Books(1001, "Java", 888.0, "Sun������");
	        Books books2 = new Books(1002, "Python", 257.0, "Python������");
	        Books books3 = new Books(1003, "C++", 155.0, "C++������");

	        //Ȼ��Ž�HashMap��,KeyΪͼ��ı��,valueΪͼ�����
	        HashMap<Integer, Books> booksHashMap = new HashMap<>();
	        booksHashMap.put(books1.getNum(), books1);
	        booksHashMap.put(books2.getNum(), books2);
	        booksHashMap.put(books3.getNum(), books3);


	        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
	        booksList.add(booksHashMap);
	        
	        System.out.println("���\t����\t����\t������");
	        for (HashMap<Integer, Books> h : booksList) {
	            //��ȡkey
	            Set<Integer> key = h.keySet();
	            for (Integer i : key) {
	                //��ͨ��key����value
	                System.out.println(i
	                        + "\t" + h.get(i).getName()
	                        + "\t" + h.get(i).getPrice()
	                        + "\t" + h.get(i).getPress());
	            }
	        }
	    }
	}


	class Books {
		//�鱾�ı�š����ơ����ۡ�������
	    private int num;
	    private String name;
	    private double price;
	    private String press;

	    public Books() {

	    }

	    Books(int num, String name, double price, String press) {
	        super();
	        this.num = num;
	        this.name = name;
	        this.price = price;
	        this.press = press;
	    }

	    int getNum() {
	        return num;
	    }

	    String getName() {
	        return name;
	    }

	    double getPrice() {
	        return price;
	    }

	    String getPress() {
	        return press;
	    }
	}

