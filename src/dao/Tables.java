/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Tharusha
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //    st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar (200),password varchar(200),adress varchar(200))");
            //   st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,adress) values('Admin','Admin','12-12-2002','077200300','admin@gmail.com','admin','2036','Sri Lanka')");
            st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueID varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
