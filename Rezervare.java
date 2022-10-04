import java.time.LocalDate;
public class Rezervare extends Client{

    private LocalDate time;
    private int peopleAmount;
    private int tableNr;

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(int peopleAmount) {
        this.peopleAmount = peopleAmount;
    }

    public int getTableNr() {
        return tableNr;
    }

    public void setTableNr(int tableNr) {
        this.tableNr = tableNr;
    }

    public Rezervare(String name,String surname,LocalDate time,int peopleAmount,int tableNr) {

        this.time = time;
        this.peopleAmount = peopleAmount;
        this.tableNr = tableNr;
    }

}