package lionking.demo.model;

public class BankAccount {

    public BankAccount(String name, Double balance, String animalType, String currency, boolean king, boolean goodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.king = king;
        this.goodGuy = goodGuy;

    }

    private String name;
    private Double balance;
    private String animalType;
    private String currency;
    private boolean king;
    private boolean goodGuy;

    public boolean isGoodGuy() {
        return goodGuy;
    }

    public void setGoodGuy(boolean goodGuy) {
        this.goodGuy = goodGuy;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

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
