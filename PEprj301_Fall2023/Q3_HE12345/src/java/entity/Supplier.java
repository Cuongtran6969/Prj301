/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class Supplier {
    private String SupplierID, SupplierName, Gender, Address;
    private Date BirthDate;

    public Supplier() {
    }
    
    public Supplier(String SupplierID, String SupplierName, String Gender, String Address, Date BirthDate) {
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.Gender = Gender;
        this.Address = Address;
        this.BirthDate = BirthDate;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getGender() {
        return Gender.equals("1")?"Male":"Female";
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    @Override
    public String toString() {
        return "Supplier{" + "SupplierID=" + SupplierID + ", SupplierName=" + SupplierName + ", Gender=" + Gender + ", Address=" + Address + ", BirthDate=" + BirthDate + '}';
    }
}
