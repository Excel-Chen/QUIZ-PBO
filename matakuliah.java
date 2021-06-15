package edu.uph.SIAK.model;

public class matakuliah{
    String matkul;
    String pukul;

    public matakuliah() {
    }

    public matakuliah(String matkul, String pukul) {
        this.matkul = matkul;
        this.pukul = pukul;
    }

    public String getMatkul() {
        return this.matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getPukul() {
        return this.pukul;
    }

    public void setPukul(String pukul) {
        this.pukul = pukul;
    }

    public matakuliah matkul(String matkul) {
        setMatkul(matkul);
        return this;
    }

    public matakuliah pukul(String pukul) {
        setPukul(pukul);
        return this;
    }
    @Override
    public String toString() {
        return 
            "Mata Kuliah = " + getMatkul() + "\n" +
            "Pukul = " + getPukul();
    }


}