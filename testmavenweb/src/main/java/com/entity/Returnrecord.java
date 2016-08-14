package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by LK on 2016/8/14.
 */
@Entity
public class Returnrecord {
    private String recordId;
    private Integer num;
    private Timestamp date;
    private Inventory inventoryByPhoneId;

    @Id
    @Column(name = "recordId", nullable = false, length = 50)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "num", nullable = true)
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Returnrecord that = (Returnrecord) o;

        if (recordId != null ? !recordId.equals(that.recordId) : that.recordId != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordId != null ? recordId.hashCode() : 0;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "phoneId", referencedColumnName = "phoneId")
    public Inventory getInventoryByPhoneId() {
        return inventoryByPhoneId;
    }

    public void setInventoryByPhoneId(Inventory inventoryByPhoneId) {
        this.inventoryByPhoneId = inventoryByPhoneId;
    }
}
