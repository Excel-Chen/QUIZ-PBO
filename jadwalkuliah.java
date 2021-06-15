package edu.uph.SIAK.model;

import java.util.ArrayList;
import java.util.Scanner;

public class jadwalkuliah {
    ArrayList<mahasiswa> Mahasiswa = new ArrayList<mahasiswa>();
    dosen Dosen;
    matakuliah Matakuliah;
    //ruangan


    public jadwalkuliah() {
    }


    public jadwalkuliah(ArrayList<mahasiswa> Mahasiswa, dosen Dosen, matakuliah Matakuliah) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
    }


    public ArrayList<mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public dosen getDosen() {
        return this.Dosen;
    }

    public void setDosen(dosen Dosen) {
        this.Dosen = Dosen;
    }

    public matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }



    public void tambahMahasiswa(mahasiswa mhs){
        Mahasiswa.add(mhs);
    }

    dosen dsn1 = new dosen("Fery Panggabean","fery.panggabean@lecturer.uph.edu");
    dosen dsn2 = new dosen("Ade Maulana","ade.maulana@lecturer.uph.edu");
    dosen dsn3 = new dosen("Bretlan","bretlan.mdn@lecturer.uph.edu");
    
    matakuliah mata1 = new matakuliah("Bahasa Indonesia","17:30 - 21:00 WIB");
    matakuliah mata2 = new matakuliah("Pemrograman Berorientasi Objek","17:30 - 20:10 WIB");
    matakuliah mata3 = new matakuliah("Filsafat Ilmu Pengetahuan","17:30 - 21:00 WIB");

    Scanner Input = new Scanner(System.in);

    public void tampilkanJadwalKuliah(){
        char yn = 'n';
        do{
            System.out.println("Jadwal Mata Kuliah : ");
            System.out.println("====================");
            System.out.println("    1. Bahasa Indonesia");
            System.out.println("    2. Pemrograman Berorientasi Objek (PBO)");
            System.out.println("    3. Filsafat Ilmu Pengetahuan (FIP)");
            System.out.println("Jadwal yang ingin dilihat ?? ");
            int i = Input.nextShort();
            if (i==1){
                System.out.println("Jadwal Kuliah B.Indo");
                System.out.println("====================");
                System.out.println(mata1.toString());
                System.out.println(dsn1.toString());
                System.out.println("Kelas : 20TI2");
                System.out.println("================");
                System.out.println("Daftar Mahasiswa ");
                System.out.println("================");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin \t\t Absensi Perkuliahan");
                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else if (i==2){
                System.out.println("Jadwal Kuliah PBO ");
                System.out.println("=================");
                System.out.println(mata2.toString());
                System.out.println(dsn2.toString());
                System.out.println("Kelas : 20TI2");
                System.out.println("================");
                System.out.println("Daftar Mahasiswa ");
                System.out.println("================");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin \t\t Absensi Perkuliahan");
                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else if (i==3){
                System.out.println("Jadwal Kuliah Filsafat");
                System.out.println("======================");
                System.out.println(mata3.toString());
                System.out.println(dsn3.toString());
                System.out.println("Kelas : 20TI2");
                System.out.println("================");
                System.out.println("Daftar Mahasiswa ");
                System.out.println("================");
                System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin \t\t Absensi Perkuliahan");
                for(mahasiswa mhs : Mahasiswa){
                    System.out.println(mhs.toString());
                }
            }
            else {
                System.out.println("Pilihan yang ada hanya [ 1 - 3 ]");
            }
            System.out.println("Repeat This Program ? [y / n] :"); 
            Input.nextLine();
            String yesno = Input.nextLine();
            yn = yesno.charAt(0);
        }while(yn == 'y' || yn == 'Y');
        Input.close();
   }
   }