/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.mycput.jdbcuniapp.applicant;

/**
 *
 * @author imaad
 */
public class Applicant {
    private String inst, crs, studNum;
    private int aps, math, afr, xho, eng, phy, lfsc, geo, acc, bus, lo;

    public Applicant() {
    }

    public Applicant(String inst, String crs, String studNum, int math, int afr, int xho, int eng, int phy, int lfsc, int geo, int acc, int bus, int lo) {
        this.inst = inst;
        this.crs = crs;
        this.studNum = studNum;
        this.math = math;
        this.afr = afr;
        this.xho = xho;
        this.eng = eng;
        this.phy = phy;
        this.lfsc = lfsc;
        this.geo = geo;
        this.acc = acc;
        this.bus = bus;
        this.lo = lo;
    }
    
    

    public Applicant(String studNum, int math, int afr, int xho, int eng, int phy, int lfsc, int geo, int acc, int bus, int lo) {
        this.studNum = studNum;
        this.math = math;
        this.afr = afr;
        this.xho = xho;
        this.eng = eng;
        this.phy = phy;
        this.lfsc = lfsc;
        this.geo = geo;
        this.acc = acc;
        this.bus = bus;
        this.lo = lo;
    }

    public Applicant(String crs, String studNum) {
        this.crs = crs;
        this.studNum = studNum;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }
    

    public String getCrs() {
        return crs;
    }

    public void setCrs(String crs) {
        this.crs = crs;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }

    
    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getAfr() {
        return afr;
    }

    public void setAfr(int afr) {
        this.afr = afr;
    }

    public int getXho() {
        return xho;
    }

    public void setXho(int xho) {
        this.xho = xho;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getLfsc() {
        return lfsc;
    }

    public void setLfsc(int lfsc) {
        this.lfsc = lfsc;
    }

    public int getGeo() {
        return geo;
    }

    public void setGeo(int geo) {
        this.geo = geo;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    @Override
    public String toString() {
        return "Applicant{" + "inst=" + inst + ", crs=" + crs + ", studNum=" + studNum + ", math=" + math + ", afr=" + afr + ", xho=" + xho + ", eng=" + eng + ", phy=" + phy + ", lfsc=" + lfsc + ", geo=" + geo + ", acc=" + acc + ", bus=" + bus + ", lo=" + lo + '}';
    }
    
    
    
}
