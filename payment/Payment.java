import java.sql.Date;
import Enums.PaymentStaus;
import java.util.*;
public class Payment {
    private int transactionId;
    private PaymentStaus status;
    public Date createdOn;
    private double amount;

    Payment(int transactionId, PaymentStaus status, Date createdOn, double amount) {
        this.transactionId = transactionId;
        this.status = status;
        this.createdOn = createdOn;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentStaus getStatus() {
        return status;
    }

    public void setStatus(PaymentStaus status) {
        this.status = status;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}