package com.lk.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TAB_LX_EXPORT")
public class Export {
    private String customsNumber;
    private String reportedDate;
    private String exportDate;
    private String type;
    private String trainningWay;
    private String uniteNum;
    private String listNum;
    private String fertMlfb;
    private String bomNum;
    private String singleNum;
    private String fertQty;
    private String fertDoc;
    private String material;
    private String piecesItemNum;
    private String consumablesQty;
    private String piecesItemUnit;
    private Date lastUpdate;

    public String getCustomsNumber() {
        return customsNumber;
    }

    public void setCustomsNumber(String customsNumber) {
        this.customsNumber = customsNumber;
    }

    public String getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(String reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrainningWay() {
        return trainningWay;
    }

    public void setTrainningWay(String trainningWay) {
        this.trainningWay = trainningWay;
    }

    public String getUniteNum() {
        return uniteNum;
    }

    public void setUniteNum(String uniteNum) {
        this.uniteNum = uniteNum;
    }

    public String getListNum() {
        return listNum;
    }

    public void setListNum(String listNum) {
        this.listNum = listNum;
    }

    public String getFertMlfb() {
        return fertMlfb;
    }

    public void setFertMlfb(String fertMlfb) {
        this.fertMlfb = fertMlfb;
    }

    public String getBomNum() {
        return bomNum;
    }

    public void setBomNum(String bomNum) {
        this.bomNum = bomNum;
    }

    public String getSingleNum() {
        return singleNum;
    }

    public void setSingleNum(String singleNum) {
        this.singleNum = singleNum;
    }

    public String getFertQty() {
        return fertQty;
    }

    public void setFertQty(String fertQty) {
        this.fertQty = fertQty;
    }

    public String getFertDoc() {
        return fertDoc;
    }

    public void setFertDoc(String fertDoc) {
        this.fertDoc = fertDoc;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPiecesItemNum() {
        return piecesItemNum;
    }

    public void setPiecesItemNum(String piecesItemNum) {
        this.piecesItemNum = piecesItemNum;
    }

    public String getConsumablesQty() {
        return consumablesQty;
    }

    public void setConsumablesQty(String consumablesQty) {
        this.consumablesQty = consumablesQty;
    }

    public String getPiecesItemUnit() {
        return piecesItemUnit;
    }

    public void setPiecesItemUnit(String piecesItemUnit) {
        this.piecesItemUnit = piecesItemUnit;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
