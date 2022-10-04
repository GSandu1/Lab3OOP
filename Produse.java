import java.time.LocalDate;
public class Produse {
    private int quantity;
    private String name;
    private LocalDate manufactureDate ;
    private LocalDate expirationDate;

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Produse(int quantity,String name,LocalDate manufactureDate, LocalDate expirationDate) {
        this.quantity = quantity;
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.expirationDate = expirationDate;
    }


}