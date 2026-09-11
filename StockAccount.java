/**
 * Stock for Stock Broker App
 * CS-160 Summer 2024
 * @author Emma Gebbie
 * @date 10-Jun-2024
 */
import java.util.ArrayList;
public interface StockAccount {

    public void setName(String name);

    public String getName();

    public void setCategory(String category);

    public String getCategory();

    public int getID();

    public ArrayList<Stock> getStocksOwned();
}