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
            Node penult = tail.getPrior();
            penult.setNext(null);
            tail = penult;
        }
        size-=1;
        return value;
    }

    public Double getElementByIndex(int i){
        return ans.get(i);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public List<Double> getAns() {
        return ans;
    }

    public void setAns(List<Double> ans) {
        this.ans = ans;
    }

    public Iterator<Obj> iterator() {
        return null;
    }
}
