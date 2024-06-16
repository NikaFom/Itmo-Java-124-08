package itmo.java.basics.lab6;

public class Client extends Human implements Speakable {
    private String bankName;


    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void info() {
        System.out.println("Имя: " + humanName() + ", фамилия: " + humanSurname() + ", название банка: " + bankName);
    }

    @Override
    public void printLanguage() {
        System.out.println(language());
    }

    @Override
    public String language() {
        return "English";
    }
}
