package lionking.demo.model;

public class BankAccount {

    public BankAccount(String name, Double balance, String animalType, String currency) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;

    }

    private String name;
    private Double balance;
    private String animalType;
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
