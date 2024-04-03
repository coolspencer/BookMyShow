public class NetBanking extends Payment {
    private String bankName;
    private String userId;
    private String password;

    NetBanking(String bankName, String userId, String password) {
        this.bankName = bankName;
        this.userId = userId;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
