package Lab15;

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    Stock(String newSym, String newName){
        symbol = newSym;
        name = newName;
    }
    
    double getChangePercent(){
        return (currentPrice - previousClosingPrice) / (previousClosingPrice * 100);
    }
    
    void setCurrentPrice(double newPrice){
        currentPrice = newPrice;
    }
}


public class Lab15_Stock {
    public static void main(String[] args){
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        
        stock1.previousClosingPrice = 34.5;
        stock1.setCurrentPrice(34.35);
        
        System.out.println("Stock Name: " + stock1.name);
        System.out.println("Stock Symbol: " + stock1.symbol);
        System.out.println("Stock Previous Closing Price: " + stock1.previousClosingPrice);
        System.out.println("Stock Current Price: " + stock1.currentPrice);
        System.out.println("Stock Price-Change Percentage: " + stock1.getChangePercent() + "%");
    }
}
