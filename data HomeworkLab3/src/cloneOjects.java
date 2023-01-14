import java.util.Arrays;

public class cloneOjects {

    private static int Student;

    public static class Student {
        String name;
        int  id;
    }


    public   static void main(String[] args) {
        Student[] arr = new Student[20];
        for (int i=0; i< arr.length;i++){
            arr[i] = new Student();
        }
        arr[0].name="Akram";
        arr[0].id=1526;

        arr[1].name="ALi";

        System.out.println(arr[0].name);
        System.out.println(arr[0].id);
    }

}
