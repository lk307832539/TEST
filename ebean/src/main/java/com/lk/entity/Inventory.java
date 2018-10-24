package com.lk.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "T_INVENTORY_MOVEMENT")
public class Inventory {
    private String material;
    private String materialdescription;
    private String plnt;
    private String name1;
    private String sloc;
    private String mvt;
    private String s;
    private String matdoc;
    private String valtype;
    private String iteminmatdoc;
    private String time;
    private String pstgdate;
    private String quantityinune;
    private String eun;
    private String order1;
    private String salesord;
    private String amtloccur;
    private String asset;
    private String bun;
    private String batch;
    private String cocd;
    private String cns;
    private String costctr;
    private String counter;
    private String curr;
    private String customer;
    private String d_c;
    private String docdate;
    private String entrydate;
    private String extamountlc;
    private String grgislip;
    private String item;
    private String aut;
    private String itm;
    private String matyr;
    private String mvt_indicator;
    private String movementtypetext;
    private String network;
    private String opac;
    private String opun;
    private String oun;
    private String po;
    private String qtyinorderunit;
    private String qtyinopun;
    private String quantity;
    private String reas;
    private String rec;
    private String reference;
    private String reservno;
    private String routingno;
    private String salvalincvat;
    private String soitem;
    private String sch;
    private String salesvalue;
    private String sno;
    private String tety;
    private String username;
    private String vendor;
    private String wbselement;
    private String documentheadertext;
    private Date last_update;

    public Inventory() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterialdescription() {
        return materialdescription;
    }

    public void setMaterialdescription(String materialdescription) {
        this.materialdescription = materialdescription;
    }

    public String getPlnt() {
        return plnt;
    }

    public void setPlnt(String plnt) {
        this.plnt = plnt;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getSloc() {
        return sloc;
    }

    public void setSloc(String sloc) {
        this.sloc = sloc;
    }

    public String getMvt() {
        return mvt;
    }

    public void setMvt(String mvt) {
        this.mvt = mvt;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getMatdoc() {
        return matdoc;
    }

    public void setMatdoc(String matdoc) {
        this.matdoc = matdoc;
    }

    public String getValtype() {
        return valtype;
    }

    public void setValtype(String valtype) {
        this.valtype = valtype;
    }

    public String getIteminmatdoc() {
        return iteminmatdoc;
    }

    public void setIteminmatdoc(String iteminmatdoc) {
        this.iteminmatdoc = iteminmatdoc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPstgdate() {
        return pstgdate;
    }

    public void setPstgdate(String pstgdate) {
        this.pstgdate = pstgdate;
    }

    public String getQuantityinune() {
        return quantityinune;
    }

    public void setQuantityinune(String quantityinune) {
        this.quantityinune = quantityinune;
    }

    public String getEun() {
        return eun;
    }

    public void setEun(String eun) {
        this.eun = eun;
    }

    public String getOrder1() {
        return order1;
    }

    public void setOrder1(String order1) {
        this.order1 = order1;
    }

    public String getSalesord() {
        return salesord;
    }

    public void setSalesord(String salesord) {
        this.salesord = salesord;
    }

    public String getAmtloccur() {
        return amtloccur;
    }

    public void setAmtloccur(String amtloccur) {
        this.amtloccur = amtloccur;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCocd() {
        return cocd;
    }

    public void setCocd(String cocd) {
        this.cocd = cocd;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getCostctr() {
        return costctr;
    }

    public void setCostctr(String costctr) {
        this.costctr = costctr;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getD_c() {
        return d_c;
    }

    public void setD_c(String d_c) {
        this.d_c = d_c;
    }

    public String getDocdate() {
        return docdate;
    }

    public void setDocdate(String docdate) {
        this.docdate = docdate;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getExtamountlc() {
        return extamountlc;
    }

    public void setExtamountlc(String extamountlc) {
        this.extamountlc = extamountlc;
    }

    public String getGrgislip() {
        return grgislip;
    }

    public void setGrgislip(String grgislip) {
        this.grgislip = grgislip;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

    public String getItm() {
        return itm;
    }

    public void setItm(String itm) {
        this.itm = itm;
    }

    public String getMatyr() {
        return matyr;
    }

    public void setMatyr(String matyr) {
        this.matyr = matyr;
    }

    public String getMvt_indicator() {
        return mvt_indicator;
    }

    public void setMvt_indicator(String mvt_indicator) {
        this.mvt_indicator = mvt_indicator;
    }

    public String getMovementtypetext() {
        return movementtypetext;
    }

    public void setMovementtypetext(String movementtypetext) {
        this.movementtypetext = movementtypetext;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getOpac() {
        return opac;
    }

    public void setOpac(String opac) {
        this.opac = opac;
    }

    public String getOpun() {
        return opun;
    }

    public void setOpun(String opun) {
        this.opun = opun;
    }

    public String getOun() {
        return oun;
    }

    public void setOun(String oun) {
        this.oun = oun;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getQtyinorderunit() {
        return qtyinorderunit;
    }

    public void setQtyinorderunit(String qtyinorderunit) {
        this.qtyinorderunit = qtyinorderunit;
    }

    public String getQtyinopun() {
        return qtyinopun;
    }

    public void setQtyinopun(String qtyinopun) {
        this.qtyinopun = qtyinopun;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getReas() {
        return reas;
    }

    public void setReas(String reas) {
        this.reas = reas;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReservno() {
        return reservno;
    }

    public void setReservno(String reservno) {
        this.reservno = reservno;
    }

    public String getRoutingno() {
        return routingno;
    }

    public void setRoutingno(String routingno) {
        this.routingno = routingno;
    }

    public String getSalvalincvat() {
        return salvalincvat;
    }

    public void setSalvalincvat(String salvalincvat) {
        this.salvalincvat = salvalincvat;
    }

    public String getSoitem() {
        return soitem;
    }

    public void setSoitem(String soitem) {
        this.soitem = soitem;
    }

    public String getSch() {
        return sch;
    }

    public void setSch(String sch) {
        this.sch = sch;
    }

    public String getSalesvalue() {
        return salesvalue;
    }

    public void setSalesvalue(String salesvalue) {
        this.salesvalue = salesvalue;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getTety() {
        return tety;
    }

    public void setTety(String tety) {
        this.tety = tety;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getWbselement() {
        return wbselement;
    }

    public void setWbselement(String wbselement) {
        this.wbselement = wbselement;
    }

    public String getDocumentheadertext() {
        return documentheadertext;
    }

    public void setDocumentheadertext(String documentheadertext) {
        this.documentheadertext = documentheadertext;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}
