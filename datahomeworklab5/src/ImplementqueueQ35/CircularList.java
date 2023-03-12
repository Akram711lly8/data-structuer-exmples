package ImplementqueueQ35;

public class CircularList<T> {
    Element<T> first=null;

    public void add(Element<T> e){
        if (first==null){
            first=e;
            e.next=e;
            e.previous=e;
        } 
        else { //add to the end;
            first.previous.next=e;
            e.previous = first.previous;
            first.previous=e;
            e.next=first;
        }
    }

    public boolean equals(Object o){
        // TODO
    }
}