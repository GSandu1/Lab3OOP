public class CardDeReducere extends Client{

    private int nrCard;
    private float discountAmount;

    public String getNameC() {
        return getName();
    }
    public int getNrCard() {
        return nrCard;
    }

    public void setNrCard(int nrCard) {
        this.nrCard = nrCard;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public CardDeReducere(String name,String surname, int nrCard,float discountAmount) {
        this.nrCard = nrCard;
        this.discountAmount = discountAmount;
    }
}