import java.util.Arrays;

public class CopyTowarray {
    public static void main(String[] args) {
         int [] firstArray= {1,2,3,4};
        int [] secondArray= {5,6,7,8,9,10};
        int  thr= firstArray.length;
        int  fo= secondArray.length;
        int[] three=new int[thr+fo];
        System.arraycopy(firstArray,0,three,0,thr);
        System.arraycopy(secondArray,0,three,thr,fo);
        System.out.println(Arrays.toString(three));


    }
}
