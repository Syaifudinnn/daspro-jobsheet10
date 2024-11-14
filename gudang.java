import java.util.Scanner;

public class gudang {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input jumlah jenis barang, jumlah lokasi penyimpanan
        System.out.print("Masukkan jumlah jenis barang : ");
        int jmlJenis = input.nextInt();

        System.out.print("Masukkan jumlah lokasi penyimpanan : ");
        int jmlLokasi = input.nextInt();
        input.nextLine();

        //deklarasi array
        int[][] stok = new int[jmlJenis][jmlLokasi];
        String[] kota = new String[jmlLokasi];

        //input nama kota utk setiap lokasi -----------------------------------------------------------
        System.out.println("Masukkan nama kota untuk setiap lokasi : ");
        for (int i = 0; i < jmlLokasi; i++) {
            System.out.print("Kota untuk lokasi " + (i+1) + " : ");
            kota[i] = input.nextLine();
        }

        System.out.println("");

        //isi stok barang -----------------------------------------------------------------------------
        System.out.println("Mengisi stok barang...");

        char jawab;
        do {
            //masukkan jenis barang
            System.out.print("Jenis barang (1-" + jmlJenis + ") : ");
            int jenisBarang = input.nextInt();

            //masukkan lokasi
            System.out.print("Lokasi (1-" + jmlLokasi + ") : ");
            int lokasi = input.nextInt();

            //tambah stok
            System.out.print("Tambah stok : ");
            int jumlah = input.nextInt();
            input.nextLine();

            //tambah jumlah ke dalam array stok
            stok[jenisBarang][lokasi] += jumlah;

            System.out.print("Ingin tambah stok lagi (y/n) : ");
            jawab = input.next().charAt(0);
        } while (jawab == 'y' || jawab == 'Y');

        //tabel stok gudang -------------------------------------------------------------------------
        //nama kota
        System.out.println("\nTabel Stok Gudang : ");
        System.out.print("           ");
        for (String namaKota : kota) {
            System.out.printf("%-10s", namaKota);
        }
        System.out.println();

        //jumlah barang
        for (int i = 0; i < jmlJenis; i++) {
            System.out.print("Barang " + (i+1) + " : ");
            for (int j = 0; j < jmlLokasi; j++) {
                System.out.printf("%-10d", stok[i][j]);
            }
            System.out.println();
        }

        //hitung total stok setiap barang -----------------------------------------------------------
        System.out.println("\nTotal stok untuk setiap jenis barang : ");
        for (int i = 0; i < jmlJenis; i++) {
            int totalStok = 0;
            for (int j = 0; j < jmlLokasi; j++) {
                totalStok += stok[i][j];
            }
            System.out.println("Jenis barang ke " + (i+1) + " : " + totalStok);
        }

        //lokasi dengan stok terbanyak --------------------------------------------------------------
        System.out.println("\nLokasi dengan stok terbanyak untuk setiap jenis barang : ");
        for (int i = 0; i < jmlJenis; i++) {
            int total = 0;
            int lokasiTerbanyak = -1;
            //bandingkan total dari setiap lokasi
            for (int j = 0; j < jmlLokasi; j++) {
                if (stok[i][j] > total) {
                    total = stok[i][j];
                    lokasiTerbanyak = j;
                }
            }
            //cek lokasi stok terbanyak
            if (lokasiTerbanyak == -1) {
                System.out.println("Jenis barang ke-" + (i + 1) + ": Tidak ada stok");
            } 
            else {
                System.out.println("Jenis barang ke-" + (i + 1) + ": " + kota[lokasiTerbanyak]);
            }
        }

    }

}
