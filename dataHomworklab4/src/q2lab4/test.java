package q2lab4;

public class test {
    public static void main(String[] args)
    {
        LinkedList p = new LinkedList();

        p.push(12);
        p.push(29);
        p.push(11);
        p.push(23);
        p.push(8);
        System.out.println(p.findSecondLastNode(p.start));
    }
}

