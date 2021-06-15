import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;

public class App {
    public static void main(String[] args) throws Exception {
    
        mahasiswa mhs1 = new mahasiswa("Excel Excel", "03082000002",false,true);
        mahasiswa mhs2 = new mahasiswa("Steven.R", "01210121",false,true);
        mahasiswa mhs3 = new mahasiswa("Richard.H", "01210121",false,true);
        mahasiswa mhs4 = new mahasiswa("Elvia Elvia", "01210121",true,true);
        mahasiswa mhs5 = new mahasiswa("Richard.T", "01210121",false,true);
        mahasiswa mhs6 = new mahasiswa("SriRahayu", "01210121",true,true);
        mahasiswa mhs7 = new mahasiswa("Felix.L", "01210121",false,true);
        mahasiswa mhs8 = new mahasiswa("Fernando", "01210121",false,true);
        mahasiswa mhs9 = new mahasiswa("Andrean.H", "01210121",false,true);
        mahasiswa mhs10 = new mahasiswa("William", "01210121",false,true);
        mahasiswa mhs11 = new mahasiswa("Yordan.T", "01210121",false,true);
        mahasiswa mhs12 = new mahasiswa("Ricky Ricky", "01210121",false,true);
        mahasiswa mhs13 = new mahasiswa("Calvin.W", "01210121",false,true);
        mahasiswa mhs14 = new mahasiswa("Robert.W", "01210121",false,true);
        
        jadwalkuliah JadwalKuliah = new jadwalkuliah();

        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);
        JadwalKuliah.tambahMahasiswa(mhs4);
        JadwalKuliah.tambahMahasiswa(mhs5);
        JadwalKuliah.tambahMahasiswa(mhs6);
        JadwalKuliah.tambahMahasiswa(mhs7);
        JadwalKuliah.tambahMahasiswa(mhs8);
        JadwalKuliah.tambahMahasiswa(mhs9);
        JadwalKuliah.tambahMahasiswa(mhs10);
        JadwalKuliah.tambahMahasiswa(mhs11);
        JadwalKuliah.tambahMahasiswa(mhs12);
        JadwalKuliah.tambahMahasiswa(mhs13);
        JadwalKuliah.tambahMahasiswa(mhs14);

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}