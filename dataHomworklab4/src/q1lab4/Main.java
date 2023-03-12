package q1lab4;

public class Main {
 
    public static void main(String[] args) {
        equals c1 = new equals (10, 15);
        equals  c2 = new equals (10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}