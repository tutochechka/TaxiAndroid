package Domain;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;


/**
 * Created by Sveta on 8/28/2015.
 */
@DatabaseTable(tableName = "accounts")
public class Order {
    @DatabaseField(generatedId=true)
    private Long OrderId;
    @DatabaseField
    private String clientPfoneNum;
    @DatabaseField
    private String fromAddress;

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    private String toAddress;
    private Date date;
    private Long sum;

    public Order() {
    }

    public Order(String client, String fromAddress, String toAddress, Date date, Long sum) {

        this.clientPfoneNum = client;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.date = date;
        this.sum = sum;
    }

    public String getClientPfoneNum() {

        return clientPfoneNum;
    }

    public void setClientPfoneNum(String clientPfoneNum) {
        this.clientPfoneNum = clientPfoneNum;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}
