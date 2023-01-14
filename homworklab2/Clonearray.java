package homworklab2;

import java.util.Arrays;

public class Clonearray {
    public static void main(String[] args) {
        int[] array={15,24,42,19};
        int[] copyArray= (int[]) array.clone();
        System.out.println(Arrays.toString(copyArray));

    }
}
