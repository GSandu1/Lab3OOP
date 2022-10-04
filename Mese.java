import java.time.LocalDate;

public class Mese extends PersonalDeservire{
    private int freeTables;
    private int fullTables;
    private int reservedTables;

    public Mese(int quantity, String name, LocalDate manufactureDate, LocalDate expirationDate) {
        super(quantity, name, manufactureDate, expirationDate);
    }



    public int getFreeTables() {
        return this.freeTables;
    }

    public void setFreeTables(int freeTables) {
        this.freeTables = freeTables;
    }
    public int getFullTables() {
        return this.fullTables;
    }

    public void setFullTables(int freeTables) {
        this.fullTables = fullTables;
    }
    public int getReservedTables() {
        return this.reservedTables;
    }

    public void setReservedTablese(int reservedTables) {
        this.reservedTables = reservedTables;
    }




}