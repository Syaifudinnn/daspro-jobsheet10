import java.util.Scanner;

public class BioskopWithScanner16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int baris, kolom;
        String nama, next;

        //deklarasi array
        String[][] penonton = new String[4][2];

        //logic
        while (true) {
            System.out.print("Masukkan nama\t : ");
            nama = input.nextLine();

            while (true) {
                System.out.print("Masukkan baris\t : ");
                baris = input.nextInt();

                System.out.print("Masukkan kolom\t : ");
                kolom = input.nextInt();    
                input.nextLine();

                // Cek apakah baris dan kolom tersedia
                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                    System.out.println("Baris atau kolom tidak tersedia. Silakan masukkan baris 1-" + penonton.length + 
                    " dan kolom 1-" + penonton[0].length + ".");
                } 
                else if (penonton[baris - 1][kolom - 1] != null) {
                    // Cek apakah kursi sudah terisi
                    System.out.println("Peringatan: Kursi sudah terisi! Silakan pilih kursi lain.");
                } 
                else {
                    // Jika kursi kosong, masukkan nama
                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                }
            }

            // Tanya apakah pengguna ingin memasukkan penonton lain
            System.out.print("Input penonton lainnya (y/n) : ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }

        }

        //output
        System.out.println("\nDaftar Penonton : ");

        for (int i = 0; i < penonton.length; i++) {

            System.out.printf("Baris %d: ", i + 1);

            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.print(penonton[i][j] + "\t");
                } 
                else {
                    System.out.print("***\t");
                }
            }

            System.out.println();
        }

    }

}
