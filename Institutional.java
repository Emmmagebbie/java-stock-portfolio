/**
 * Program 6
 * Institutional for stock application
 * CS160-1001
 * 6/13/24
 *
 * @author Emma Gebbie
 */

import java.util.ArrayList;

class Institutional implements StockAccount {
    //variables will be declared
    private int ID;
    private String manager;
    private String name;
    private String category;
    private ArrayList<Stock> stocksOwned;

    //Institutional( ) constructor
    public Institutional() {
        this.ID = StockApp.totalAccounts++; //Initialize ID to StockApp
        this.manager = "Manager" + ID; //Initialize manager to {"Manager" + ID}
        this.name = "Institutional" + ID;//Initialize name to {"Institutional" + ID}
        this.category = "Institutional"; //Initialize category to "Institutional"
        this.stocksOwned = new ArrayList<>();//Initialize the ArrayList< Stock > stocksOwned
    }

    //Institutional(String manager, String name) constructor
    public Institutional(String manager, String name) {
        this.ID = StockApp.totalAccounts++;//Initialize ID to StockApp.totalAccounts variable
        this.manager = manager;//Initialize manager to parameter manager
        this.name = name;//Initialize manager to parameter manager
        this.category = "Institutional";//Initialize category to "Institutional"
        this.stocksOwned = new ArrayList<>();//Initialize the ArrayList< Stock > stocksOwned
    }

    //addStock(Stock): returns boolean
    public boolean addStock(Stock stock) {
        if (stocksOwned.contains(stock)) {
            return false;
        }
        stocksOwned.add(stock);
        return true;
    }

    //removeStock(Stock): returns boolean
    public boolean removeStock(Stock stock) {
        if (stocksOwned.contains(stock)) {
            if (stock.getShares() == 0) {
                stocksOwned.remove(stock);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public void setName(String name) {

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
    public int getID() {
        return ID;
    }

    @Override
    public ArrayList<Stock> getStocksOwned() {

        return stocksOwned;
    }
}