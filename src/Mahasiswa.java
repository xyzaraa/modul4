import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
String nama, kelas, matkulPraktikum;
int nim;

public Mahasiswa(String nm, String kl, String mat, int ni){
    nama = nm;
    kelas = kl;
    matkulPraktikum = mat;
    nim = ni;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Leekyung", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Jaemin", "3A","Matematika",23232333));
        mhs.put("3", new Mahasiswa("Taehyung", "3B", "Pemrograman", 20256210));

        System.out.print("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa: "+ data.nama +
                                "\nKelas : " + data.kelas+
                                "\nMata Kuliah Praktikum: " + data.matkulPraktikum +
                                "\nNIM : " + data.nim);
        }
    }
}