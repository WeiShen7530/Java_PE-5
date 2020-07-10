/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contact;

/**
 *
 * @author Dell
 */
public class ContactGet {
    // Get contacts list.
    public ArrayList<Contact> getListContact() throws SQLException {
        Connection connection = DBConnect.getMySQLConnection();
        String sql = "SELECT * FROM LIENHE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Contact> list = new ArrayList<>();
        while (rs.next()) {
           Contact contact = new Contact();
           contact.setCtcName(rs.getString("HOTEN"));
           contact.setCtcPhone(rs.getString("SDT"));
           contact.setCtcAddress(rs.getString("DIACHI"));
           list.add(contact);
        }
        return list;
    }
    
    // Search.
    public Contact searchContact(String phoneNumber) throws SQLException {
        Connection connection = DBConnect.getMySQLConnection();
        String sql = "SELECT * FROM LIENHE WHERE SDT LIKE ?";
        
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, "%" + phoneNumber + "%");
        ResultSet rs = ps.executeQuery();
        
        Contact contact = new Contact();
        while (rs.next()) {
            contact.setCtcName(rs.getString("HOTEN"));
            contact.setCtcPhone(rs.getString("SDT"));
            contact.setCtcAddress(rs.getString("DIACHI"));
        }
        return contact;
    }
    
    // Insert.
    public boolean insertContact(Contact ctc) {
        Connection connection = DBConnect.getMySQLConnection();
        String sql = "INSERT INTO LIENHE(`HOTEN`,`SDT`,`DIACHI`) VALUES(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, ctc.getCtcName());
            ps.setString(2, ctc.getCtcPhone());
            ps.setString(3, ctc.getCtcAddress());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    // Update.
    public boolean updateContact(Contact ctc, String oldPhone) {
        
        Connection connection = DBConnect.getMySQLConnection();
        String sql = "UPDATE LIENHE SET HOTEN=?,SDT=?,DIACHI=? WHERE SDT=?";
        
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, ctc.getCtcName());
            ps.setString(2, ctc.getCtcPhone());
            ps.setString(3, ctc.getCtcAddress());
            ps.setString(4, oldPhone);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
           Logger.getLogger(ContactGet.class.getName()).log(Level.SEVERE,null, e);
        }
        return false;
    }
    
    // Delete.
    public boolean deleteContact(String phone) {
        Connection connection = DBConnect.getMySQLConnection();
        String sql = "DELETE FROM LIENHE WHERE SDT LIKE ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, "%" + phone + "%");
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
}
