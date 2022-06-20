import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] nomi = {"Simone", "Carlo", "Luca", "Giuseppe", "Tiziano",
                "Aurora", "Emma", "Danilo", "Elena", "Mirco"};
        System.out.println("Array before sorting: "+Arrays.toString(nomi) + "\n");
        System.out.println("Sorting...\n");

        for(int i = 0; i < nomi.length; i++)
        {
            for(int j = i+1; j < nomi.length; j++) {
                if (nomi[i].compareTo(nomi[j]) > 0) {
                    //swapping array elements
                    String temp = nomi[i];
                    nomi[i] = nomi[j];
                    nomi[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting: "+Arrays.toString(nomi));
    }
}
