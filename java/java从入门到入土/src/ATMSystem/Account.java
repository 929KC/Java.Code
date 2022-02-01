package ATMSystem;

public class Account {
    private  String cardId;
    private String  userName;
    private String password;
    private double money;
    private double quotaMoney;

    public Account() {
    }

    public Account(String cardId, String userName, String password, double quotaMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.password = password;
        this.quotaMoney = quotaMoney;
    }



    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
