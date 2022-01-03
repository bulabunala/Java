package 集合类DOC下发作业;
import java.util.*;

public class collection {

	    public static void main(String[] args) {
	        //创建Books对象
	        Books books1 = new Books(1001, "Java", 888.0, "Sun出版社");
	        Books books2 = new Books(1002, "Python", 257.0, "Python出版社");
	        Books books3 = new Books(1003, "C++", 155.0, "C++出版社");

	        //然后放进HashMap中,Key为图书的编号,value为图书对象
	        HashMap<Integer, Books> booksHashMap = new HashMap<>();
	        booksHashMap.put(books1.getNum(), books1);
	        booksHashMap.put(books2.getNum(), books2);
	        booksHashMap.put(books3.getNum(), books3);


	        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
	        booksList.add(booksHashMap);
	        
	        System.out.println("编号\t名称\t单价\t出版社");
	        for (HashMap<Integer, Books> h : booksList) {
	            //获取key
	            Set<Integer> key = h.keySet();
	            for (Integer i : key) {
	                //再通过key查找value
	                System.out.println(i
	                        + "\t" + h.get(i).getName()
	                        + "\t" + h.get(i).getPrice()
	                        + "\t" + h.get(i).getPress());
	            }
	        }
	    }
	}


	class Books {
		//书本的编号、名称、单价、出版社
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

