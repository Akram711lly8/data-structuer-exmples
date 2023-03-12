package qilab7;

public class fuction {
    public static Stack<Integer> transfer(Stack<Integer> stack1, Stack<Integer> stack2){


        stack2 = stackPush(stack1);

        System.out.println("Stack transfered successfully: "+ stack2);

        return stack2;

    }
}
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        Stack<Integer> finalStack = transfer(stack1, stack2);



    }



}