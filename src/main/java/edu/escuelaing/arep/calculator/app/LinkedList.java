package edu.escuelaing.arep.calculator.app;

import java.util.Iterator;

public class LinkedList<Obj> implements Iterable<Obj> {
    Node<Obj> head,tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addNodeRight(Obj x){
        Node<Obj> node = new Node<Obj>(x,null,null);
        if (tail == null) {
            head = tail = node;
        }else{
            tail.setNext(node);
            node.setPrior(tail);
            tail = node;
        }
        size+=1;
    }
    public void addNodeLeft(Obj x){
        Node<Obj> node = new Node<Obj>(x,null,null);
        if (head == null){
            head = tail = node;
        }else {
            head.setPrior(node);
            node.setNext(head);
            head = node;
        }
        size+=1;
    }

    public Obj removeNodeRight() throws ListException {
        if (tail == null){
            throw new ListException(ListException.EMPTY_LIST);
        }
        Obj value = tail.getValue();
        if (tail.equals(head)){
            tail = head = null;
        }else{
            Node<Obj> penult = tail.getPrior();
            penult.setNext(null);
            tail = penult;
        }
        size-=1;
        return value;
    }


    public Node<Obj> getHead() {
        return head;
    }

    public void setHead(Node<Obj> head) {
        this.head = head;
    }

    public Node<Obj> getTail() {
        return tail;
    }

    public void setTail(Node<Obj> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Iterator<Obj> iterator() {
        return new IteratorImpl<Obj>(this);
    }



}
