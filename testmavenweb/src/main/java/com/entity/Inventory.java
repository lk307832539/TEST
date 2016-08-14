package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by LK on 2016/8/14.
 */
@Entity
public class Inventory {
    private String phoneId;
    private String phoneName;
    private Double price;
    private Integer num;

    @Id
    @Column(name = "phoneId", nullable = false, length = 50)
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    @Basic
    @Column(name = "phoneName", nullable = true, length = 100)
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "num", nullable = true)
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inventory inventory = (Inventory) o;

        if (phoneId != null ? !phoneId.equals(inventory.phoneId) : inventory.phoneId != null) return false;
        if (phoneName != null ? !phoneName.equals(inventory.phoneName) : inventory.phoneName != null) return false;
        if (price != null ? !price.equals(inventory.price) : inventory.price != null) return false;
        if (num != null ? !num.equals(inventory.num) : inventory.num != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phoneId != null ? phoneId.hashCode() : 0;
        result = 31 * result + (phoneName != null ? phoneName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        return result;
    }
}
