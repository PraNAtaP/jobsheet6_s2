import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMHS = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19(jumMHS);

        for (int i = 0; i < jumMHS; i++) {
            System.out.println("Input data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa19 m = new Mahasiswa19(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        list.tampil();

        System.out.println("----------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan IPK Mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("----------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("----------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMHS - 1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
        sc.close();
    }
}
