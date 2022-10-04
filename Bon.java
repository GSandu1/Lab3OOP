import java.time.LocalDate;
public class Bon extends Client{
    private String serverName;
    private Double checkAmount;
    private LocalDate time;
    private int tableNr;

    private String orderedFood;



    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverNamename) {
        this.serverName = serverName;
    }

    public Double getCheckAmount() {
        return this.checkAmount;
    }

    public void setCheckAmount(Double checkAmount) {
        this.checkAmount = checkAmount;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public int getTableNr() {
        return tableNr;
    }

    public void setTableNr(int tableNr) {
        this.tableNr = tableNr;
    }

    public String getOrderedFood() {
        return orderedFood;
    }

    public void setOrderedFood(String orderedFood) {
        this.orderedFood = orderedFood;
    }

    public String getClientName() {
        return getName();
    }
    public Bon(String serverName,Double checkAmount,LocalDate time, int tableNr, String orderedFood) {
        this.serverName= serverName;
        this.checkAmount = checkAmount;
        this.time = time;
        this.tableNr = tableNr;
        this.orderedFood = orderedFood;
    }




}