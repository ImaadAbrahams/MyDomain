/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.mycput.jdbcuniapp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import za.ac.mycput.jdbcuniapp.DAO.AppDAO;
import za.ac.mycput.jdbcuniapp.applicant.Applicant;
/**
 *
 * @author imaad
 */
public class AppGui extends JFrame implements ActionListener, ItemListener{
    private JPanel panelT, panelB, panelC, panelR, panelR1, panelR2, panelL, panelL1, panelL2, panelL3;
    private JButton btn, btn2, btn3;
    private JCheckBox cputB, uctB, uwcB;
    private JTextField examNo, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
    private JComboBox crs, mark1, mark2, mark3, mark4, mark5, mark6, mark7, mark8;
    private JLabel title, lbl, lbl2, lbl3;
    private DefaultTableModel tableModel;
    private JTable table;
    private Font ft1;
    private String query, uni, crsCode;
    private String t1,t2,t3,t4, t5,t6,t7,t8;
    private int  math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo;
    private boolean aut;
    private AppDAO dao;
    
    public AppGui(){
        super("PiedPiper");
        
        panelT = new JPanel();
        panelB = new JPanel();
        panelC = new JPanel();
        panelR = new JPanel();
        panelR1 = new JPanel();
        panelR2 = new JPanel();
        panelL = new JPanel();
        panelL1 = new JPanel();
        panelL2 = new JPanel();
        
        title = new JLabel("Application Portal");
        lbl = new JLabel("Select course you would like to apply for: ");
        lbl2 = new JLabel("Enter your marks: ");
        lbl3 = new JLabel("Enter your Student Exam Number: ");
        
        ft1 = new Font("Arial", Font.BOLD, 20);
         
        btn = new JButton("Next");
        btn2 = new JButton("Previous");
        btn3 = new JButton("Submit");
        
        uctB = new JCheckBox("UCT");
        uwcB = new JCheckBox("UWC");
        
        examNo = new JTextField(5);
        txt1 = new JTextField(5);
        txt2 = new JTextField(5);
        txt3 = new JTextField(5);
        txt4 = new JTextField(5);
        txt5 = new JTextField(5);
        txt6 = new JTextField(5);
        txt7 = new JTextField(5);
        //txt8 = new JTextField(10);
        
        crs = new JComboBox(new String[]{"Courses", "Engineering", "IT", "Law", "Accounting", "Commerce"});
        mark1 = new JComboBox(new String[]{"Subject", "Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        mark2 = new JComboBox(new String[]{"Subject","Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        mark3 = new JComboBox(new String[]{"Subject","Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        mark4 = new JComboBox(new String[]{"Subject","Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        mark5 = new JComboBox(new String[]{"Subject","Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        mark6 = new JComboBox(new String[]{"Subject","Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        mark7 = new JComboBox(new String[]{"Subject","Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        //mark8 = new JComboBox(new String[]{"Subject","Math", "Afrikaans", "English", "Xhosa", "Physics", "Life Science", "Geography", "Accounting", "Business", "Life Orientation"});
        
        dao = new AppDAO();
    }
    
    public void setAppGui(){
        
        this.setLayout(new BorderLayout());
        
        title.setFont(ft1);
        title.setForeground(Color.white);
        
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        tableModel.addColumn("University");
        tableModel.addColumn("Course Name");
        tableModel.addColumn("Course deatails");
        tableModel.addRow(new Object[]{"University of the Western Cape", "IT: Computer Science", "BSc: 4 years"});
        tableModel.addRow(new Object[]{"University of the Western Cape", "Engineering", "BSc: 4 years"});
        tableModel.addRow(new Object[]{"University of the Western Cape", "Law", "LLB: 4 years"});
        tableModel.addRow(new Object[]{"University of the Western Cape", "Accounting", "BCom: 3 years"});
        tableModel.addRow(new Object[]{"University of the Western Cape", "Commerce", "BCom: 3 years"});
        tableModel.addRow(new Object[]{"University of Cape Town", "IT: Computer Science", "BSc: 4 years"});
        tableModel.addRow(new Object[]{"University of Cape Town", "Engineering", "BSc: 4 years"});
        tableModel.addRow(new Object[]{"University of Cape Town", "Law", "LLB: 4 years"});
        tableModel.addRow(new Object[]{"University of Cape Town", "Accounting", "BCom: 3 years"});
        tableModel.addRow(new Object[]{"University of Cape Town", "Commerce", "BCom: 3 years"});
        tableModel.addRow(new Object[]{"Stellenbosch University", "IT: Computer Science", "BSc: 4 years"});
        tableModel.addRow(new Object[]{"Stellenbosch University", "Engineering", "BSc: 4 years"});
        tableModel.addRow(new Object[]{"Stellenbosch University", "Law", "LLB: 4 years"});
        tableModel.addRow(new Object[]{"Stellenbosch University", "Accounting", "BCom: 3 years"});
        tableModel.addRow(new Object[]{"Stellenbosch University", "Commerce", "BCom: 3 years"});
        tableModel.addRow(new Object[]{"Cape Peninsula Univeristy of Technology", "IT: Applications Development", "Dip: 3 years"});
        tableModel.addRow(new Object[]{"Cape Peninsula Univeristy of Technology", "Engineering", "BSc: 4 years"});
        tableModel.addRow(new Object[]{"Cape Peninsula Univeristy of Technology", "Law: Paralegal studies", "Bachelors: 3 years"});
        tableModel.addRow(new Object[]{"Cape Peninsula Univeristy of Technology", "Accounting", "Dip: 3 years"});
        tableModel.addRow(new Object[]{"Cape Peninsula Univeristy of Technology", "Commerce: Business and Info Management", "Dip: 3 years"});
        
        btn.setBackground(new Color(60,166,95));
        btn.setForeground(Color.WHITE);
        btn2.setBackground(new Color(163,163,39));
        btn2.setForeground(Color.WHITE);
        btn3.setBackground(new Color(60,166,95));
        btn3.setForeground(Color.WHITE);
        
        crs.addItemListener(this);
        mark1.addItemListener(this);
        mark2.addItemListener(this);
        mark3.addItemListener(this);
        mark3.addItemListener(this);
        mark4.addItemListener(this);
        mark5.addItemListener(this);
        mark6.addItemListener(this);
        mark7.addItemListener(this);
        //mark8.addItemListener(this);
        btn3.addActionListener(this);
        
        panelT.setLayout(new FlowLayout());
        panelT.setBackground(Color.BLUE);
        panelT.add(title);
        
        
        panelL1.setLayout(new FlowLayout());
        panelL1.add(lbl);
        panelL1.add(crs);
        //panelL1.setBackground(new Color(57,122,125));
        
        panelL2.setLayout(new BorderLayout());
        panelL2.add(new JScrollPane(table));
        //panelL2.setBackground(new Color(57,122,125));
        
        panelL.setLayout(new BorderLayout());
        panelL.add(panelL1, BorderLayout.NORTH);
        panelL.add(panelL2, BorderLayout.CENTER);
        
        panelR1.setLayout(new FlowLayout());
        panelR1.add(lbl2);
        
        panelR2.setLayout(new GridLayout(10,2));
        panelR2.add(lbl3);
        panelR2.add(examNo);
        
        panelR2.add(mark1);
        panelR2.add(txt1);
        
        panelR2.add(mark2);
        panelR2.add(txt2);
        
        panelR2.add(mark3);
        panelR2.add(txt3);
        
        panelR2.add(mark4);
        panelR2.add(txt4);
        
        panelR2.add(mark5);
        panelR2.add(txt5);
        
        panelR2.add(mark6);
        panelR2.add(txt6);
        
        panelR2.add(mark7);
        panelR2.add(txt7);
        
        //panelR2.add(mark8);
        //panelR2.add(txt8);
        
        panelR2.add(uctB);
        panelR2.add(uwcB);
        
        panelR2.add(btn3);
        
        panelR.setLayout(new BorderLayout());
        panelR.add(panelR1, BorderLayout.NORTH);
        panelR.add(panelR2, BorderLayout.CENTER);
        
        panelC.setLayout(new FlowLayout());
        panelC.add(panelL, BorderLayout.WEST);
        panelC.add(panelR, BorderLayout.CENTER);
        
        panelB.setLayout(new GridLayout(1,2));
        panelB.add(btn2);
        panelB.add(btn);
        
        panelL.setBackground(new Color(57,122,125));
        panelR.setBackground(new Color(57,122,125));
        panelC.setBackground(new Color(57,122,125));
        
        this.add(panelT, BorderLayout.NORTH);
        this.add(panelC, BorderLayout.CENTER);
        //this.add(panelL, BorderLayout.WEST);
        //this.add(panelR);
        this.add(panelB, BorderLayout.SOUTH);
        
        
        
        
    }
    
    @Override
    public void itemStateChanged(ItemEvent e){
        t1 = mark1.getSelectedItem().toString();
        t2 = mark2.getSelectedItem().toString();
        t3 = mark3.getSelectedItem().toString();
        t4 = mark4.getSelectedItem().toString();
        t5 = mark5.getSelectedItem().toString();
        t6 = mark6.getSelectedItem().toString();
        t7 = mark7.getSelectedItem().toString();
        //t8 = mark8.getSelectedItem().toString();
        
        
        query = crs.getSelectedItem().toString();
        courseFilter(query);
    }
    
    public void courseFilter(String courseQ){
        TableRowSorter<DefaultTableModel> trSorter = new TableRowSorter(tableModel);
        table.setRowSorter(trSorter);
        
        if(courseQ != "Courses"){
            trSorter.setRowFilter(RowFilter.regexFilter(courseQ));
        }else{
            table.setRowSorter(trSorter);
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== btn3){
            if (examNo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter your exam number");
            }else{
            getMarks();
            //If apply for IT/Computer Science
            if(query.equals("IT")){
                if(uctB.isSelected()){
                    String studId = examNo.getText();
                    uctCompSci(studId);
                    uni = "UCT";
                    crsCode = "BSCS1";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
                if(uwcB.isSelected()){
                    String studId = examNo.getText();
                    uwcCompSci(studId);
                    uni = "UWC";
                    crsCode = "BSCS2";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
            //IF applying for Commerce        
            }else if(query.equals("Commerce")){
                if(uctB.isSelected()){
                    String studId = examNo.getText();
                    uctBcom(studId);
                    uni = "UCT";
                    crsCode = "BCOM1";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
                if(uwcB.isSelected()){
                    String studId = examNo.getText();
                    uwcBcom(studId);
                    uni = "UWC";
                    crsCode = "BCOM2";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
            //IF applying for Engineering    
            }else if(query.equals("Engineering")){
                if(uctB.isSelected()){
                    String studId = examNo.getText();
                    uctEng(studId);
                    uni = "UCT";
                    crsCode = "BENG1";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
                if(uwcB.isSelected()){
                    String studId = examNo.getText();
                    uwcEng(studId);
                    uni = "UWC";
                    crsCode = "BENG2";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
            //IF applying for Law    
            }else if(query.equals("Law")){
                if(uctB.isSelected()){
                    String studId = examNo.getText();
                    uctLaw(studId);
                    uni = "UCT";
                    crsCode = "LLB1";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
                if(uwcB.isSelected()){
                    String studId = examNo.getText();
                    uwcLaw(studId);
                    uni = "UWC";
                    crsCode = "LLB2";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
            //IF applting for accounting    
            }else if(query.equals("Accounting")){
                if(uctB.isSelected()){
                    String studId = examNo.getText();
                    uctAcc(studId);
                    uni = "UCT";
                    crsCode = "BCMA1";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
                if(uwcB.isSelected()){
                    String studId = examNo.getText();
                    uwcAcc(studId);
                    uni = "UWC";
                    crsCode = "BCMA2";
                    Applicant ap = new Applicant(uni, crsCode, studId, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo);
                    dao.saveApplication(ap);
                }
            }
            
            System.out.println(math + " " + afr + " " + eng + " " + phy + " " + lfsc + " " + geo + " " + acc);
        }
        }
        if (e.getSource()==btn) {
            dao.closeConnection();
            System.exit(0);
        }
    }
    
    public void getMarks(){
        if(t1.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt1.getText());
        }else if(t1.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt1.getText());
        }
        //t2
        if(t2.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt2.getText());
        }else if(t2.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt2.getText());
        }
        //t3
        if(t3.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt3.getText());
        }else if(t3.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt3.getText());
        }
        //t4
        if(t4.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt4.getText());
        }else if(t4.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt4.getText());
        }
        //t5
        if(t5.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt5.getText());
        }else if(t5.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt5.getText());
        }
        //t6
        if(t6.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt6.getText());
        }else if(t6.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt6.getText());
        }
        //t7
        if(t7.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt7.getText());
        }else if(t7.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt7.getText());
        }
        
        
        
        
        /*t8
        if(t8.equalsIgnoreCase("Math")){
            math = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("English")){
            eng = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("Afrikaans")){
            afr = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("Accounting")){
            acc = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("Life Science")){
            lfsc = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("Geography")){
            geo = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("Physics")){
            phy = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("Life Orientation")){
            lo = Integer.parseInt(txt8.getText());
        }else if(t8.equalsIgnoreCase("Business")){
            bus = Integer.parseInt(txt8.getText());
        }
*/
    }
    
    //Computer science
    public void uctCompSci(String id){
        int aps = 0;
        if(math >= 70 && phy>=60){
            aps = (math*2) + (phy*2)+ geo + lfsc + acc + xho + bus + afr + eng;
            if(aps >= 550){
                JOptionPane.showMessageDialog(null, "UCT: Applied for Bsc(Computer Science)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BSCS1", "Pending");
                //ap2.setCrs("Computer Science");
                //ap2.setStudNum(id);
                //dao.saveUct(ap2);
            }else{
                //JOptionPane.showMessageDialog(null, "UCT: Not Eligible for Bsc(Computer Science)");
                System.out.println("UCT: Not Eligible for Bsc(Computer Science)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BSCS1", "Ineligible");
            }
        }else{
                //JOptionPane.showMessageDialog(null, "UCT: Not Eligible for Bsc(Computer Science)");
                System.out.println("UCT: Not Eligible for Bsc(Computer Science)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BSCS1", "Ineligible");
        }
    }
    public void uwcCompSci(String id){
        int aps = 0;
        if((math >= 60 && phy>=50) || (math >= 60 && lfsc>=50)){
            aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng + lo;
            if(aps >= 480){
                JOptionPane.showMessageDialog(null, "UWC: Applied for Bsc(Computer Science)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BSCS2", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUwc(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for Bsc(Computer Science)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BSCS2", "Ineligible");
            }
        }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for Bsc(Computer Science)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BSCS2", "Ineligible");
        }
    }
    
    
    //Bcom 
    public void uctBcom(String id){
        int aps = 0;
        if(math >= 60 && eng>=50){
            aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng;
            if(aps >= 435){
                JOptionPane.showMessageDialog(null, "UCT: Applied for BCom(Commerce)");
                
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCOM1", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUct(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UCT: Not Eligible for BCom(Commerce)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCOM1", "Ineligible");
            }
        }else{
                JOptionPane.showMessageDialog(null, "UCT: Not Eligible for BCom(Commerce)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCOM1", "Ineligible");
        }
    }
    public void uwcBcom(String id){
        int aps = 0;
        if(math >= 40 && eng>=40){
            aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng + lo;
            if(aps >= 400){
                JOptionPane.showMessageDialog(null, "UWC: Applied for BCom(Commerce)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCOM2", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUwc(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for BCom(Commerce)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCOM2", "Ineligible");
            }
        }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for BCom(Commerce)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCOM2", "Ineligible");
        }
    }
    
    //Engineering
    public void uctEng(String id){
        int aps = 0;
        if(math >= 80 && phy>=70){
            aps = math + phy+ geo + lfsc + acc + xho + bus + afr + eng;
            if(aps >= 420){
                JOptionPane.showMessageDialog(null, "UCT: Applied for BEng(Engineering)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BENG1", "Pending");
                //ap2.setCrs("Computer Science");
                //ap2.setStudNum(id);
                //dao.saveUct(ap2);
            }else{
                //JOptionPane.showMessageDialog(null, "UCT: Not Eligible for Bsc(Computer Science)");
                System.out.println("UCT: Not Eligible for BEng(Engineering)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BENG1", "Ineligible");
            }
        }else{
                //JOptionPane.showMessageDialog(null, "UCT: Not Eligible for Bsc(Computer Science)");
                System.out.println("UCT: Not Eligible for BEng(Engineering)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BENG1", "Ineligible");
        }
    }
    public void uwcEng(String id){
        int aps = 0;
        if(math >= 60 && phy>=50){
            aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng + lo;
            if(aps >= 400){
                JOptionPane.showMessageDialog(null, "UWC: Applied for BEng(Engineering)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BENG2", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUwc(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for BEng(Engineering)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BENG2", "Ineligible");
            }
        }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for BEng(Engineering)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BENG2", "Ineligible");
        }
    }
    
    
    //Law
    public void uctLaw(String id){
        int aps = 0;
        aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng;
            if(aps >= 460){
                JOptionPane.showMessageDialog(null, "UCT: Applied for LLB(Law)");
                
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "LLB1", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUct(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UCT: Not Eligible for LLB(Law)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "LLB1", "Ineligible");
            }
        
    }
    public void uwcLaw(String id){
        int aps = 0;
        if(math >= 40){
            aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng + lo;
            if(aps >= 500){
                JOptionPane.showMessageDialog(null, "UWC: Applied for LLB(Law)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "LLB2", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUwc(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for LLB(Law)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "LLB2", "Ineligible");
            }
        }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for LLB(Law)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "LLB2", "Ineligible");
        }
    }
    
    //Accounting
    public void uctAcc(String id){
        int aps = 0;
        if(math >= 60 && eng>=50){
            aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng;
            if(aps >= 435){
                JOptionPane.showMessageDialog(null, "UCT: Applied for BCom(Accounting)");
                
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCMA1", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUct(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UCT: Not Eligible for BCom(Accounting)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCMA1", "Ineligible");
            }
        }else{
                JOptionPane.showMessageDialog(null, "UCT: Not Eligible for BCom(Accounting)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCMA1", "Ineligible");
        }
    }
    public void uwcAcc(String id){
        int aps = 0;
        if(math >= 40 && eng>=40){
            aps = math + phy + geo + lfsc + acc + xho + bus + afr + eng + lo;
            if(aps >= 400){
                JOptionPane.showMessageDialog(null, "UWC: Applied for BCom(Accounting)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCMA2", "Pending");
                //ap.setCrs("Bachelors in Commerce");
                //ap.setStudNum(id);
                //dao.saveUwc(ap);
            }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for BCom(Accounting)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCMA2", "Ineligible");
            }
        }else{
                JOptionPane.showMessageDialog(null, "UWC: Not Eligible for BCom(Accounting)");
                Applicant ap2 = new Applicant();
                dao.saveAppStatus(id, "BCMA2", "Ineligible");
        }
    }
    
}
