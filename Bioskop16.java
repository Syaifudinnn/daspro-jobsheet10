public class Bioskop16 {

    public static void main(String[] args) {
        
        //deklarasi array 2 dimensi (baris x kolom)
        String[][] penonton = new String[4][2];

        //isi array
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        //output
        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        //pertanyaan no. 4
        System.out.println("\n" + penonton.length + "\n");
        
        //pertanyaan no. 5
        // for (int i = 0; i < penonton.length; i++) {
        //     System.out.println("Panjang baris ke-" + (i+1) + " : " + penonton[i].length);
        // }

        //pertanyaan no. 6
        // for (String[] barisPenonton : penonton) {
        //     System.out.println("Panjang baris : " + barisPenonton.length);
        // }

        //pertanyaan no.7
        // System.out.println("\nPenonton pada baris ke-3 : ");
        // for (int i = 0; i < penonton[2].length; i++) {
        //     System.out.println(penonton[2][i]);
        // }

        //pertanyaan no. 8
        // System.out.println("\nPenonton pada baris ke-3 : ");
        // for (String i : penonton[2]) {
        //     System.out.println(i);
        // }

        //pertanyaan no. 9
        for (int i = 0; i < penonton.length; i++) {
             System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
        }


    }

}