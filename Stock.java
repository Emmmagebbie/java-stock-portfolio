/**
 * Stock for Stock Broker App
 * CS-160 Summer 2024
 * @author Patty Kraft
 * @date 10-Jun-2024
 */
 
public class Stock {
	
	String name;
	String ticker;
	int numShares;
	double currValue;
	double totValue;
	Finances quarFinancials;
	Finances annFinancials;
	
	
	public Stock(String ticker, String name,int numShares, double currValue) {
		this.name = name;
		this.ticker = ticker;
		this.numShares = numShares;
		this.currValue = currValue;
		this.totValue = numShares * currValue;
	}
	
	public void buyShares(int shares) {
		numShares += shares;
		totValue = numShares * currValue;
	}
	
	public void sellShares(int shares) { 
		if(shares <= numShares) 
			numShares -= shares;
		totValue = numShares * currValue;
	}
	
	public void setFinancials(Finances financial, String option) {
		if(option.equals("quarter"))
			quarFinancials = financial;
		else if(option.equals("annual"))
			annFinancials = financial;
		else 
			System.out.println("Error: Wrong Option");
	}
	
	public String getFinancials(String option) {
		if(option.equals("quarter"))
		   return quarFinancials.toString();
		else if(option.equals("annual"))
			return annFinancials.toString();
		else 
			return "Error: Wrong Option";
	}
	
	public String getInfo() {
		return "Program 3a, Manan";
	}
	
	public String getStockInfo() {
		return name + " (" + ticker + "); Total Shares Owned: " + numShares + "; Total Value: " +  totValue;
	}
	
	public int getShares() {
		return numShares;
	}
	
	public String getTicker() {
		return ticker;
	}
	
}
