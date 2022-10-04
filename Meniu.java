import java.time.LocalDate;

public class Meniu extends Produse{
    private String food;
    private Double price;

    public Meniu(int quantity, String name, LocalDate manufactureDate, LocalDate expirationDate) {
        super(quantity, name, manufactureDate, expirationDate);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(Double price) {
        this.price = price;
    }


}