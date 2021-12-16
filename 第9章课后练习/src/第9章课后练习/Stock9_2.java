package µÚ9ÕÂ¿ÎºóÁ·Ï°;
public class Stock9_2 {
	String symbol="";
	String name="";
	double previousClosingPrice=0;
	double currentPrice=0;
	Stock9_2(String symbol,String name,double previousClosingPrice,double currentPrice){
		this.symbol=symbol;
		this.name=name;
		this.previousClosingPrice=previousClosingPrice;
		this.currentPrice=currentPrice;
		
	}
	public double setPreviousClosingPrice(double previousClosingPrice) {
		return this.previousClosingPrice=previousClosingPrice;
	}
	public String getChangePercent() {
		return ((this.currentPrice/this.previousClosingPrice)-1)*100+"%";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock9_2 stock1=new Stock9_2("ORCL","Oracle Coroperation",34.5,34.35);
		System.out.println(stock1.getChangePercent());
		
	}

}

