package qilab7;

public class Transfer {

    public static Stack<Integer> stackPush(Stack<Integer> stack){

        for(int i = 0; i < 5; i++){

            Integer push = (Integer) stack.push(i);

            System.out.println(push);
        }
        return stack;

    }

    public static void pop(Stack<Integer> stack){

        for(int i = 0; i < 5; i++){

            Integer pop = (Integer) stack.pop();
            System.out.println(pop);


        }

    }


    public static void peek(Stack<Integer> stack){

        Integer peek = (Integer) stack.peek();

        System.out.println("Top of the element is: " + peek);

    }


    public static void search(Stack<Integer> stack, int element){

        System.out.println("Element searched is: ");

        Integer search = (Integer) stack.search(element);

        if(element == -1){

            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("Element is: " + search);
        }


    }
