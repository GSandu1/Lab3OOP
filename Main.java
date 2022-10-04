import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Restaurant");

        PersonalBucatarie personalBucatarie = new PersonalBucatarie("Ryan", "Pastro", 23, 2345.0, "LineCook", 123455678,"Male ","Salads");
        System.out.println(personalBucatarie.getaccesCode());
        System.out.println(personalBucatarie.getName());
        Bon bon = new Bon("John",378.0, LocalDate.parse("2021-10-10"),21,"Ribeyee steak");
        System.out.println(bon.getTime());
        CardDeReducere cardDeReducere = new CardDeReducere("Cristiano","Ronaldo",23456773, 43);
        System.out.println(cardDeReducere.getNrCard());
    }
}

