/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Contact {
    private int ctcID;
    private String ctcName ;
    private String ctcPhone;
    private String ctcAddress;

    public Contact (){
        //
    }
    
    public Contact(String ctcName, String ctcPhone, String ctcAddress) {
        this.ctcName = ctcName;
        this.ctcPhone = ctcPhone;
        this.ctcAddress = ctcAddress;
    }
    
    public int getCtcID() {
        return ctcID;
    }

    public String getCtcName() {
        return ctcName;
    }

    public String getCtcPhone() {
        return ctcPhone;
    }

    public String getCtcAddress() {
        return ctcAddress;
    }

    public void setCtcName(String ctcName) {
        this.ctcName = ctcName;
    }

    public void setCtcPhone(String ctcPhone) {
        this.ctcPhone = ctcPhone;
    }

    public void setCtcAddress(String ctcAddress) {
        this.ctcAddress = ctcAddress;
    }
}
