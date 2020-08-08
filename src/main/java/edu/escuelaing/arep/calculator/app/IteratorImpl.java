package edu.escuelaing.arep.calculator.app;

import java.util.Iterator;

public class IteratorImpl<Obj> implements Iterator<Obj> {

    Node<Obj> nodeA;

    public IteratorImpl(LinkedList<Obj> list){
        nodeA = list.getHead();
    }

    public boolean hasNext() {
        return nodeA != null;
    }

    public Obj next() {
        Obj value = nodeA.getValue();
        nodeA = nodeA.getNext();
        return value;
    }

    public void remove() {

    }
}
