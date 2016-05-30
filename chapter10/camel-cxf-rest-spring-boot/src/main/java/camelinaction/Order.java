package camelinaction;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Table(name = "order")
@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, insertable = true, updatable = true, columnDefinition = "text")
    @XmlAttribute
    private int id;

    @Basic
    @Column(name = "partName", nullable = true, insertable = true, updatable = true)
    @XmlAttribute
    private String partName;

    @Basic
    @Column(name = "amount", nullable = true, insertable = true, updatable = true)
    @XmlAttribute
    private int amount;

    @Basic
    @Column(name = "customerName", nullable = true, insertable = true, updatable = true)
    @XmlAttribute
    private String customerName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
