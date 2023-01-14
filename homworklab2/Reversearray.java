package homworklab2;

public class Reversearray {
    public static void main(String[] args) {
        int[] scuerce={1,2,3,4,5,6,7,8,9,10};

        int[] destimaion = new int[scuerce.length];
        for (int i=0; i<destimaion.length;i++){
            destimaion[i] = scuerce[scuerce.length-1-i];
            System.out.println("Destimation position " +i +"is now" + destimaion[i]);
        }



    }
}
