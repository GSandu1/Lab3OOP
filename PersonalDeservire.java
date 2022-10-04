import java.time.LocalDate;

public class PersonalDeservire extends Angajat{
    private double salary;
    private String position;
    private int accesCode;
    private String gender;

    public PersonalDeservire(int quantity, String name, LocalDate manufactureDate, LocalDate expirationDate) {
        super(quantity, name, manufactureDate, expirationDate);
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getaccesCode() {
        return accesCode;
    }

    public void setAccesCode(int accesCode) {
        this.accesCode = accesCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




}