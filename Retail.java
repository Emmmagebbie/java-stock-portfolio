/**
 *  Program 6
 *  Institutional for stock application
 *  CS160-1001
 *  6/13/24
 *  @author  Emma Gebbie
 */

import java.util.ArrayList;

class Retail implements StockAccount {
    private int ID;
    private String name;
    private String category;
    private ArrayList<Stock> stocksOwned;

    //Retail( ) constructor
    public Retail(){
        this.ID = StockApp.totalAccounts++; //Initialize ID to StockApp.totalAccounts variable
        this.name = "Retail" + ID; //Initialize name to {"Retail" + ID}
        this.category = "Retail"; //Initialize category to "Retail"
        this.stocksOwned = new ArrayList<>(); //Initialize the ArrayList stocksOwned
    }

    //Retail(String name) constructor
    public Retail(String name){
        this.ID = StockApp.totalAccounts++;//Initialize ID to StockApp.totalAccounts variable
        this.name = name;//Initialize name to parameter name
        this.category = "Retail";//Initialize category to "Retail"
        this.stocksOwned = new ArrayList<>();//Initialize the ArrayList stocksOwned
    }

    //addStock(Stock): returns boolean
    public boolean addStock(Stock stock){
        if (stocksOwned.size() >= 10){
            return false;
        }
        for(int i = 0; i < stocksOwned.size(); i++){
            Stock s = stocksOwned.get(i);
            if (s.getTicker().equals(stock.getTicker())){
                return false;
            }
        }
        stocksOwned.add(stock);
        return true;
    }

    //removeStock(Stock): returns boolean
    public boolean removeStock(Stock stock){
        if (!stocksOwned.contains(stock)){
            return false;
        }
        if (stock.getShares() == 0){
            stocksOwned.remove(stock);
            return true;
        }
        return false;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public int getID(){
        return ID;
    }

    @Override
    public ArrayList<Stock> getStocksOwned(){
        return stocksOwned;
    }
}