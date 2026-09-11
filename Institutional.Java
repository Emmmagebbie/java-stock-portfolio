/**
 *  Institutional for stock application
 *  @author  Emma Gebbie
 */
import java.util.ArrayList;
class Institutional implements StockAccount {
    //variables will be declared
    private int ID;
    private String manager;
    private String name;
    private String category;
    private ArrayList<StockAccount> stocksOwned;

    //Institutional( ) constructor
    public Institutional(){
        this.ID = StockApp.totalAccounts++; //Initialize ID to StockApp
        this.manager = "Manager" + ID; //Initialize manager to {"Manager" + ID}
        this.name = "Institutional" + ID;//Initialize name to {"Institutional" + ID}
        this.category = "Institutional"; //Initialize category to "Institutional"
        this.stocksOwned = new ArrayList<>();//Initialize the ArrayList< Stock > stocksOwned
    }

    //Institutional(String manager, String name) constructor
    public Institutional(String manager, String name){
        this.ID = StockApp.totlAccounts++;//Initialize ID to StockApp.totalAccounts variable
        this.manager = manager;//Initialize manager to parameter manager
        this.name = name;//Initialize manager to parameter manager
        this.category = "Institutional";//Initialize category to "Institutional"
        this.stocksOwned = new ArrayList<>();//Initialize the ArrayList< Stock > stocksOwned
    }

    //addStock(Stock): returns boolean
    @Override
    public boolean addStock(Stock stock);{
        for (int i = 0; i < stocksOwned.size(); i ++){
            Stock s = stocksOwned.get(i);
            if (s.getTicker().equals(stock.getTicket())){
                return false;
            }
        }
        stocksOwned.add(stock);
        return true;
    }

    //removeStock(Stock): returns boolean
    @Override
    public boolean removeStock(Stock stock){
        if (stocksOwned.contains(stock)){
            if (stock.getShares() == 0){
                stocksOwned.remove(stock);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
