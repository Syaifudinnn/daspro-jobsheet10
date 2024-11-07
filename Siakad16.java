import java.util.Scanner;

public class Siakad16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //inputkan jumlah mahasiswa dan jumlah matkul
        System.out.print("Masukkan jumlah mahasiswa\t : ");
        int jmlMhs = input.nextInt();

        System.out.print("Masukkan jumlah matkul\t : ");
        int jmlMatkul = input.nextInt();

        System.out.println();

        //deklarasi array 2 dimensi berdasarkan inputan
        int[][] nilai = new int[jmlMhs][jmlMatkul];

        //mengisi array dan menghitung rata2 nilai tiap siswa
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata2 : " + totalPerSiswa / jmlMatkul);
        }

        System.out.println("\n==========================================\n");

        //hitung rata2 tiap matkul
        System.out.println("Rata-rata silai setiap matkul : ");

        for (int i = 0; i < jmlMatkul; i++) {
            double totalPerMatkul = 0;

            for (int j = 0; j < jmlMhs; j++) {
                totalPerMatkul += nilai[j][i];
            }

            System.out.println("Mata kuliah " + (i + 1) + " : " + totalPerMatkul / jmlMhs);
        }



    }

}

