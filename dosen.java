package edu.uph.SIAK.model;

public class dosen {
    String namaDosen;
    String emailDosen;

    public dosen() {
    }

    public dosen(String namaDosen, String emailDosen) {
        this.namaDosen = namaDosen;
        this.emailDosen = emailDosen;
    }

    public String getNamaDosen() {
        return this.namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getEmailDosen() {
        return this.emailDosen;
    }

    public void setEmailDosen(String emailDosen) {
        this.emailDosen = emailDosen;
    }

    public dosen namaDosen(String namaDosen) {
        setNamaDosen(namaDosen);
        return this;
    }

    public dosen emailDosen(String emailDosen) {
        setEmailDosen(emailDosen);
        return this;
    }
    @Override
    public String toString() {
        return 
            "Dosen = " + getNamaDosen() + "\n" +
            "Email Dosen = " + getEmailDosen();
    }

}
