package SinglyLinkedList;

import SinglyLinkedList.SinglyLinkedList;

public class TestSinglyLinkedList {
        public static void main(String[] args) {
                SinglyLinkedList linkedList=new SinglyLinkedList();
                System.out.println("****** ADDING DATA TO LINKED LIST ******");
                linkedList.add(1);
                linkedList.add("JHON");
                linkedList.add("SMITH");


                System.out.println("****** SIZE OF LINKED LIST AFTER ADDING ELEMENT : " +linkedList.size() +" ******");


                System.out.println("SINGLY LINKED LIST : "+linkedList);
        }


}