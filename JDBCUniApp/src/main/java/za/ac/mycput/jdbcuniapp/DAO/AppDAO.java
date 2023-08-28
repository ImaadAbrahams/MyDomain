/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.mycput.jdbcuniapp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import za.ac.mycput.jdbcuniapp.applicant.Applicant;
import za.ac.mycput.jdbcuniapp.dbconnection.DBConnection;

/**
 *
 * @author imaad
 */
public class AppDAO {
    private Connection conn;
    
    public AppDAO(){
        try{
            conn = DBConnection.getConnection();
            System.out.println("Connectionn established...");
            
            //String create_Table_stmt="create table Application (id INTEGER GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY, Institution_ID VARCHAR(30), Course_ID VARCHAR(30), Stud_Exam_Num VARCHAR(30), English VARCHAR(30), Afrikaans VARCHAR(30), Xhosa VARCHAR(30), Mathematics VARCHAR(30), Phys_Sci VARCHAR(30), Life_Sc VARCHAR(30), Geography VARCHAR(30), Accounting VARCHAR(30), Business VARCHAR(30), Life_Orientation VARCHAR(30), timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            //Statement s = conn.createStatement();
            //s.executeUpdate(create_Table_stmt);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    /*
    public void populateComboBox(JComboBox cbox){
        Statement stmt = null;
        String sql = "SELECT * from Applicants";
        ResultSet rs = null;
        
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                cbox.addItem(rs.getString(1));
            }
            
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "Error: " + sqle);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:" + e);
        }
        finally{
            try{
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            }catch(SQLException sqle){
                
            }
        }
        
    }
    */
    public boolean authenticate(Applicant user){
        boolean valid = true;
        PreparedStatement pstmt = null;
        try{
            String getAllSql = "Select * from Applicants";
            pstmt = this.conn.prepareStatement(getAllSql);
            ResultSet rs = pstmt.executeQuery();
            if (rs!=null) {
                while(rs.next() ){
                    
                    System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5));
                    Applicant test = new Applicant(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5), rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getInt(10),rs.getInt(11));
                    if (test.toString().equals(user.toString())) {
                        valid = false;
                        break;
                    }else{
                        valid = true;
                    }
                }
            }
                    
        }catch(SQLException e){
            System.out.println("SQL exception: authenticate");
        }catch(Exception e){
            System.out.println("Other exception: authenticate");
        }
        return valid;
        
        
    }
    
    public void saveApplication(Applicant ap){
        int ok;
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO Application (Institution_ID, Course_ID, Stud_Exam_Num, English, Afrikaans, Xhosa, Mathematics, Phys_Sci, Life_Sc, Geography, Accounting, Business, Life_Orientation)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, ap.getInst());
            ps.setString(2, ap.getCrs());
            ps.setString(3, ap.getStudNum());
            ps.setInt(4, ap.getEng());
            ps.setInt(5, ap.getAfr());
            ps.setInt(6, ap.getXho());
            ps.setInt(7, ap.getMath());
            ps.setInt(8, ap.getPhy());
            ps.setInt(9, ap.getLfsc());
            ps.setInt(10, ap.getGeo());
            ps.setInt(11, ap.getAcc());
            ps.setInt(12, ap.getBus());
            ps.setInt(13, ap.getLo());
            ok = ps.executeUpdate();
            
            if (ok>0) {
                //JOptionPane.showMessageDialog(null, "Save successful");
                System.out.println("Save successful");
            }else{
                //JOptionPane.showMessageDialog(null, "Save failed");
                System.out.println("Save failed");
            }
            
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
        
        finally{
            try{
                if (ps!= null) {
                ps.close();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage() + "WARNING:" + JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    public void saveAppStatus(String appId, String crsCode, String status){
        int ok;
        
        PreparedStatement ps = null;
        try{
            String sql = "INSERT INTO Application_Status (Application_Id, Course_Id, Application_Status)VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, appId);
            ps.setString(2, crsCode);
            ps.setString(3, status);
            ok = ps.executeUpdate();
            
            if (ok>0) {
                //JOptionPane.showMessageDialog(null, "UCT: Submission successful");
                System.out.println("UCT: Submission successful");
            }else{
                //JOptionPane.showMessageDialog(null, "UCT: Submission failed");
                System.out.println("UCT: Submission failed");
            }
            
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
        
        finally{
            try{
                if (ps!= null) {
                ps.close();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage() + "WARNING:" + JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    public void closeConnection(){
        try{
            if (conn!=null) {
                conn.close();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage() + "WARNING:" + JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
