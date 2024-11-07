import java.util.Arrays;

public class Numbers16 {
    
    public static void main(String[] args) {
        
        //deklarasi array 2 dimensi
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        //pertanyaan no. 1
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        //pertanyaan no. 2
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + myNumbers[i].length);
        }

    }

}
