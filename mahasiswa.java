package edu.uph.SIAK.model;

public class mahasiswa {
    /* Nama Mahaiswa */
    String nama;
    /* Nomor induk mahasiswa */    
    String studentID;
    /* Jen is Kelamin jika 1 Wawnita, 0 Pria */
    boolean jenisKelamin;
    
    boolean vr;

    public mahasiswa() {
    }

    public mahasiswa(String nama, String studentID, boolean jenisKelamin, boolean
    vr){
        this.nama=nama;
        this.studentID = studentID;
        this.jenisKelamin = jenisKelamin;
        this.vr = vr;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public boolean isJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setvr(boolean vr) {
        this.vr = vr;
    }

    public boolean isvr() {
        return this.vr;
    }

    public boolean getvr() {
        return this.vr;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t" +
            " " + getStudentID() + "\t\t" +
            " " + (isJenisKelamin()==true ? "Wanita":"Pria") + "\t\t\t" +
            " " + (isvr()==true ? "Hadir":"Absen");
    }

    
}