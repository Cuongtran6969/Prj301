/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import entity.Supplier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class DAO extends DBContext {
    
    public Vector<Supplier> getAllSupplier() {
     String sql = "SELECT * FROM [dbo].[Suppliers]";
     Vector<Supplier> list = new Vector<>();
        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {        
                Supplier newSupplier = new Supplier(
                        rs.getString("SupplierID"),
                        rs.getString("SupplierName"), 
                        rs.getString("Gender"),
                        rs.getString("Address"),
                        rs.getDate("BirthDate"));
                list.add(newSupplier);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
     return list;
    }
    
    
    public void deleteSupplier(String id) {
     String sql = "DELETE FROM [dbo].[Suppliers] WHERE SupplierID = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Vector<Supplier> getSupplierByName(String nameTxt) {
     String sql = "SELECT * FROM [dbo].[Suppliers] where SupplierName like ?";
     Vector<Supplier> list = new Vector<>();
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, "%"+nameTxt+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {        
                Supplier newSupplier = new Supplier(
                        rs.getString("SupplierID"),
                        rs.getString("SupplierName"), 
                        rs.getString("Gender"),
                        rs.getString("Address"),
                        rs.getDate("BirthDate"));
                list.add(newSupplier);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
     return list;
    }
    
    public Vector<Supplier> getSupplierByYear(String year) {
     String sql = "SELECT * FROM [dbo].[Suppliers] where year(BirthDate) = ?";
     Vector<Supplier> list = new Vector<>();
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, year);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {        
                Supplier newSupplier = new Supplier(
                        rs.getString("SupplierID"),
                        rs.getString("SupplierName"), 
                        rs.getString("Gender"),
                        rs.getString("Address"),
                        rs.getDate("BirthDate"));
                list.add(newSupplier);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
     return list;
    }
}

